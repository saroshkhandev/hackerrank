import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s += " ";

        Stack<String> st = new Stack<>();

        String str = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                st.push(str);
                str = "";
            } else {
                str += s.charAt(i);
            }
        }

        String ans = "";
        while(st.size() != 1) {
            ans = ans + st.peek() + " ";
            st.pop();
        }
        ans += st.peek();
        System.out.println("Before Revers: ");
        System.out.println(s);
        System.out.println("After Reverse: ");
        System.out.println(ans);
    }
}
