package ariefbelajarteknologi.spring.creational.builder.manual;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProductBuilderTest {

    @Test
    void testBuilder() {
        Product product = new ProductBuilder()
                .setId("1")
                .setName("Xiaomi Redmi Note 8 Pro")
                .setDesc("SmartPhone")
                .setPrice(1_000_000L)
                .setSku("XRI")
                .create();

        assertNotNull(product);
        assertEquals(1_000_000L,product.getPrice());
        assertEquals("XRI",product.getSku());
    }
}