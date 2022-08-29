public class Capitalize {
    public static String capitalizeExcept(String str, String[] arr) {
        String output = "";
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (word.equals(arr[j]))
                    c++;
            }
            if (c == 0)
                output += capitalizeString(word) + " ";
            else
                output += word + " ";
        }

        return output;
    }

    public static String capitalizeString(String str) {
        char ch = str.charAt(0);
        return Character.toUpperCase(ch) + str.substring(1);
    }

    public static long countWays(int n) {
        long dp[][] = new long[2][n + 1];
        dp[0][1] = 1;
        dp[1][1] = 2;

        for(int i = 2; i <= n; i++) {
            dp[0][i] = dp[0][i - 1] + dp[1][i - 1];
            dp[1][i] = dp[0][i - 1] * 2 + dp[1][i - 1];
        }

        return dp[0][n] + dp[1][n];
    }

    public static void main(String[] args) {
        String s = "this is crazy and fun";
        String[] arr = {"crazy", "fun"};
        System.out.println(capitalizeExcept(s, arr));

        System.out.println(countWays(5));
    }
}
