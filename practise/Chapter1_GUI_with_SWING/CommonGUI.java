import javax.swing.*; // Import all the GUI Component of Swing

class CommonGUI extends JFrame {
    JMenuBar menuBar;
    JMenu scrollMenu, dialogMenu, simpleForm;
    JMenuItem vertialScroll, horizontalScroll, noScroll, confimationDialog, alertDialog;
    JTextField textField;
    JPasswordField passwordField;
    JLabel labelName, labelPassword, labelButton, labelTextArea;
    JCheckBox checkBox;
    JRadioButton radioButton;
    JButton submitButton;
    JTextArea textArea;

    CommonGUI() {
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setDefaultLookAndFeelDecorated(true);
        setTitle("Common GUI Component List");

        menuBar = new JMenuBar();
        // Setting Menus
        scrollMenu = new JMenu("Scroll Menu");
        dialogMenu = new JMenu("Dialog Menu");
        simpleForm = new JMenu("Simple Form");
        scrollMenu.setMnemonic('S');
        dialogMenu.setMnemonic('D');
        simpleForm.setMnemonic('F');
        // Setting the Menu Items to the respective Menus
        vertialScroll = new JMenuItem("Vertial Scroll");
        horizontalScroll = new JMenuItem("Horizontal Scroll");
        noScroll = new JMenuItem("No Scroll");
        confimationDialog = new JMenuItem("Confimation Dialog");
        alertDialog = new JMenuItem("Alert Dialog");
        // Adding Menu Items to the Respective Menu
        scrollMenu.add(vertialScroll);
        scrollMenu.add(horizontalScroll);
        scrollMenu.add(noScroll);
        dialogMenu.add(confimationDialog);
        dialogMenu.add(alertDialog);
        // Adding Menu to the Menu Bar
        menuBar.add(scrollMenu);
        menuBar.add(dialogMenu);
        menuBar.add(simpleForm);
        // Adding Menubar to the Frame
        add(menuBar);
        setVisible(true);
    }

    public static void main(String[] args) {
        CommonGUI commonGUI = new CommonGUI();
    }
}