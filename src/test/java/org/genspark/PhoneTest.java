package org.genspark;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Test class for Phone
@SpringBootTest
public class PhoneTest {

    // Test case for the constructor of the Phone class
    @Test
    public void testPhoneConstructor() {
        // Initializing a sample phone number
        String mob = "(484) 953-2993";

        // Creating a Phone object with the sample phone number
        Phone phone = new Phone(mob);

        // Assert that the phone object is created correctly
        Assertions.assertEquals(mob, phone.getMob());
    }
}