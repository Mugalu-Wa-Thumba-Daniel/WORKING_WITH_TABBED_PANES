package src.main.java.WorkingWithTabbedPanes.Controller;

import src.main.java.WorkingWithTabbedPanes.Views.DoctorsPanel;
import src.main.java.WorkingWithTabbedPanes.Views.HomePanel;
import src.main.java.WorkingWithTabbedPanes.Views.PatientsPanel;
import src.main.java.WorkingWithTabbedPanes.Views.ContactFormPanel;
import src.main.java.WorkingWithTabbedPanes.Views.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    private JFrame frame;
    private MainController mainController;

    public MainFrame() {
        frame = new JFrame("Hospital Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        mainController = new MainController(); // Initialize MainController

        // Create Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Add Tabs
        tabbedPane.addTab("Home", new HomePanel());
        tabbedPane.addTab("Doctors", new DoctorsPanel(mainController.getDoctorsList())); // Provide doctors list
        tabbedPane.addTab("Patients", new PatientsPanel(mainController.getPatientsList())); // Provide patients list
        tabbedPane.addTab("Contact", new ContactFormPanel());
        tabbedPane.addTab("Info", new InfoPanel());

        // Add Tabbed Pane to Frame
        frame.add(tabbedPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame());
    }
}
