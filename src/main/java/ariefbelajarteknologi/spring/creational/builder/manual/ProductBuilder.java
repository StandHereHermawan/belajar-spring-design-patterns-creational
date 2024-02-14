package ariefbelajarteknologi.spring.creational.builder.manual;

public class ProductBuilder {

    private String id;

    private String name;

    private String description;

    private Long price;

    private String sku;
    /**
    Manual Builder Pattern implementations
    */
    public ProductBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setDesc(String desc) {
        this.description = desc;
        return this;
    }

    public ProductBuilder setPrice(Long price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public Product create() {
        return new Product(id, name, description, price, sku);
    }
}
