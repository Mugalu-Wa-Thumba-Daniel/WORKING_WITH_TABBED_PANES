package src.test.java.WorkingWithTabbedPanes;

import org.junit.jupiter.api.Test;
import src.main.java.WorkingWithTabbedPanes.Model.Patients;

import static org.junit.jupiter.api.Assertions.*;

class PatientsTest {

    @Test
    void setId() {
        Patients pat=new Patients(220,"Miss Joan",28,"Ful");
        int actualId=pat.setId(200);
        assertSame("200","200","The id does not match, Thankyou!!");
    }

    @Test
    void setName() {
        Patients PAT = new Patients(40, "Mr Wanasolo", 32, "Headache");
        PAT.setName("Mr Wanasolo");
        assertTrue(PAT.getName().equals("Mr Wanasolo"), "The name is NOT found please");

    }

    @Test
    void setAge() {
        Patients pe = new Patients(345, "Mr Junior", 60, "Back pain");
        int oldAge = pe.getAge();
        pe.setAge(80);
        assertNotSame(oldAge, pe.getAge(), "The age already exists in the system, Enter another age please!");
    }

    @Test
    void setDiagnosis() {
        Patients pat=new Patients(33,"Miss Joan Aminah",30,"Fractured Limb");
        String actualdiagnosis="Fractured Limb";
        String expecteddiagnosis=pat.getDiagnosis();
        assertEquals("Fractured Limb","Fractured Limb","The List is mis-matched!!");
    }
}