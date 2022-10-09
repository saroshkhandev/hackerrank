import java.util.Scanner;

public class FindMissingElement {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n - 1];
        int[] c = new int[n - 2];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n - 1; i++)
            b[i] = sc.nextInt();
        for (int i = 0; i < n - 2; i++)
            c[i] = sc.nextInt();

        findMissingElement(a, b, c, n);
    }

    public static void findMissingElement(int[] a, int[] b, int[] c, int n) {
        int sumA = arraySum(a);
        int sumB = arraySum(b);
        int sumC = arraySum(c);

        System.out.println(sumA - sumB);
        System.out.println(sumB - sumC);
    }
}
