import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Project3  extends JFrame {

  private JLabel firstName, employeeInfo, middleName, lastName, employeeId, startDate,
                 timeOfday, endDate, timeOfday2, shouldJoe, explain, comment, amOrpm,
                 amOrpm2;
  private JTextField fn, mn, ln, ei, sd, td, ed, td2;
  private JRadioButton am, pm, am2, pm2;
  private JCheckBox goodGrade;
  private JButton goButton, resetButton;
  private JPanel cPanel, typePanel, sPanel, weightpanel;
  private ButtonGroup nameGroup;
  private JTextArea reasonForleave, employeeComment;
  
  public GUI_Project3() { 
    super("Request for Time Off Work");
    employeeInfo = new JLabel("Employee Information");
    firstName = new JLabel("First Name:");
    fn = new JTextField(10);
    middleName = new JLabel("Middle Name:");
    mn = new JTextField(10);
    lastName = new JLabel("Last Name:");
    ln = new JTextField(10);
    employeeId = new JLabel("Employee ID (9 digits):");
    ei = new JTextField(9);
    startDate = new JLabel("Start Date: (00/00/00)");
    sd = new JTextField(8);
    endDate = new JLabel("End Date: (00/00/00)");
    ed = new JTextField(8);
    timeOfday = new JLabel("Time of Day (ex. 9:00):");
    td = new JTextField(8);
    amOrpm = new JLabel("AM or PM?:");
    am = new JRadioButton("AM");
    pm = new JRadioButton("PM");
    timeOfday2 = new JLabel("Time of Day (ex. 9:00):");
    td2 = new JTextField(8);
    amOrpm2 = new JLabel("AM or PM?:");
    am2 = new JRadioButton("AM");
    pm2 = new JRadioButton("PM");
    explain = new JLabel("Reason for Time Off:");
    comment = new JLabel("Any Additional Comments:");
    nameGroup = new ButtonGroup();
    typePanel = new JPanel();
    typePanel.setLayout(new GridLayout(8,6)); 
    typePanel.add(firstName); 
    typePanel.add(fn); 
    typePanel.add(middleName); 
    typePanel.add(mn); 
    typePanel.add(lastName);
    typePanel.add(ln);
    JLabel blankLabel = new JLabel(""); 
    typePanel.add(blankLabel); 
    typePanel.add(blankLabel); 
    typePanel.add(employeeId);
    typePanel.add(ei);
    typePanel.add(blankLabel);
    typePanel.add(blankLabel);
    typePanel.add(startDate);
    typePanel.add(sd);
    typePanel.add(timeOfday);
    typePanel.add(td);
    typePanel.add(amOrpm);
    typePanel.add(am);
    typePanel.add(pm);
    typePanel.add(endDate);
    typePanel.add(ed);
    typePanel.add(timeOfday2);
    typePanel.add(td2);
    typePanel.add(amOrpm2);
    typePanel.add(am2);
    typePanel.add(pm2);
    reasonForleave = new JTextArea(5, 20);
    employeeComment = new JTextArea(5, 20);
    typePanel.add(explain);
    typePanel.add(reasonForleave);
    typePanel.add(comment);
    typePanel.add(employeeComment);
    cPanel = new JPanel(); 
    cPanel.add(typePanel);
    add(cPanel, BorderLayout.CENTER);
    
    JPanel weightPanel = new JPanel();
    weightPanel.add(employeeInfo);
    add(weightPanel, BorderLayout.PAGE_START);
    
    sPanel = new JPanel();
    goButton = new JButton("Submit");
    resetButton = new JButton("Reset");
    sPanel.add(goButton);
    sPanel.add(resetButton);
    add(sPanel, BorderLayout.SOUTH);
    setSize(1000,1000);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public static void main(String [] args) {
    GUI_Project3 ds = new GUI_Project3();
  }
}