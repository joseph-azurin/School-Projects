import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ARLibraryServer {
  
  private ServerSocket serverSocket; 
  private Socket socket, socket2;
  private ObjectInputStream input; 
  private ObjectOutputStream output; 
  
  public ARLibraryServer() {
    System.out.println("Arlington Library Server is running...");
      
    try {
      serverSocket = new ServerSocket(1098, 500); 
      while(true) {
        
        socket = serverSocket.accept();
        input = new ObjectInputStream(socket.getInputStream());
        String isbn = (String) input.readObject();
        String selectCommand = "select title from book where isbn = '" + isbn + "';";
        System.out.println(selectCommand); 
        String URL = "jdbc:mysql://localhost/arlibrary?user=root&password=";
        String title = ""; 
        try {
          Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Connected to JDBC!!!"); 
          Connection con = DriverManager.getConnection(URL);
          System.out.println("Connected to MySQL!!!"); 
          Statement stmt = con.createStatement();
          ResultSet results = stmt.executeQuery(selectCommand); 
          while(results.next()) {
            title = results.getString(1);
          }
    
          System.out.println(title);
          
        }
        catch(ClassNotFoundException cnfe) {
          System.out.println(cnfe.toString());
        }
        catch(SQLException sqle) {
          System.out.println(sqle.toString());
        }
        
        socket2 = new Socket(InetAddress.getByName("localhost"), 1097);
        output = new ObjectOutputStream(socket2.getOutputStream());
        output.writeObject(title);
        output.flush();
       
      } 
    }
    catch(IOException ioe) {
      System.out.println(ioe.toString());
    }
    catch(ClassNotFoundException cnfe) {
      System.out.println(cnfe.toString());
    }
  }
  
  public static void main(String [] args) {
    ARLibraryServer tcp = new ARLibraryServer();
  }
}