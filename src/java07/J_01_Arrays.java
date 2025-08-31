package java07;

import java.util.Arrays;

public class J_01_Arrays {

    public static void main(String[] args) {
        // char[] vowels = {'a', 'i', 'u', 'e', 'o'};
        char[] vowels = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'i';
        vowels[2] = 'u';
        vowels[3] = 'e';
        vowels[4] = 'o';

        System.out.println("Value by index: " + vowels[1]);
        System.out.println("Length: " + vowels.length);
        System.out.println("Index of value: " + Arrays.binarySearch(vowels, 'i'));

        System.out.println("To String: " + Arrays.toString(vowels));
        Arrays.sort(vowels);
        System.out.println("To String: " + Arrays.toString(vowels));

        Arrays.fill(vowels, 'x');
        System.out.println("To String: " + Arrays.toString(vowels));

        Arrays.fill(vowels, 1, 4, 'y');
        System.out.println("To String: " + Arrays.toString(vowels));

        // *
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = nums1;
        int[] nums3 = Arrays.copyOf(nums1, nums1.length);

        System.out.println(nums1 == nums2);
        System.out.println(nums1 == nums3);
        System.out.println(Arrays.equals(nums1, nums2));
        System.out.println(Arrays.equals(nums1, nums3));

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));

        Arrays.fill(nums1, 0);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));

    }

}
