package part1;

@FunctionalInterface
public interface Expression<T extends Car>{
    boolean isEqual(T data);
}
