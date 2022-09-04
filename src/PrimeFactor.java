import java.util.Scanner;

public class PrimeFactor {
    public static int primeFactorsSum(int n) {
        int sum = 0;
        while (n % 2 == 0) {
            sum += 2;
            n = n / 2;
        }

        for (int i = 3; i < Math.sqrt(n); i++) {
            while (n % i == 0) {
                sum += i;
                n = n / i;
            }
        }

        if (n > 2)
            sum += n;

        return sum;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        System.out.println(primeFactorsSum(n));
    }
}
