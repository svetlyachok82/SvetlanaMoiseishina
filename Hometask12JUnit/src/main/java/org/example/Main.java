package org.example;

public class Main {
    public static void main(String[] args) {
        int i,fact = 1;
        int number = 5;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of number " + number + " is: " + fact);
    }

    public static int calculateFactorial(int n) {
        int result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
}