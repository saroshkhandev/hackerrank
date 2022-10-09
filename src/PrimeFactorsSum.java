import java.util.Scanner;

public class PrimeFactorsSum {
    public static boolean isPrime(int n) {
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }

        return true;
    }

    public static int sumPrimeFactor(int n) {
        int sum = 0;
        for(int i = 2; i <= n; i++) {
            if(n % i == 0 && isPrime(i))
                sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumPrimeFactor(n));
    }
}
