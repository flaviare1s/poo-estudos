package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] codes = new int[2];
        int[] codes2 = {789, 123};
        codes[0] = 123;
        codes[1] = 456;

        System.out.println(Arrays.toString(codes));
        System.out.println(codes2[0]);
        System.out.println(codes2.length);
    }
}
