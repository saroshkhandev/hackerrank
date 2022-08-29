import java.util.*;
import java.util.regex.*;
import java.util.regex.Pattern;

public class HelloWorld {
    public static double add(int a, int b) {
        float c = a + b;
        return c;
    }

    public static String timeConversion(String s) {
        // Write your code here
        int hour = Integer.parseInt(s.substring(0, 2));
        String period = s.substring(8);
        if (period.equals("PM")) {
            hour = hour + 12;
            return hour + s.substring(2, 8);
        }
        return s.substring(0, 8);

    }

    public static String timeConversion2(String s) {
        String time = s;
        String listTime[] = time.split(":");
        String hour = listTime[0];
        String minutes = listTime[1];
        String secounds = listTime[2].substring(0, 2);
        String caser = listTime[2].substring(2, 4);
        if (caser.equals("AM")) {
            if (hour.equals("12"))
                hour = "00";

            return hour + ":" + minutes + ":" + secounds;
        } else {
            if (!hour.equals("12")) {
                int h = Integer.parseInt(hour);
                h = h + 12;
                hour = "" + h;
            }
            return hour + ":" + minutes + ":" + secounds;
        }

    }

    public static void main(String[] args) {
//        System.out.print(add(10,3));
//        Scanner sc = new Scanner(System.in);
//        System.out.println(timeConversion2("07:05:45AM"));
//        String[] nums = sc.nextLine().split(" ");
//        System.out.println(Arrays.toString(nums));
//        int value = 32;
//        value = (int) (Math.ceil(value / 5.0) * 5.0);
////        int multipleOf5 = 5 * ( value / 5 );
//        int[] val = new int[5];
//        System.out.println(++val[0]);
//        System.out.println(value);
        Scanner in = new Scanner(System.in);
        String pattern = in.nextLine();
        System.out.println(Pattern.compile(pattern));



    }
}
