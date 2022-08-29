import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int totalPairs = 0;
        for (int i = 0; i < ar.size(); i++) {
            int type = ar.get(0);
//            System.out.println("arr: " + ar);
            List<Integer> temp = new ArrayList<>();
            int count = 0;
            for (Integer integer : ar) {
                if (integer == type) {
                    count++;
                } else {
                    temp.add(integer);
                }
            }
//            System.out.println("temp: " + temp);
            ar = temp;
            totalPairs += count / 2;
        }

        return totalPairs;

    }

    public static void main(String[] args) {
        List<Integer> pairs = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        List<Integer> pairs2 = Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);
        List<Integer> pairs3 = Arrays.asList(50, 49, 38, 49, 78, 36, 25, 96, 10, 67, 78, 58, 98, 8, 53, 1, 4, 7, 29, 6, 59, 93, 74, 3, 67, 47, 12, 85, 84, 40, 81, 85, 89, 70, 33, 66, 69, 13, 67, 75, 42, 24, 73, 49, 28, 25, 5,86, 53, 10, 44, 45, 35, 47, 11, 81, 10, 47, 16, 49, 79, 52, 89, 100, 36, 6, 57, 96, 18, 23, 71, 11, 99 ,95 ,12 ,78, 19,16 ,64 ,23 ,77, 7 ,19, 11, 5, 81, 43, 14, 27, 11, 63, 57, 62, 3 ,56 ,50, 9 ,13 ,45);
        System.out.println(sockMerchant(pairs.size(), pairs));
        System.out.println(sockMerchant(pairs2.size(), pairs2));
        System.out.println(sockMerchant(pairs3.size(), pairs3));
    }
}
