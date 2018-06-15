package OnlineAuction;

import java.util.UUID;

public class Product {
    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final String description;
    private final int quantity;
    private final Category category;

    public Product(String name, String description, int quantity, Category category) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", category=" + category +
                '}';
    }
}
