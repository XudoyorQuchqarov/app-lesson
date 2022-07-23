package part3;

@FunctionalInterface
public interface CarFactory {
    Car create(String model, String VIN, double price, String color);
}
