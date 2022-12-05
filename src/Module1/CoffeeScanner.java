package Module1;

import java.util.Scanner;

public class CoffeeScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, whats your name?");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", nice to meet you!");
        System.out.println(name + ", do you drink coffee? [y/n]");
        String coffeeResponse = sc.nextLine();
        if (coffeeResponse.equalsIgnoreCase("Y")) {
            System.out.println("I love coffee!");
        } else {
            System.out.println("I dont like coffee much either");
        }
    }
}
