import java.util.Arrays;

public class SubSequences {
    public static String[] findSubSequences(String str) {
        if(str.length() == 0) {
            return new String[]{""};
        }
        String[] smallAns = findSubSequences(str.substring(1));
        String[] ans = new String[2 * smallAns.length];

        int k = 0;
        for(int i = 0; i < smallAns.length; i++) {
            ans[i] = smallAns[i];
            k++;
        }

        for(int i = 0; i < smallAns.length; i++) {
            ans[k] = str.charAt(0) + smallAns[i];
            k++;
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "xyz";
        System.out.println(Arrays.toString(findSubSequences(str)));
    }
}
