package part1;

import java.util.UUID;

public class Car {
    private final UUID ID = UUID.randomUUID();
    private String model;
    private final String VIN;
    private double price;
    private String color;

    public Car(String model, String VIN, double price, String color) {
        this.model = model;
        this.VIN = VIN;
        this.price = price;
        this.color = color;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVIN() {
        return VIN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", model='" + model + '\'' +
                ", VIN='" + VIN + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
