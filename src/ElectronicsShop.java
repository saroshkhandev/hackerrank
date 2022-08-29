import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ElectronicsShop {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> keyboards = IntStream.range(0, n).mapToObj(i -> sc.nextInt()).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> drives = IntStream.range(0, m).mapToObj(i -> sc.nextInt()).collect(Collectors.toCollection(ArrayList::new));

        int max = -1;
        int val;

        for (Integer keyboard : keyboards) {
            for (Integer drive : drives) {
                val = keyboard + drive;
                System.out.println("Every Val: " + val);
                if (val >= max && val < b) {
                    max = val;
                }
            }
        }

        System.out.println(max);
    }
}
