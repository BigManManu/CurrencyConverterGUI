/**
 * ConverterFrame.java
 * 
 * The sets up the GUI with buttons, text box, and
 * combo box. It also checks to see what the user selected
 * on the combo box to make the conversion
 * 
 */
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
public class ConverterFrame extends JFrame implements ActionListener{
    private static final int WIDTH = 700;
    private static final int HEIGHT = 200;
    
    private JTextField amountText;
    private JTextField resultText;
    
    private JButton convertButton;
    private JPanel panel = new JPanel();
    
    private JComboBox comboBox1;
    private JComboBox comboBox2;
   /**
   *  Constructs a ConverterFrame and sets up the GUI with
   *  Comboboxs, TextFields, and a button.
   */
    public ConverterFrame() {
        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);
      
        amountText = new JTextField();
        amountText.setPreferredSize(new Dimension(150, 20));
  
        resultText = new JTextField();
        resultText.setEditable(false);
        resultText.setPreferredSize(new Dimension(150, 20));
       
        comboBox1 = new JComboBox();
        comboBox1.addItem("USD");
        comboBox1.addItem("EUR");
        comboBox1.addItem("GBP");
        
        comboBox2 = new JComboBox();
        comboBox2.addItem("USD");
        comboBox2.addItem("EUR");
        comboBox2.addItem("GBP");
        
        panel.add(amountText);
        panel.add(comboBox1);
        panel.add(comboBox2);
        panel.add(convertButton);
        panel.add(resultText);
        add(panel);
        setSize(WIDTH, HEIGHT);
    }
    /**
    * When the button is pressed the method checks 
    * to see what the combo box is set to and makes
    * the conversion based on the user enters.
    * @param e ActionEvent of button
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        String userInput;
        double result = 0.0;
        boolean error = false;
        userInput = amountText.getText();
        if (comboBox1.getSelectedIndex() == 0 && comboBox2.getSelectedIndex() == 1) {
            result = 0.844376 * Double.parseDouble(userInput);
        }
        else if(comboBox1.getSelectedIndex() == 0 && comboBox2.getSelectedIndex() == 2) {
            result = 0.726319 * Double.parseDouble(userInput);
        }
        else if(comboBox1.getSelectedIndex() == 1 && comboBox2.getSelectedIndex() == 0) {
            result = 1.1843065 * Double.parseDouble(userInput);
        }
        else if(comboBox1.getSelectedIndex() == 1 && comboBox2.getSelectedIndex() == 2) {
            result = 0.860184 * Double.parseDouble(userInput);
        }
        else if(comboBox1.getSelectedIndex() == 2 && comboBox2.getSelectedIndex() == 0) {
            result = 1.3768055 * Double.parseDouble(userInput);
        }
        else if(comboBox1.getSelectedIndex() == 2 && comboBox2.getSelectedIndex() == 1) {
            result = 1.1625415 * Double.parseDouble(userInput);
        }
        else {
            error = true;
        }
        if (!error) {
            resultText.setText(String.format("%1.2f", result));
        }
        else {
            resultText.setText("Error");
        }
    }
}