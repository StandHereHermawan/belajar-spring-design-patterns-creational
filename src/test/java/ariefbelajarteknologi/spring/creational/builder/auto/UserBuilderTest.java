package ariefbelajarteknologi.spring.creational.builder.auto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserBuilderTest {

    @Test
    void testLombokAnnotationBuilderTest() {
        User user = User.builder()
                .id("XXX-XXX-XXX")
                .name("Hilmi Akbar Muharrom")
                .userType(UserType.VISITOR)
                .cash(2_000_000L)
                .build();

        assertNotNull(user);
        assertEquals(UserType.VISITOR, user.getUserType());
        System.out.println(user);
    }
}