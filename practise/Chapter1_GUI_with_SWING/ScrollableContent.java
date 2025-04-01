import java.awt.FlowLayout;

import javax.swing.*;

public class ScrollableContent extends JFrame {
    JTable table;
    JScrollPane scrollPane;

    ScrollableContent() {
        setSize(400, 600);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(10, 10, FlowLayout.CENTER));

        String[] title = { "SN", "Name", "Phone", "Email", "Gender" };
        String[][] data = {
                { "1", "ABC", "9999999999", "abc@gmail.com", "Male" },
                { "2", "ASD", "9999999999", "asd@gmail.com", "Male" },
                { "3", "WER", "9999999999", "wer@gmail.com", "Male" },
                { "1", "ABC", "9999999999", "abc@gmail.com", "Male" },
                { "1", "ABC", "9999999999", "abc@gmail.com", "Male" },
                { "1", "ABC", "9999999999", "abc@gmail.com", "Male" },
                { "1", "ABC", "9999999999", "abc@gmail.com", "Male" },
                { "1", "ABC", "9999999999", "abc@gmail.com", "Male" },
                { "1", "ABC", "9999999999", "abc@gmail.com", "Male" },
                { "1", "ABC", "9999999999", "abc@gmail.com", "Male" },
        };
        table = new JTable(data, title);
        scrollPane = new JScrollPane(table, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollableContent();
    }
}