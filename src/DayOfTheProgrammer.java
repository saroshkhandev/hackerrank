import java.util.Scanner;

public class DayOfTheProgrammer {
    public static String getDay(int year) {
        if (year == 1918) {
            return "26.09." + Integer.toString(year);

        } else if (year <= 1917) {
            if (year % 4 == 0) {
                return "12.09." + Integer.toString(year);
            } else {
                return "13.09." + Integer.toString(year);

            }
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                return "12.09." + Integer.toString(year);

            } else {
                return "13.09." + Integer.toString(year);

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println(getDay(year));
    }
}
