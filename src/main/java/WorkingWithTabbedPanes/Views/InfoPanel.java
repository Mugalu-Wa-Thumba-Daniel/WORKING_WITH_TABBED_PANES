package src.main.java.WorkingWithTabbedPanes.Views;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {
    public InfoPanel() {
        setLayout(new BorderLayout());
        configureComponents();
    }

    private void configureComponents() {
        JTextArea infoArea = new JTextArea();
        infoArea.setText("Welcome to the Hospital Management System. Here you can manage doctors and patients information.\n\n" +
                "Use the tabs above to navigate between different sections of the application.\n\n" +
                "This panel can be used to display static or dynamically generated information such as instructions, messages, or announcements.");
        infoArea.setEditable(false);
        infoArea.setWrapStyleWord(true);
        infoArea.setLineWrap(true);
        infoArea.setFont(new Font("Arial", Font.PLAIN, 14));

        add(new JScrollPane(infoArea), BorderLayout.CENTER);
    }
}
