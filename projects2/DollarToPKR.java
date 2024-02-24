import java.awt.event.*;
import javax.swing.*;

public class DollarToPKR extends JFrame implements ActionListener {
  
  private JLabel dollarInputLabel;
  private JTextField dollarField;
  private JButton convertButton;
  private JLabel resultLabel;
  
  public DollarToPKR() {
    setLayout(null);
    
    dollarInputLabel = new JLabel("Dollar amount: ");
    dollarInputLabel.setBounds(10, 10, 150, 20);
    add(dollarInputLabel);
    
    dollarField = new JTextField();
    dollarField.setBounds(100, 10, 150, 20);
    add(dollarField);
    
    convertButton = new JButton("Convert");
    convertButton.setBounds(260, 10, 100, 20);
    convertButton.addActionListener(this);
    add(convertButton);
    
    resultLabel = new JLabel("Result: ");
    resultLabel.setBounds(10, 40, 300, 20);
    add(resultLabel);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 100);
    setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e) {
    double dollars = Double.parseDouble(dollarField.getText());
    double pkr = dollars * 280.15;
    resultLabel.setText("Result: " + pkr + " PKR");
  }
  
  public static void main(String[] args) {
    new DollarToPKR();
  }
}