import javax.swing.*;

class SimpleGUI extends JFrame {
    JLabel label;
    JTextField textField;

    SimpleGUI() {
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Simple GUI with Swing Components");
        setLayout(null);
        label = new JLabel("Enter Name");
        textField = new JTextField();
        label.setBounds(50, 50, 100, 20);
        add(label);
        textField.setBounds(50, 90, 100, 20);
        add(textField);
        setVisible(true);
    }

    public static void main(String args[]) {
        SimpleGUI sGUI = new SimpleGUI();
    }
}