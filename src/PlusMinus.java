import java.util.*;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pcounter = 0, ncounter = 0, zcounter = 0;

        for(Integer num : arr) {
            if(num > 0)
                pcounter++;
            else if(num < 0)
                ncounter++;
            else
                zcounter++;
        }

        double positiveAvg = (double) pcounter / arr.size();
        double negativeAvg = (double) ncounter / arr.size();
        double zeroAvg = (double) zcounter / arr.size();

        System.out.println(positiveAvg);
        System.out.println(negativeAvg);
        System.out.println(zeroAvg);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(list);
    }
}
