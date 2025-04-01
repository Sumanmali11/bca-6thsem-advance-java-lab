import javax.swing.*;

public class RegistrationForm extends JFrame {
    JLabel labelName;
    JTextField name;

    JLabel labelPassword;
    JPasswordField password;

    JLabel labelGender;
    ButtonGroup buttonGroup;
    JRadioButton genderMale;
    JRadioButton genderFeMale;

    JLabel labelInterest;
    JCheckBox javaInterest;
    JCheckBox phpInterest;
    JCheckBox cInterest;
    JCheckBox jsInterest;

    JLabel comboLabel;
    JComboBox comboBox;

    JButton button;

    RegistrationForm() {
        setSize(400, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registration Form");
        setLayout(null);

        labelName = new JLabel("Full Name");
        name = new JTextField();

        labelPassword = new JLabel("Enter Password");
        password = new JPasswordField();

        labelGender = new JLabel("Select your Gender");
        buttonGroup = new ButtonGroup();
        genderMale = new JRadioButton("Male");
        genderFeMale = new JRadioButton("Female");

        labelInterest = new JLabel("Select your Interest");
        javaInterest = new JCheckBox("Java");
        cInterest = new JCheckBox("C");
        phpInterest = new JCheckBox("PHP");
        jsInterest = new JCheckBox("Java Script");

        comboLabel = new JLabel("Select One");
        comboBox = new JComboBox<>();
        comboBox.addItem("Nepal");
        comboBox.addItem("Australia");
        button = new JButton("Submit");

        labelName.setBounds(80, 50, 200, 30);
        add(labelName);
        name.setBounds(80, 80, 200, 30);
        add(name);
        labelPassword.setBounds(80, 130, 200, 30);
        add(labelPassword);
        password.setBounds(80, 160, 200, 30);
        add(password);
        labelGender.setBounds(80, 210, 200, 30);
        add(labelGender);
        genderMale.setBounds(80, 240, 200, 30);
        buttonGroup.add(genderMale);
        genderFeMale.setBounds(80, 270, 200, 30);
        buttonGroup.add(genderFeMale);
        add(genderMale);
        add(genderFeMale);

        labelInterest.setBounds(80, 320, 200, 30);
        add(labelInterest);
        javaInterest.setBounds(80, 350, 200, 30);
        phpInterest.setBounds(80, 380, 200, 30);
        jsInterest.setBounds(80, 410, 200, 30);
        cInterest.setBounds(80, 440, 200, 30);
        add(javaInterest);
        add(phpInterest);
        add(jsInterest);
        add(cInterest);
        comboLabel.setBounds(80, 490, 200, 30);
        add(comboLabel);
        comboBox.setBounds(80, 520, 200, 30);
        add(comboBox);
        button.setBounds(80, 600, 200, 30);
        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}