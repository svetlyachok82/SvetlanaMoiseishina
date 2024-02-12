package Hometask9;

import java.util.Arrays;
import java.util.List;

public class StreamHigh {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("Highload", "High", "Load", "Highload");
        long highCount = collection.stream().filter(s -> s.equals("High")).count();
        System.out.println("Number of 'High' in collection: " + highCount);

        String firstElement;
        try {
            firstElement = collection.get(0);
        } catch (IndexOutOfBoundsException e) {
            firstElement = "0";
        }
        System.out.println("The first element is: " + firstElement);

        String lastElement;
        try {
            lastElement = collection.get(collection.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            lastElement = "0";
        }
        System.out.println("The last element is: " + lastElement);
    }
}