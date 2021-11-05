
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MULibrary extends JFrame implements ActionListener {
  private JLabel isbnLabel, titleLabel;
  private JTextField isbnTF, titleTF;
  private JButton addBook, searchMU, searchAR;
  
  
  
  public MULibrary() {
    setTitle("MU Library");
    isbnLabel = new JLabel("ISBN:");
    isbnTF = new JTextField(15);
    titleLabel = new JLabel("Title:");
    titleTF = new JTextField(15);
    JPanel nGridPanel = new JPanel();
    nGridPanel.setLayout(new GridLayout(2,2));
    nGridPanel.add(isbnLabel);
    nGridPanel.add(isbnTF);
    nGridPanel.add(titleLabel);
    nGridPanel.add(titleTF);
    JPanel nPanel = new JPanel();
    nPanel.add(nGridPanel);
    add(nPanel, BorderLayout.NORTH);
    
    addBook = new JButton("Add New Book");
    addBook.addActionListener(this);
    searchMU = new JButton("Search ISBN - MU Library");
    searchMU.addActionListener(this);
    searchAR = new JButton("Search ISBN - Arlington Library");
    searchAR.addActionListener(this);
    
    JPanel sPanel = new JPanel();
    sPanel.add(addBook);
    sPanel.add(searchMU);
    sPanel.add(searchAR);
    add(sPanel, BorderLayout.SOUTH);
    
    setSize(700,150);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  } 
  
  
  
  public void actionPerformed(ActionEvent event) {
    
    if(event.getSource() == addBook) { 
      String isbn = isbnTF.getText();  
      String title = titleTF.getText();
      
      String insertCommand = "insert into book (isbn, title) values ('" + isbn + "', '" + title + "')";
      System.out.println(insertCommand); 
      
     
      String URL = "jdbc:mysql://localhost/mulibrary?user=root&password=";
      try {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connected to JDBC!!!");
      
       
        Connection con = DriverManager.getConnection(URL);
        System.out.println("Connected to MySQL!!!"); 
         
       
        Statement stmt = con.createStatement();
        stmt.execute(insertCommand); 
        System.out.println("Insert Successfully!!!");
        String output = "The following book is successfully added to MU Library.\nISBN: " + isbn + "\nTitle: " + title;
        JOptionPane.showMessageDialog(null, output);
      }
      catch(ClassNotFoundException cnfe) {
        System.out.println(cnfe.toString());
      }
      catch(SQLException sqle) {
        System.out.println(sqle.toString());
      }
    }
  
    
    if(event.getSource() == searchMU) {
      String isbn = isbnTF.getText();  
      String title = titleTF.getText();
      String error = "";
      
      String insertCommand = "insert into book (isbn, title) values ('" + isbn + "', '" + title + "')";
      System.out.println(insertCommand); 
      
      String URL = "jdbc:mysql://localhost/mulibrary?user=root&password=";
      try {
         Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connected to JDBC!!!"); 
        Connection con = DriverManager.getConnection(URL);
        System.out.println("Connected to MySQL!!!"); 
        
        Statement stmt = con.createStatement();
        stmt.execute(insertCommand);
        System.out.println("Available at MU Library");
        String output = "Available at MU Library.\nISBN: " + isbn + "\nTitle: " + title; 
        JOptionPane.showMessageDialog(null, output);
      }
      catch(ClassNotFoundException cnfe) {
        error = "error";
         String output = "is not available at MU Library.\nISBN: " + isbn + "\nTitle: " + title; 
        JOptionPane.showMessageDialog(null, output);
        System.out.println(cnfe.toString());
      }
      catch(SQLException sqle) {
        System.out.println(sqle.toString());
      }
      
      
       
    }
  } 
  
  
  public static void main(String [] args) {
    MULibrary m = new MULibrary();
  }
  
  
  
} 