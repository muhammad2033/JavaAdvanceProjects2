import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class WordCounter extends JFrame implements ActionListener {

private static final long serialVersionUID = 1L;

JLabel label;
JTextField textField;
JButton btnCount;

WordCounter(String s) {
super(s);
label = new JLabel("Enter text: ");
textField = new JTextField();
btnCount = new JButton("Count Words");
btnCount.addActionListener(this);
add(label);
add(textField);
add(btnCount);

label.setBounds(50, 50, 100, 20);
textField.setBounds(150, 50, 200, 20);
btnCount.setBounds(150, 90, 100, 20);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(null);
setLocation(250, 100);
setVisible(true);
setSize(450, 200);
}
@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource() == btnCount) {
String text = textField.getText().trim();
int words = text.isEmpty() ? 0 : text.split("\s+").length;
JOptionPane.showMessageDialog(this, "Number of words: " + words);
}
}

public static void main(String[] args) {
new WordCounter("Word Counter");
}
}
