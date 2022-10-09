import java.util.Scanner;

public class PalindromeConversion {
    public static int convertPalindrome(int n) {
        if(isPalindrome(n))
            return n;
        int result = n + reverseInt(n);
        return convertPalindrome(result);
    }

    public static int reverseInt(int n) {
        int rev = 0;
        while(n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n) {
        int rev = reverseInt(n);
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(convertPalindrome(n));
    }
}
