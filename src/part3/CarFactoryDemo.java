package part3;

public class CarFactoryDemo {
    public static void main(String[] args) {
        CarFactory carFactory = Car::new;

        Car newCar = carFactory.create("Hyundai","XWB123000", 20000.0,"Black");
        System.out.println(newCar.getID());
    }
}
