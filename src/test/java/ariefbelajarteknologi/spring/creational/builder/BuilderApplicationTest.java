package ariefbelajarteknologi.spring.creational.builder;

import ariefbelajarteknologi.spring.creational.builder.auto.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = BuilderApplication.class)
class BuilderApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testBuilderPrototype() {
        User user = applicationContext.getBean("userVisitor", User.class);
        user.setName("Hilmi Akbar Muharrom");
        user.setCash(2_000_000L);

        System.out.println(user);

        User user_1 = applicationContext.getBean("userCustomer", User.class);
        user_1.setName("Michael Lembong");
        user_1.setCash(3_000_000L);

        System.out.println(user_1);

        assertNotNull(user);
        assertNotNull(user_1);
    }
}