package ch6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise6_20 {
    static int[] shuffle(int[] original) {
        Integer[] tmp = new Integer[original.length]; // Integer 배열 생성
        int[] after = new int[original.length]; // shuffle후 배열 저장할 변수

        for(int i=0;i<original.length; i++) {
            tmp[i] = new Integer(original[i]); // int to Integer
        }

        List<Integer> I = Arrays.asList(tmp); // array to List<Integer>
        Collections.shuffle(I); // shuffle List<Integer>

        for(int i=0;i<original.length; i++) {
            after[i] = tmp[i].intValue(); // Integer to int
        }
        return after;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
