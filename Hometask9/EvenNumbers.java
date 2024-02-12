package Hometask9;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class EvenNumbers {
    public static void DemoStream() {
        ArrayList<Integer> AL = new ArrayList<>();
        int number;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            number = random.nextInt() % 100;
            AL.add(number);
        }
        System.out.println("Array AL: ");
        System.out.println(AL);

        Stream<Integer> stream = AL.stream();
        Predicate<Integer> fn = (n) -> (n % 2) == 0;
        Stream<Integer> resStream = stream.filter(fn);
        System.out.println("Number of even numbers: " + resStream.count());

    }

    public static void main(String[] args) {
        DemoStream();
    }
}
