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

public class CarService2_JAA extends JFrame implements ActionListener {
  private JLabel amountLabel, typeLabel;
  private JTextField amountText;
  private JCheckBox carwash, oilchange;
  private JButton payserviceButton, printreceiptButton, clearButton;
  private JPanel cPanel, typePanel, sPanel;
  private ButtonGroup typeGroup;
  private String amount, type1, type2;
  
  public CarService2_JAA() {
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
      
      JOptionPane.showMessageDialog(null, output);
    }
    else if(event.getSource() == clearButton) {
      amountText.setText("");
      carwash.setSelected(false);
      oilchange.setSelected(false);
    }
  }
  
  public static void main(String [] args) {
    CarService2_JAA ds = new CarService2_JAA();
  }
}