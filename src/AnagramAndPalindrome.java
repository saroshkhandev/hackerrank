import java.util.Scanner;

public class AnagramAndPalindrome {
    public static int anagramPalindrome(String str) {
        int[] alphabet = new int[26];
        for(int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i) - 97]++;
        }

        int oddCount = 0;
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] % 2 == 1)
                oddCount++;
        }
        if(oddCount > 1)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println(anagramPalindrome(str));
    }
}
