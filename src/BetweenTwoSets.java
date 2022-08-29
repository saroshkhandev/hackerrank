import java.util.*;

public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int start = a.get(a.size() - 1);
        int end = b.get(0);
        int count = 0;

        for(int i = start; i <= end; i++) {
            int c1 = 0, c2 = 0;
            for(Integer aNum : a) {
                if(i % aNum != 0) {
                    c1++;
                    break;
                }
            }
            if(c1 > 0)
                continue;

            for(Integer bNum : b) {
                if(bNum % i !=0) {
                    c2++;
                    break;
                }
            }

            if(c2 > 0)
                continue;

            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(2);
        a.add(4);
        b.add(16);
        b.add(32);
        b.add(96);
        System.out.println(getTotalX(a, b));
    }
}
