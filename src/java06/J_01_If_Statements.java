package java06;

import java.util.Scanner;

public class J_01_If_Statements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("What operation do you want to perform? ");
        String operation = scanner.next();

        if (operation.equals("sum")) {
            System.out.printf("%.1f + %.1f = %.1f", num1, num2, num1 + num2);
        } else if (operation.equals("sub")) {
            System.out.printf("%.1f - %.1f = %.1f", num1, num2, num1 - num2);
        } else if (operation.equals("mul")) {
            System.out.printf("%.1f * %.1f = %.1f", num1, num2, num1 * num2);
        } else if (operation.equals("div")) {
            if (num2 == 0) {
                System.out.println("Can not divide by zero.");
            } else {
                System.out.printf("%.1f / %.1f = %.1f", num1, num2, num1 / num2);
            }
        } else {
            System.out.printf("%s is not a supported operation.", operation);
        }

        scanner.close();
    }

}
