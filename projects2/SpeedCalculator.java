import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SpeedCalculator extends JFrame implements ActionListener {
 private JTextField distanceField;
 private JTextField timeField;
 private JButton calculateButton;
 private JLabel resultLabel;


 public SpeedCalculator() {
   setLayout(new FlowLayout());
   distanceField = new JTextField(10);
   add(new JLabel("Distance (in meters):"));
   add(distanceField);
   timeField = new JTextField(10);
   add(new JLabel("Time (in seconds):"));
   add(timeField);
   calculateButton = new JButton("Calculate");
   add(calculateButton);
   calculateButton.addActionListener(this);
   resultLabel = new JLabel("");
   add(resultLabel);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(400, 150);
   setVisible(true);
 }


 @Override
 public void actionPerformed(ActionEvent e) {
   double distance = Double.parseDouble(distanceField.getText());
   double time = Double.parseDouble(timeField.getText());
   double speed = distance / time;
   resultLabel.setText("Speed: " + speed + " m/s");
 }


 public static void main(String[] args) {
   new SpeedCalculator();
 }
}



