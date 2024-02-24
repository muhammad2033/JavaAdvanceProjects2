import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InchToCentimeterConverter extends JFrame {
  private JTextField inchField;
  private JLabel resultLabel;
  private JButton convertButton;

  public InchToCentimeterConverter() {
    setTitle("Inch to Centimeter Converter");
    setSize(300, 150);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container content = getContentPane();
    content.setLayout(new FlowLayout());

    JLabel inchLabel = new JLabel("Inches: ");
    content.add(inchLabel);

    inchField = new JTextField(10);
    content.add(inchField);

    convertButton = new JButton("Convert");
    convertButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        double inches = Double.parseDouble(inchField.getText());
        double centimeters = inches * 2.54;
        resultLabel.setText(inches + " inches = " + centimeters + " cm");
      }
    });
    content.add(convertButton);

    resultLabel = new JLabel("");
    content.add(resultLabel);

    setVisible(true);
  }

  public static void main(String[] args) {
    InchToCentimeterConverter converter = new InchToCentimeterConverter();
  }
}