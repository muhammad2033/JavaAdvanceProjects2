import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OnlineExam extends JFrame implements ActionListener {

    // Define exam questions and answers
    String[] questions = {"How we can achieve Inheritance in java?",
                        "Is java platform indenpedent?",
                        "which languge are we learning now?",
                        "what is the extension of the java language"};

    String[] answers = {"interface","yes","Java",".java"};

    // Define GUI components
    JLabel questionLabel, resultLabel;
    JTextField answerField;
    JButton submitButton, cancelButton;
    int currentQuestion = 0;
    int score = 0;

    public OnlineExam() {
        // Set up GUI components
        questionLabel = new JLabel(questions[currentQuestion]);
        resultLabel = new JLabel();
        answerField = new JTextField(20);
        submitButton = new JButton("Submit");
        cancelButton = new JButton("Cancel");
        submitButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // Set up layout
        JPanel mainPanel = new JPanel(new GridLayout(5, 1));
        JPanel questionPanel = new JPanel(new FlowLayout());
        JPanel answerPanel = new JPanel(new FlowLayout());
        JPanel buttonPanel = new JPanel(new FlowLayout());
        questionPanel.add(questionLabel);
        answerPanel.add(answerField);
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        mainPanel.add(questionPanel);
        mainPanel.add(answerPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(resultLabel);
        add(mainPanel);

        // Set up window properties
        setTitle("Online Examination System");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String userAnswer = answerField.getText();
            if (userAnswer.equalsIgnoreCase(answers[currentQuestion])) {
                resultLabel.setText("Correct!");
                score++;
            } else {
                resultLabel.setText("Incorrect!");
            }
            currentQuestion++;
            if (currentQuestion < questions.length) {
                questionLabel.setText(questions[currentQuestion]);
                answerField.setText("");
            } else {
                // Display final score and exit
                JOptionPane.showMessageDialog(this, "Your score is " + score + " out of " + questions.length);
                System.exit(0);
            }
        } else if (e.getSource() == cancelButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new OnlineExam();
    }
}

