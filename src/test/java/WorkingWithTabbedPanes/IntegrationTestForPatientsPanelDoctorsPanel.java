package src.test.java.WorkingWithTabbedPanes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.WorkingWithTabbedPanes.Model.Doctors;
import src.main.java.WorkingWithTabbedPanes.Model.Patients;
import src.main.java.WorkingWithTabbedPanes.Views.DoctorsPanel;
import src.main.java.WorkingWithTabbedPanes.Views.PatientsPanel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegrationTestForPatientsPanelDoctorsPanel {
    private DoctorsPanel doctorsPanel;
    private PatientsPanel patientsPanel;

    @BeforeEach
    void setUp() {
        List<Doctors> doctorsList = new ArrayList<>();
        doctorsList.add(new Doctors(3, "Dr. Mike Samson", "Cardiology"));
        doctorsPanel = new DoctorsPanel(doctorsList);

        List<Patients> patientsList = new ArrayList<>();
        patientsList.add(new Patients(5, "Mis Dinah Harriet", 45, "Flu"));
        patientsPanel = new PatientsPanel(patientsList);
    }
    @Test
    void testPanelsVisibility() {
        doctorsPanel.setVisible(true);
        assertTrue(doctorsPanel.isVisible(), "Welcome to the doctors panel");

        patientsPanel.setVisible(true);
        assertTrue(patientsPanel.isVisible(), "welcome to the patients panel");
    }
}
