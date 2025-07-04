package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SimpleCalculator {
    public static int add(String numbers) {
        if(numbers.isEmpty()) return 0;
        String delimiter = "[,\n]";
        if (numbers.startsWith("//")) {
            int index = numbers.indexOf("\n");
            delimiter = Pattern.quote(numbers.substring(2, index));
            numbers = numbers.substring(index + 1);
        }
        String[] nums = numbers.split(delimiter);
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

}
