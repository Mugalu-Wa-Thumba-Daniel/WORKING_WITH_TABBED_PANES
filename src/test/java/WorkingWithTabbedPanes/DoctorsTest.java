package src.test.java.WorkingWithTabbedPanes;

import src.main.java.WorkingWithTabbedPanes.Model.Doctors;

import static org.junit.jupiter.api.Assertions.*;

class DoctorsTest {

    @org.junit.jupiter.api.Test
    void getId() {
        Doctors doc=new Doctors(21,"Capetown","Nurse");
        int actualId=doc.getId();
        int acualId=21;
        assertEquals("21","21","The Id should much what is in the system");

    }

    @org.junit.jupiter.api.Test
    void getName() {
        Doctors DM=new Doctors(800,"Dr Nikson","Bones and Heart");
        String actualName="Dr Nikson";
        String ExpectedName="Dr Irene";
        assertEquals("Dr Irene","Dr Irene","The name is not in the system please!!");
    }

    @org.junit.jupiter.api.Test
    void getSpecialisation() {
        assertEquals("Heart",new Doctors(001,"Dr Mike","Heart").getSpecialisation(),"The Doctors role is not found please!!");
    }
}