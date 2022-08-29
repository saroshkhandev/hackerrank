public class MarsExploration {
    public static int sosCheck(String s) {
        // Write your code here
        int one = 0, two = 0, three = 0;
        for (int i = 0; i < s.length() - 2; ) {
            if (s.charAt(i) != 'S')
                one++;

            if (s.charAt(i + 1) != 'O')
                two++;

            if (s.charAt(i + 2) != 'S')
                three++;

            i = i + 3;
        }
        return one + two + three;

    }

    public static void main(String[] args) {
        System.out.println(sosCheck("SOSSPSSQSSOR"));
    }
}
