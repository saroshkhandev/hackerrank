import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PiggyBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] bigB = IntStream.range(0, x).map(i -> sc.nextInt()).toArray();
        int[] smallB = IntStream.range(0, y).map(i -> sc.nextInt()).toArray();
        System.out.println(Arrays.toString(bigB));
        System.out.println(Arrays.toString(smallB));
    }
}
