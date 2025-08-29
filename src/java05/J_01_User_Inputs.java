package java05;

import java.util.Scanner;

public class J_01_User_Inputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?");

        String name = scanner.nextLine();

        System.out.println("My name is " + name);

        System.out.printf("Hi %s. How old are you?", name);

        int age = scanner.nextInt();

        System.out.printf("I am %d years old.", age);

        scanner.close();
    }

}
