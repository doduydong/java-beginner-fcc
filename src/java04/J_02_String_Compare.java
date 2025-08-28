package java04;

public class J_02_String_Compare {

    public static void main(String[] args) {
        String literal1 = "abc";
        String literal2 = "abc";
        System.out.println(literal1 == literal2);
        System.out.println(literal1.equals(literal2));

        String objectS1 = new String("xyz");
        String objectS2 = new String("xyz");
        System.out.println(objectS1 == objectS2);
        System.out.println(objectS1.equals(objectS2));
    }

}
