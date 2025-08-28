package java04;

public class J_03_String_Format {

    public static void main(String[] args) {
        String name = "Dong";   // %s
        int age = 27;           // %d
        char grade = 'A';       // %c
        boolean isTrue = true;  // %b

        String result = String.format("My name is %s. I am %d years old. My grade is %c. The statement is %b.", name, age, grade, isTrue);

        System.out.println(result);
    }

}
