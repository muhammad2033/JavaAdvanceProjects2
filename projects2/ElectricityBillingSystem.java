import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ElectricityBillingSystem {
  private JFrame mainFrame;
  private JLabel headerLabel;
  private JLabel statusLabel;
  private JPanel controlPanel;
  private JLabel unitsLabel;
  private JTextField unitsTextField;
  private JButton calculateButton;

  public ElectricityBillingSystem(){
    prepareGUI();
  }

  public static void main(String[] args){
    ElectricityBillingSystem  electricityBillingSystem = new ElectricityBillingSystem();      
    electricityBillingSystem.showEventDemo();
  }

  private void prepareGUI(){
    mainFrame = new JFrame("Java Electricity Billing System");
    mainFrame.setSize(400,400);
    mainFrame.setLayout(new GridLayout(3, 1));

    headerLabel = new JLabel("",JLabel.CENTER );
    statusLabel = new JLabel("",JLabel.CENTER);
    statusLabel.setSize(350,100);

    mainFrame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }        
    });    
    controlPanel = new JPanel();
    controlPanel.setLayout(new FlowLayout());

    mainFrame.add(headerLabel);
    mainFrame.add(controlPanel);
    mainFrame.add(statusLabel);
    mainFrame.setVisible(true);  
  }

  private void showEventDemo(){
    headerLabel.setText("Enter the number of units consumed: "); 

    unitsLabel = new JLabel("Units: ", JLabel.RIGHT);
    unitsTextField = new JTextField(6);

    calculateButton = new JButton("Calculate");
    calculateButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int units = Integer.parseInt(unitsTextField.getText());
        double bill = 0.0;
        if (units <= 100) {
          bill = units * 15.00;
        } else if (units <= 300) {
          bill = 100 * 1.20 + (units - 100) * 2.00;
        } else {
          bill = 100 * 1.20 + 200 * 2.00 + (units - 300) * 3.00;
        }
        statusLabel.setText("The bill is: " + bill);
      }
    }); 

    controlPanel.add(unitsLabel);
    controlPanel.add(unitsTextField);
    controlPanel.add(calculateButton);

    mainFrame.setVisible(true);  
  }
}