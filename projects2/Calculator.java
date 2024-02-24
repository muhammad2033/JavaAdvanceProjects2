import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JTextField thirdNumberField;
    private JTextField fourNumberField;
    private JTextField fiveNumberField;
    private JLabel resultLabel;

    public Calculator() {
        setTitle("Calculator");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 9));

        panel.add(new JLabel("Python:"));
        firstNumberField = new JTextField();
        panel.add(firstNumberField);

        panel.add(new JLabel("Java:"));
        secondNumberField = new JTextField();
        panel.add(secondNumberField);

        panel.add(new JLabel("C++:"));
        thirdNumberField = new JTextField();
        panel.add(thirdNumberField);

        panel.add(new JLabel("Javascript:"));
        fourNumberField = new JTextField();
        panel.add(fourNumberField);
        
        panel.add(new JLabel("Information security:"));
        fiveNumberField = new JTextField();
        panel.add(fiveNumberField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener()
         {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                double thirdNumber = Double.parseDouble(thirdNumberField.getText());
                double fourNumber = Double.parseDouble(fourNumberField.getText());
                double fiveNumber = Double.parseDouble(fiveNumberField.getText());
                double result = (firstNumber + secondNumber +thirdNumber+fourNumber+fiveNumber) / 5;
                resultLabel.setText("Average: " + result);
            }
            
            
        });
        panel.add(calculateButton);

        

        resultLabel = new JLabel("");
        panel.add(resultLabel);

        add(panel);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
}
}
