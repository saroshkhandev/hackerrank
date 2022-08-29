import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        str = str + " ";
        int start = 0;
        int end;
        String rev = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                end = i;
                String word = str.substring(start, end);
                for(int j = word.length() - 1; j >= 0; j--) {
                    rev += word.charAt(j);
                }
                rev += " ";
                start = end + 1;
            }
        }
        System.out.println(rev);

    }
}
