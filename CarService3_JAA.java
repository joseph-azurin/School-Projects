import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CarService3_JAA extends JFrame implements ActionListener {
  private JLabel amountLabel, typeLabel;
  private JTextField amountText;
  private JCheckBox carwash, oilchange;
  private JButton payserviceButton, printreceiptButton, clearButton;
  private JPanel cPanel, typePanel, sPanel;
  private ButtonGroup typeGroup;
  private String amount, type1, type2, output, output1;
  
  public CarService3_JAA() {
    super("Car Service System");
    amountLabel = new JLabel("Enter amount in dollars for gas purchase($):");
    amountText = new JTextField(5);
    JPanel amountPanel = new JPanel();
    amountPanel.add(amountLabel);
    amountPanel.add(amountText);
    add(amountPanel, BorderLayout.NORTH);
    
    carwash = new JCheckBox("$10.00 Car Wash");
    oilchange = new JCheckBox("$30.00 Oil Change");
    typePanel = new JPanel();
    typePanel.setLayout(new GridLayout(2,1)); 
    typePanel.add(carwash); 
    typePanel.add(oilchange); 
    cPanel = new JPanel(); 
    cPanel.add(typePanel);
    add(cPanel, BorderLayout.CENTER);
    
    sPanel = new JPanel();
    payserviceButton = new JButton("Pay Service");
    payserviceButton.addActionListener(this);
    printreceiptButton = new JButton("Print Receipt");
    printreceiptButton.addActionListener(this);
    clearButton = new JButton("Clear");
    clearButton.addActionListener(this);
    sPanel.add(payserviceButton);
    sPanel.add(printreceiptButton);
    sPanel.add(clearButton);
    add(sPanel, BorderLayout.SOUTH);
    setSize(400,200);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
 
  public void actionPerformed(ActionEvent event) {
    if(event.getSource() == payserviceButton) {
      amount = amountText.getText();
      type1 = "No";
      type2 = "No";
      if(carwash.isSelected()) {
        type1 = "Yes";
      }
      if(oilchange.isSelected()) {
        type2 = "Yes";
      }
     
      String output = "Gas Amount: $" + amount +
                      "\nCar Wash: " + type1 +
                      "\nOil Change: " + type2;
      File file = new File("receipt.txt");
    try{
      FileWriter writer = new FileWriter(file, true);
      writer.write(output);
      writer.close();
    }
    catch (IOException e) {
      e.printStackTrace();
      }
      
      
    }
    else if(event.getSource() == printreceiptButton) {
       File file = new File("receipt.txt");
    try{
      Scanner reader = new Scanner(file);
      while(reader.hasNext()) {
        String line = reader.nextLine();
        System.out.println(line);
        output1 = output1 + line + "\n";
      }
      JOptionPane.showMessageDialog(null, output1);
    }
    catch(FileNotFoundException fnfe) {
      System.out.println("No File is found");
      System.out.println(fnfe.toString());
    }
    }
    else if(event.getSource() == clearButton) {
      amountText.setText("");
      carwash.setSelected(false);
      oilchange.setSelected(false);
    }
  }
  
  public static void main(String [] args) {
    CarService3_JAA ds = new CarService3_JAA();
}
}