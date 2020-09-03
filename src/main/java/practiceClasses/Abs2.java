package practiceClasses;

import java.util.*;
import java.util.function.Predicate;

public class Abs2 extends Abs {

    @Override
    protected String avd(String s) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(ArrayMaxValue(new int[]{-3, -2, -1}));
    }

    public static int ArrayMaxValue(int[] A) {
        // write your code in Java SE 8
        int maxValue = Integer.MIN_VALUE;
        for (int in : A) {
            if ((in > maxValue))
                maxValue = in;
        }
        return maxValue;
    }

    public static int ArrayMinValue(int[] A) {
        int minValue = Integer.MAX_VALUE;
        for (int each : A) {
            if (each < minValue)
                minValue = each;
        }
        return minValue;
    }

    public static int arr(int[] arr) {
        List<Integer> list =  new ArrayList<>();
        Predicate predicate = p -> p.equals("kn");
     return 0;
    }
}
