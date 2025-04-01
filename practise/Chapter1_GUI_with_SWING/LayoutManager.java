import javax.swing.*;
import java.awt.*;

public class LayoutManager extends JFrame {

    JLabel nameLabel;
    JLabel passwordLabel;

    JTextField nameField;
    JPasswordField passwordField;

    LayoutManager() {
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        nameLabel = new JLabel("Enter Your Name");
        add(nameLabel, BorderLayout.NORTH);

        nameField = new JTextField("John Doe");
        add(nameField, BorderLayout.EAST);

        passwordLabel = new JLabel("Enter Your Password");
        add(passwordLabel, BorderLayout.WEST);

        passwordField = new JPasswordField("Text");
        add(passwordField, BorderLayout.PAGE_END);

        // setVisible(true);

    }

    public static void main(String[] args) {
       LayoutManager layout = new LayoutManager();
       layout.setVisible(true);
    }
}