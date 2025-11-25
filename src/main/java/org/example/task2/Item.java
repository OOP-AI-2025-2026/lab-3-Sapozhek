package org.example.task2;

public class Item {

    private long id;
    private String name;
    private double price;

    public Item(long id, String name, double price) {
        setId(id);
        setName(name);
        setPrice(price);
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        if (id < 0) throw new IllegalArgumentException("ID must be >= 0");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price must be >= 0");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}
