package src.main.java.WorkingWithTabbedPanes.Controller;

import src.main.java.WorkingWithTabbedPanes.Model.Doctors;
import src.main.java.WorkingWithTabbedPanes.Model.Patients;

import java.util.ArrayList;
import java.util.List;

/**
 * MainController handles the navigation between different views and manages data interactions.
 */
public class MainController {
    private List<Doctors> doctorsList;
    private List<Patients> patientsList;

    public MainController() {
        this.doctorsList = new ArrayList<>();
        this.patientsList = new ArrayList<>();

        loadSampleData();
    }

    /**
     * Loads sample data for doctors and patients.
     */
    private void loadSampleData() {
        doctorsList.add(new Doctors(1, "Dr. Alice Brown", "Cardiology"));
        doctorsList.add(new Doctors(2, "Dr. Bob Johnson", "Neurology"));

        patientsList.add(new Patients(1, "John Doe", 25, "Flu"));
        patientsList.add(new Patients(2, "Jane Smith", 30, "Fracture"));
    }

    /**
     * Gets the list of doctors.
     */
    public List<Doctors> getDoctorsList() {
        return doctorsList;
    }

    /**
     * Gets the list of patients.
     */
    public List<Patients> getPatientsList() {
        return patientsList;
    }
}
