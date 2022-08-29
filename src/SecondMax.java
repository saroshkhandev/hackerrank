import java.util.Arrays;

public class SecondMax {
    public static int sMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sMax = max;
        for (Integer num : arr) {
            if (num > max) {
                sMax = max;
                max = num;
            } else if((num > sMax) && (num < max)) {
                sMax = num;
            }
        }
        return sMax;
    }

    public static void main(String[] args) {
        int[] arr = {21, 3, 44, 22, 445, 67, 7, 6, 77};
        System.out.println(sMax(arr));
    }
}
