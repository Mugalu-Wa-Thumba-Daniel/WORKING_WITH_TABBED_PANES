package src.test.java.WorkingWithTabbedPanes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.WorkingWithTabbedPanes.Model.Doctors;
import src.main.java.WorkingWithTabbedPanes.Model.Patients;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterationTestForDoctorPatient {
    private Doctors doctor;
    private Patients patient;

    @BeforeEach
    void setUp() {
        doctor = new Doctors(101, "Dr. Smith", "Cardiology");
        patient = new Patients(202, "John Doe", 45, "Heart Disease");
    }

    @Test
    void testDoctorPatientCommunication() {
        assertEquals("Cardiology", doctor.getSpecialisation(),
                "Doctors specialization is Cardiology!");
        assertTrue(patient.getDiagnosis().equalsIgnoreCase("Heart Disease"),
                "Patient diagnosis does not match expected!");

    }

    @Test
    void testDoctorDetailsUpdating() {
        doctor.setName("Dr. Nikson");
        assertEquals("Dr. Nikson", doctor.getName(), "Doctor name updates failed plaese!");

        doctor.setSpecialisation("Neurology");
        assertEquals("Neurology", doctor.getSpecialisation(), "Doctor specialization update failed!");
    }
}
