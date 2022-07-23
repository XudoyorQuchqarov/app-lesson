package part2;

public class Demo2 {
    public static void main(String[] args) {
        Calculate<Double> calculate1 = calculation(3);

        Double result = calculate1.operation(25.25,10.75);
        System.out.println(result);
    }

    public static Calculate<Double> calculation(int choice) {
        switch (choice) {
            case 1:
                return Double::sum;
            case 2:
                return (data1, data2) -> data1 - data2;
            case 3:
                return (data1, data2) -> data1 * data2;
            case 4:
                return (data1, data2) -> data1 / data2;
        }
        return (data1, data2) -> 0.0;
    }
}
