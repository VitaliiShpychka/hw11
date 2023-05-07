package home3;


import java.util.stream.Collectors;
import java.util.Arrays;


public class MainTest3 {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};

        String sortedNumbers = Arrays.stream(arr)
                .flatMap(str -> Arrays.stream(str.split(",\\s*")))
                .map(String::trim)
                .map(Integer::valueOf)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(sortedNumbers);
    }
}
