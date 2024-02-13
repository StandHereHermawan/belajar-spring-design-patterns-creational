package ariefbelajarteknologi.spring.creational.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = PrototypeApplication.class)
class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype() {
        Employee arief = applicationContext.getBean("employeeStaff", Employee.class);
        arief.setName("Arief Karditya Hermawan");

        Employee hilmi = applicationContext.getBean("employeeStaff", Employee.class);
        hilmi.setName("Hilmi Akbar Muharrom");

        Employee handoko = applicationContext.getBean("employeeManager", Employee.class);
        handoko.setName("Handoko Sulistyono");

        Employee michael = applicationContext.getBean("employeeVicePresident", Employee.class);
        michael.setName("Michael Lembong");

        Employee sebastian = applicationContext.getBean("employeeCLEVEL", Employee.class);
        sebastian.setName("Sebastian Widjaja");

        System.out.println(arief);
        System.out.println(hilmi);
        System.out.println(handoko);
        System.out.println(michael);
        System.out.println(sebastian);

        assertNotNull(arief);
        assertNotNull(hilmi);
        assertNotNull(michael);
        assertNotNull(handoko);
        assertNotNull(michael);
        assertNotNull(sebastian);
    }
}