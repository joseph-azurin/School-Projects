import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CarService1_JAA extends JFrame {
  
  private JLabel weightLabel, typeLabel;
  private JTextField weightText;
  private JCheckBox carwash, oilchange;
  private JButton payserviceButton, printreceiptButton, clearButton;
  private JPanel cPanel, typePanel, sPanel;
  private ButtonGroup typeGroup;
  
  public CarService1_JAA() {
    super("Car Service System");
    weightLabel = new JLabel("Enter amount in dollars for gas purchase($):");
    weightText = new JTextField(5);
    JPanel weightPanel = new JPanel();
    weightPanel.add(weightLabel);
    weightPanel.add(weightText);
    add(weightPanel, BorderLayout.NORTH);
    
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
    printreceiptButton = new JButton("Print Receipt");
    clearButton = new JButton("Clear");
    sPanel.add(payserviceButton);
    sPanel.add(printreceiptButton);
    sPanel.add(clearButton);
    add(sPanel, BorderLayout.SOUTH);
    setSize(400,200);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public static void main(String [] args) {
    CarService1_JAA ds = new CarService1_JAA();
  }
}