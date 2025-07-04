package org.example;

import java.util.ArrayList;
import java.util.List;

public class SimpleCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        String[] nums = numbers.split(",");
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
