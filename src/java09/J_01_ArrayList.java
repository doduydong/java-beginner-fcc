package java09;

import java.util.ArrayList;

public class J_01_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println(numbers.toString());

        numbers.set(2, 11);
        System.out.println(numbers.toString());

        System.out.println(numbers.size());

        System.out.println(numbers.get(6));

        System.out.println(numbers.reversed());

        numbers.remove(3);
        System.out.println(numbers.toString());

        System.out.println(numbers.contains(11));

        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
        });
        System.out.println(numbers.toString());

        numbers.clear();
        System.out.println(numbers.toString());
        System.out.println(numbers.isEmpty());
    }

}
