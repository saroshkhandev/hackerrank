import java.util.Scanner;
import java.util.TreeSet;

public class LongestSubSequence {

    public static int subSequence(int[] arr) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int num : arr) {
            ts.add(num);
        }

        return ts.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(subSequence(arr));
    }
}
