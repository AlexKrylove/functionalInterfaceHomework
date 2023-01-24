package functionalInterfaceLessons;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Predicate<Integer> number = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i > 0;
            }
        };
        System.out.println(number.test(2));
        System.out.println(number.test(-1));
        System.out.println("**********");
        Predicate<Integer> number1 = i -> i > 0;
        System.out.println(number1.test(20));
        System.out.println(number1.test(-10));

        System.out.println(" ");
        System.out.println("Task2");
        Consumer<String> person = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello " + s);
            }
        };
        Consumer<String> person1 = s -> System.out.println("Hi " + s);
        person.accept("Alex");
        person1.accept("Petr");

        System.out.println(" ");
        System.out.println("Task3");
        Function<Double, Long> numberLong = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        Function<Double, Long> numberLong1 = aDouble -> Math.round(aDouble);
        System.out.println(numberLong.apply(4.9));
        System.out.println(numberLong1.apply(56.49));

        System.out.println(" ");
        System.out.println("Task4");
        Supplier<Double> randomNumber = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.floor(Math.random() * (100 - 0)) + 0;
            }
        };
        Supplier<Double> randomNumber1 = () -> Math.floor(Math.random() * (100 - 0)) + 0;
        System.out.println("Random number: " + randomNumber.get());
        System.out.println("Random number: " + randomNumber1.get());

        System.out.println(" ");
        System.out.println("Task5");
    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return T ->condition.test(T) ?ifTrue.apply(T):ifFalse.apply(T);


    }
}
