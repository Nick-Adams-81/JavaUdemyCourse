package Module1;

import java.util.Scanner;

public class JavaGramSignUp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcone to java gram, please sign up!");
        System.out.println("Enter your First Name");
        String firstName = sc.nextLine();
        System.out.println("Enter your last name");
        String lastName = sc.nextLine();
        System.out.println("Enter your age");
        String age = sc.nextLine();
        System.out.println("Enter a username");
        String username = sc.nextLine();
        System.out.println("Thank you");

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Username: " + username);
    }
}
