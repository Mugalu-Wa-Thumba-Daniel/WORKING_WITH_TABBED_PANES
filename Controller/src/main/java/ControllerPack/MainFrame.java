package ControllerPack;

import ModelPack.Doctors;
import ModelPack.Patients;
import ViewsPack.DoctorsPanel;
import ViewsPack.HomePanel;
import ViewsPack.PatientsPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainFrame {
    private JFrame frame;
    private MainController mainController;
    private List<Doctors> doctorsList;
    private List<Patients> patientsList;

    public MainFrame() {
        frame = new JFrame("Hospital Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        mainController = new MainController(frame); // Initialize MainController

        configureMenuBar();
        configureComponents();
        frame.setVisible(true);
    }

    /**
     * Configures the menu bar with menu items and their actions.
     */
    private void configureMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem homeItem = new JMenuItem("Home");
        JMenuItem patientsItem = new JMenuItem("Patients");
        JMenuItem doctorsItem = new JMenuItem("Doctors");

        homeItem.addActionListener(e -> showHomePanel());
        patientsItem.addActionListener(e -> showPatientsPanel());
        doctorsItem.addActionListener(e -> showDoctorsPanel());

        menu.add(homeItem);
        menu.add(patientsItem);
        menu.add(doctorsItem);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
    }

    /**
     * Configures the components with their actions.
     */
    private void configureComponents() {
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel iconLabel = new JLabel(new ImageIcon("src/main/resources/images/image_2.png")); // Remplace le chemin par le chemin de ton icône
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(iconLabel, gbc);

        JLabel mainNavLabel = new JLabel("H+ Main Navigation", JLabel.CENTER);
        mainNavLabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        frame.add(mainNavLabel, gbc);

        JButton homeButton = new JButton("Home");
        homeButton.setFocusPainted(false);
        homeButton.setPreferredSize(new Dimension(200, 50));
        homeButton.addActionListener(e -> {
            HomePanel homePanel = new HomePanel();
            homePanel.setVisible(true);
            frame.dispose();
        });
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        frame.add(homeButton, gbc);

        JButton doctorsButton = new JButton("Doctors");
        doctorsButton.setFocusPainted(false);
        doctorsButton.setPreferredSize(new Dimension(200, 50));
        doctorsButton.addActionListener(e -> {
            if (doctorsList == null) {
                doctorsList = mainController.getDoctorsList();
            }
            DoctorsPanel doctorsPanel = new DoctorsPanel(doctorsList);
            doctorsPanel.setVisible(true);
            frame.dispose();
        });
        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(doctorsButton, gbc);

        JButton patientsButton = new JButton("Patients");
        patientsButton.setFocusPainted(false);
        patientsButton.setPreferredSize(new Dimension(200, 50));
        patientsButton.addActionListener(e -> {
            if (patientsList == null) {
                patientsList = mainController.getPatientsList();
            }
            PatientsPanel patientsPanel = new PatientsPanel(patientsList);
            patientsPanel.setVisible(true);
            frame.dispose();
        });
        gbc.gridx = 2;
        gbc.gridy = 2;
        frame.add(patientsButton, gbc);
    }

    private void showHomePanel() {
        HomePanel homePanel = new HomePanel();
        homePanel.setVisible(true);
    }

    private void showDoctorsPanel() {
        if (doctorsList == null) {
            doctorsList = mainController.getDoctorsList();
        }
        DoctorsPanel doctorsPanel = new DoctorsPanel(doctorsList);
        doctorsPanel.setVisible(true);
    }

    private void showPatientsPanel() {
        if (patientsList == null) {
            patientsList = mainController.getPatientsList();
        }
        PatientsPanel patientsPanel = new PatientsPanel(patientsList);
        patientsPanel.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame());
    }
}
