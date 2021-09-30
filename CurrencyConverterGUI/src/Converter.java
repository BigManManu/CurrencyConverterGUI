/**
 * Converter.java
 * 
 * About: This is a simple GUI program that converts currency 
 * ranging from US Dollars, Euros, and British Pound.
 * 
 * The takes care of creating a frame object
 * and makes sure the program terminates when the window
 * is closed. Plus, it makes sure the GUI is visible.
 * 
 */
import javax.swing.JFrame;
public class Converter {
    /**
     * Makes a frame object, sets the GUI visible 
     * and it can be terminated by closing the window
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new ConverterFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}