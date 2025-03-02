
// Import the necessary Swing library for GUI components
import javax.swing.*;

// Define the SimpleWindow class
public class SimpleWindow {
    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Create a JFrame object (a window)
        JFrame frame = new JFrame("Simple Window"); // Set the title of the window to "Simple Window"

        // Set the size of the window to 300 pixels wide and 200 pixels tall
        frame.setSize(300, 200);

        // Set the default close operation to exit the application when the window is
        // closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel (a text label) with the message "Welcome to Swing GUI
        // Programming!"
        JLabel label = new JLabel("Welcome to Swing GUI Programming!");

        // Add the label to the JFrame (window)
        frame.add(label);

        // Make the window visible on the screen
        frame.setVisible(true);
    }
}