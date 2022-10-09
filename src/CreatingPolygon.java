import java.util.Arrays;
import java.util.Scanner;

public class CreatingPolygon {
    public static int maxPerimeter(int n, int[] sides) {
        Arrays.sort(sides);
        int sum = 0;
        for (int num : sides)
            sum += num;
        for (int i = n - 1; i >= 0; i--) {
            if (sides[i] < (sum - sides[i]))
                return sum;
            else sum -= sides[i];
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sides = new int[n];
        for (int i = 0; i < n; i++)
            sides[i] = sc.nextInt();
        System.out.println(maxPerimeter(n, sides));
    }
}
