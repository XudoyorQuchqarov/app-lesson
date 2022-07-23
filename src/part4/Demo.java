package part4;

import part3.Car;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
    Predicate<Car> carPredicate = car -> car.getColor().equalsIgnoreCase("black");
        Car[] cars = {
                new Car("BMW", "XWB123456", 23000.0, "BLACK"),
                new Car("CHEVROLET", "XWB123000", 5300.0, "WHITE"),
                new Car("BMW", "XWB123400", 25000.0, "BLACK"),
                new Car("CHEVROLET", "XWB123111", 5600.0, "BLACK"),
                new Car("CHEVROLET", "XWB120000", 40000.0, "BROWN"),
                new Car("BMW", "XWB123221", 53000.0, "WHITE"),
                new Car("BMW", "XWB123221", 56000.0, "WHITE"),
        };

        for (Car c : cars) {
            if (carPredicate.test(c))
                System.out.println("ID:  " + c.getID() + " | Old Price: " + c.getPrice());
        }

        Consumer <Car> carConsumer = car -> car.setDiscount(5.0);
        Predicate<Car> carPredicate2 = car -> car.getModel().equalsIgnoreCase("CHEVROLET");

        System.out.println("\n=============After Discount==========\n");

        for (Car c : cars) {
            if (carPredicate.test(c)) {
                if (carPredicate2.test(c))
                carConsumer.accept(c);
                System.out.println("ID:  " + c.getID() + " | New Price: " + c.getPrice());

            }
        }

    }
}
