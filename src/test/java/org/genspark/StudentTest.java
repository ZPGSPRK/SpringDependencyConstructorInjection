package org.genspark;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// Test class for Student
@SpringBootTest
public class StudentTest {

    @Test
    public void testStudentConstructor() {
        // Define the input parameters
        int id = 1;
        String name = "John Smith";
        Address address = mock(Address.class);
        List<Phone> phones = new ArrayList<>();

        Phone mob = mock(Phone.class);
        Phone home = mock(Phone.class);

        // Define the behavior of mocks
        when(mob.getMob()).thenReturn("(484) 953-2993");
        when(home.getMob()).thenReturn("(610) 263-8832");

        // Add mock objects to the list of phones
        phones.add(mob);
        phones.add(home);

        // Define the behavior of the address mock object
        when(address.getCity()).thenReturn("West Chester");
        when(address.getCountry()).thenReturn("United States");
        when(address.getState()).thenReturn("Pennsylvania");
        when(address.getZipcode()).thenReturn("19382");

        // Create a student object using the defined mocks
        Student student = new Student(id, name, phones, address);

        // Assert that the student object is created correctly
        Assertions.assertEquals(id, student.getId());
        Assertions.assertEquals(name, student.getName());
        Assertions.assertEquals(phones, student.getPh());
        Assertions.assertEquals(address, student.getAdd());
    }
}
