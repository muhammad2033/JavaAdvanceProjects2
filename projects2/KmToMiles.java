import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//////////////////////////////////////////////////////// class KmToMiles
class KmToMiles {
    //====================================================== method main
    public static void main(String[] args) {
        JFrame window = new KmToMilesGU();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}


///////////////////////////////////////////////////// class KmToMilesGUI
class KmToMilesGU extends JFrame {
    //======================================= instance variables
    private JTextField m_milesTf      = new JTextField(10);
    private JTextField m_kilometersTf = new JTextField(10);
    private JButton    m_convertBtn   = new JButton("Convert");


    //====================================================== constructor
    public KmToMilesGU() {
        //... Create content panel, set layout, add components
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());   // use FlowLayout
        content.add(new JLabel("Kilometers")); // create, add label
        content.add(m_kilometersTf);           // add input field
        content.add(m_convertBtn);             // add button
        content.add(new JLabel("Miles"));      // create, add label
        content.add(m_milesTf);                // add output field
        this.setContentPane(content); 
        this.pack();
        
        //... Add listener                               //Note 1
        m_convertBtn.addActionListener(new ConvertBtnListener());
        
        //... Set window characteristics
        this.setTitle("Kilometers to Miles");
    }//end constructor  
    
    
    //================================================ ConvertBtnListener
    class ConvertBtnListener implements ActionListener {  //Note 2
        public void actionPerformed(ActionEvent e) {
            //... Get the value from the km textfield.
            String kmStr = m_kilometersTf.getText();      //Note 3
            double km = Double.parseDouble(kmStr);
            
            //... Convert it
            double mi = convertKmToMi(km);                //Note 4
            
            //... Convert it to a string and set mi textfield
            m_milesTf.setText("" + mi);                   //Note 5
        }
    }
    
    
    //===================================================== convertKmToMi
    public static double convertKmToMi(double kilometers) {
        // Assume there are 0.621 miles in a kilometer.
        double miles = kilometers * 0.621;
        return miles;
    }
}//end class KmToMilesGUI