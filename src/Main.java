import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1:");
        List<Integer> numsOdd = new ArrayList<>(List.of(1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : numsOdd) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        System.out.println("задание 2:");
        Set<Integer> numsEven = new HashSet<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 7));
        for (Integer num : numsEven) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("Задание 3:");
        List<String> words = new ArrayList<>(List.of("one", "two", "two", "three", "four", "five", "five"));
        Set<String> uniqueWords = new HashSet<>(words);
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println("Задание 4:");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> distinct = new HashSet<>(strings);
        for (String s : distinct) {
            System.out.println(s + ": " + Collections.frequency(strings, s));
        }
    }
}
