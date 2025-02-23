package src.test.java.WorkingWithTabbedPanes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.WorkingWithTabbedPanes.Model.Doctors;
import src.main.java.WorkingWithTabbedPanes.Views.DoctorsPanel;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoctorsPanelTest {
    private DoctorsPanel doctorsPanel;
    @BeforeEach
    void setUp() {
        List<Doctors> doctorsList = new ArrayList<>();
        doctorsList.add(new Doctors(7, "Dr. Nikson", "Cardiology"));
        doctorsPanel = new DoctorsPanel(doctorsList);
    }
    @Test
    void testSetVisible() {
        doctorsPanel.setVisible(true);
        assertEquals(true, doctorsPanel.isVisible(), "Panel is now visible, Wellcome to the panel!!");

    }
}