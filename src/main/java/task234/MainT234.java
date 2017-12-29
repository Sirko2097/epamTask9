package task234;

import java.util.*;
import java.util.function.Predicate;

public class MainT234 {
    public static void main(String[] args) {
        System.out.println("Task 2: ");

        Integer[] integers = new Integer[25];
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i< integers.length; i++) {
            integers[i] = new Random().nextInt(100);
            char letter = (char)(new Random().nextInt(122 - 97) + 97);
            list.add(Character.toString(letter));
        }

        System.out.println("Array of integer: " + Arrays.toString(integers));
        System.out.println("Array of strings: " + list);

        Arrays.sort(integers, (elem1, elem2) -> (elem2.compareTo(elem1)));
        list.sort((str1, str2) -> (str2.compareTo(str1)));
        System.out.println("Sorted array of integers: " + Arrays.toString(integers));
        System.out.println("Sorted array of strings: " + list);


    }

    private static Integer getInteger(Integer[] integers, Predicate<Integer> predicate) {
        int sum = 0;
        for (Integer elem : integers) {
            if (predicate.test(elem)) {
                sum += elem;
            }
        }
        return sum;
    }

}
