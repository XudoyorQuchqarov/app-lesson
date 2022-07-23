package part1;

public class Demo1 {
    public static void main(String[] args) {

        // Lambda - check odd number
//        Expression<Integer> checkOdd = data -> data % 2 == 1;   // toq sonlarni topish
        // Lambda - check even number
//        Expression<Object> checkEven = data ->(Integer) data % 2 == 0;  // juft sonlarni topish


//        Object[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // showInfoDataItem(numbers, checkEven);

        Expression<Car> carExpression = data -> data.getPrice() < 6000
                && data.getModel().equalsIgnoreCase("Chevrolet");

        Car[] cars = {
                new Car("BMW", "XWB123456", 25000.0, "BLACK"),
                new Car("CHEVROLET", "XWB123000", 5300.0, "WHITE"),
                new Car("BMW", "XWB123400", 25000.0, "BLACK"),
                new Car("CHEVROLET", "XWB123111", 5600.0, "BLACK"),
                new Car("CHEVROLET", "XWB120000", 40000.0, "BROWN"),
                new Car("BMW", "XWB123221", 53000.0, "WHITE"),
                new Car("BMW", "XWB123221", 56000.0, "WHITE"),
        };

        showCarInfoData(cars, carExpression);


    }

//    private static void showInfoDataItem(Object[] objects, Expression<Object> expression) {
//        for (Object obj : objects) {
//            if (expression.isEqual(obj))
//                System.out.print(obj + " ");
//        }
//    }


    private static void showCarInfoData(Car[] objects, Expression<Car> expression) {
        for (Car obj : objects) {
            if (expression.isEqual(obj))
                System.out.println(obj + " ");
        }
    }
}
