package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SimpleCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String delimiter = "[,\n]";
        if (numbers.startsWith("//")) {
            int index = numbers.indexOf("\n");
            delimiter = Pattern.quote(numbers.substring(2, index));
            numbers = numbers.substring(index + 1);
        }

        String[] nums = numbers.split(delimiter);
        int sum = 0;
        List<Integer> negatives = new ArrayList<>();

        for (String num : nums) {
            int n = Integer.parseInt(num);
            if (n < 0) {
                negatives.add(n);
            } else {
                sum += n;
            }
        }

        if (!negatives.isEmpty()) {
            throw new RuntimeException("negative numbers not allowed " +
                    negatives.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(",")));
        }

        return sum;
    }


}
