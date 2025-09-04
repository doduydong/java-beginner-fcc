package java09;

import java.util.HashMap;

public class J_02_HashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("Math", 75);
        scores.put("English", 80);
        scores.put("Japanese", 97);
        scores.put("Computer programming", 100);

        System.out.println(scores.toString());
        System.out.println(scores.size());

        System.out.println(scores.get("Japanese"));
        System.out.println(scores.get("Korean"));
        System.out.println(scores.getOrDefault("Korean", 0));

        scores.putIfAbsent("Java", 77);
        System.out.println(scores.toString());

        System.out.println(scores.containsKey("Math"));
        scores.remove("Math");
        System.out.println(scores.containsKey("Math"));

        scores.forEach((subject, score) -> {
            scores.replace(subject, score - 10);
        });
        System.out.println(scores.toString());

        scores.clear();
        System.out.println(scores.toString());
        System.out.println(scores.isEmpty());
    }

}
