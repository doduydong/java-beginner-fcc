package java08;

public class J_01_For_Loops {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }
        System.out.println("Sum: " + sum);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

}
