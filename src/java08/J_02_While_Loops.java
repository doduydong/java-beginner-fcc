package java08;

public class J_02_While_Loops {

    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 1;

        while (number2 <= 10) {
            System.out.println(number1 * number2);
            number2++;
        }

        do {
            System.out.printf("%d x %d = %d \n", number1, number2, number1 * number2);
            number2--;
        } while (number2 <= 10 && number2 > 0);
    }

}
