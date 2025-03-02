
// Import necessary libraries for creating the GUI (Graphical User Interface)
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Create a class named StudentForm that extends JFrame (a window in Java)
public class StudentForm extends JFrame {

    // Constructor for the StudentForm class
    public StudentForm() {
        // Set the title of the window
        setTitle("Student Registration Form");

        // Set the size of the window (width: 400 pixels, height: 350 pixels)
        setSize(400, 350);

        // Ensure the program exits when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use BorderLayout to organize components in the window
        setLayout(new BorderLayout());

        // Center the window on the screen
        setLocationRelativeTo(null);

        // Create a panel to hold the form components (like text fields, labels, etc.)
        JPanel formPanel = new JPanel();

        // Use BoxLayout to arrange components vertically (one after another)
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

        // Add some padding around the form (10 pixels on all sides)
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Set a light background color for the form panel
        formPanel.setBackground(new Color(245, 245, 245));

        // Create a panel for the "Name" field with a label and a text field
        JPanel namePanel = createInputPanel("Name:", new JTextField(20));
        formPanel.add(namePanel); // Add the name panel to the form

        // Create a panel for the "Age" field with a label and a text field
        JPanel agePanel = createInputPanel("Age:", new JTextField(20));
        formPanel.add(agePanel); // Add the age panel to the form

        // Create a panel for the "Gender" field with a label and a dropdown (combo box)
        JPanel genderPanel = createInputPanel("Gender:", createGenderComboBox());
        formPanel.add(genderPanel); // Add the gender panel to the form

        // Create a panel for the "Course" field with a label and a text field
        JPanel coursePanel = createInputPanel("Course:", new JTextField(20));
        formPanel.add(coursePanel); // Add the course panel to the form

        // Create a "Submit" button
        JButton submitButton = new JButton("Submit");

        // Set the button's background color to blue
        submitButton.setBackground(new Color(100, 150, 255));

        // Set the button's text color to white
        submitButton.setForeground(Color.WHITE);

        // Set the button's font to Arial, bold, and size 14
        submitButton.setFont(new Font("Arial", Font.BOLD, 14));

        // Remove the border that appears when the button is focused
        submitButton.setFocusPainted(false);

        // Center the button horizontally in the form
        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add the button to the form
        formPanel.add(submitButton);

        // Add an action listener to the button (this code runs when the button is
        // clicked)
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the text entered in the "Name" field
                String name = ((JTextField) namePanel.getComponent(1)).getText();

                // Get the text entered in the "Age" field
                String age = ((JTextField) agePanel.getComponent(1)).getText();

                // Get the selected gender from the dropdown
                String gender = (String) ((JComboBox<?>) genderPanel.getComponent(1)).getSelectedItem();

                // Get the text entered in the "Course" field
                String course = ((JTextField) coursePanel.getComponent(1)).getText();

                // Show a popup message with the entered details
                JOptionPane.showMessageDialog(StudentForm.this,
                        "Registration Successful!\nName: " + name + "\nAge: " + age + "\nGender: " + gender
                                + "\nCourse: " + course);
            }
        });

        // Add the form panel to the center of the window
        add(formPanel, BorderLayout.CENTER);
    }

    // Helper method to create a panel with a label and an input field
    private JPanel createInputPanel(String labelText, Component inputField) {
        JPanel panel = new JPanel();

        // Use FlowLayout to align components to the left
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Set the background color of the panel
        panel.setBackground(new Color(245, 245, 245));

        // Create a label (e.g., "Name:", "Age:", etc.)
        JLabel label = new JLabel(labelText);

        // Set the font of the label to Arial, plain, and size 14
        label.setFont(new Font("Arial", Font.PLAIN, 14));

        // Set a fixed width for the label (80 pixels wide, 25 pixels tall)
        label.setPreferredSize(new Dimension(80, 25));

        // Add the label to the panel
        panel.add(label);

        // Set a fixed width for the input field (200 pixels wide, 30 pixels tall)
        inputField.setPreferredSize(new Dimension(200, 30));

        // Add the input field to the panel
        panel.add(inputField);

        return panel; // Return the panel with the label and input field
    }

    // Helper method to create a dropdown (combo box) for gender selection
    private JComboBox<String> createGenderComboBox() {
        // Create a dropdown with options: Male, Female, Other
        JComboBox<String> genderBox = new JComboBox<>(new String[] { "Male", "Female", "Other" });

        // Set the font of the dropdown to Arial, plain, and size 14
        genderBox.setFont(new Font("Arial", Font.PLAIN, 14));

        // Set a fixed width for the dropdown (200 pixels wide, 30 pixels tall)
        genderBox.setPreferredSize(new Dimension(200, 30));

        return genderBox; // Return the dropdown
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Use SwingUtilities to ensure the GUI is created on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create an instance of StudentForm and make it visible
                new StudentForm().setVisible(true);
            }
        });
    }
}