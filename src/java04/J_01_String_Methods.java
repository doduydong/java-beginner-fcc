package java04;

public class J_01_String_Methods {

    public static void main(String[] args) {
        String name = "Dong";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());

        String course = "JAVA PROGRAMMING";
        System.out.println(course.toLowerCase());
        System.out.println(course.contains("PRO"));

        String space = " ";
        System.out.println(space.isBlank());
        System.out.println(space.isEmpty());

        String sky = "The sky is blue";
        System.out.println(sky.replace("blue", "red"));
    }

}
