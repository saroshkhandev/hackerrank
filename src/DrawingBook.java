import java.util.Scanner;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        int a = p / 2;
        if (p - 1 > n - p || p - 1 == n - p) {
            return (n / 2) - (p / 2);
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(pageCount(n, p));
    }
}
