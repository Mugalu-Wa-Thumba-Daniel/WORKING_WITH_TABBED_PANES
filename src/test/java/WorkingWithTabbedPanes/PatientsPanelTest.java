package src.test.java.WorkingWithTabbedPanes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.WorkingWithTabbedPanes.Model.Patients;
import src.main.java.WorkingWithTabbedPanes.Views.PatientsPanel;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PatientsPanelTest {
    private PatientsPanel patientsPanel;

    @BeforeEach
    void setUp() {
        List<Patients> patientsList = new ArrayList<>();
        patientsList.add(new Patients(1, "John Doe", 45, "Flu"));
        patientsPanel = new PatientsPanel(patientsList);
    }
    @Test
    void setVisible() {
        patientsPanel.setVisible(true);
        assertEquals(true, patientsPanel.isVisible(), "Panel should be visible!");

    }
}