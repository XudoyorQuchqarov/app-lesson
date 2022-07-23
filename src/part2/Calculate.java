package part2;

@FunctionalInterface
public interface Calculate<T> {
    T operation (T data1, T data2);
}
