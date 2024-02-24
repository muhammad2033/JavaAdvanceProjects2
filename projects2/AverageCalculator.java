import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AverageCalculator extends JFrame {

    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JLabel resultLabel;

    public AverageCalculator() {
        setTitle("Average Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(new JLabel("First number:"));
        firstNumberField = new JTextField();
        panel.add(firstNumberField);

        panel.add(new JLabel("Second number:"));
        secondNumberField = new JTextField();
        panel.add(secondNumberField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                double result = (firstNumber + secondNumber) / 2;
                resultLabel.setText("Average: " + result);
            }
        });
        panel.add(calculateButton);

        resultLabel = new JLabel("");
        panel.add(resultLabel);

        add(panel);
    }

    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();
        calculator.setVisible(true);
    }
}