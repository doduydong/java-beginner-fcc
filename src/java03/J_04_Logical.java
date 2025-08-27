package java03;

public class J_04_Logical {

    public static void main(String[] args) {
        boolean isCustomer = true;
        boolean isMember = false;

        // And
        System.out.println(isCustomer && isMember);

        // Or
        System.out.println(isCustomer || isMember);

        // Not
        System.out.println(!isCustomer);
        System.out.println(!isMember);
    }

}
