import java.util.ArrayList;
import java.util.Scanner;

public class ZNumber {
    public static boolean isZNumber(int n) {
        if(n < 10 && n >= 0)
            return true;
        ArrayList<Integer> list = new ArrayList<>();
        while(n != 0) {
            list.add(n % 10);
            n = n / 10;
        }
        // symbols are 1 less than total numbers;
        char[] state = new char[list.size() - 1];
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) > list.get(i + 1))
                state[i] = 'g';
            else if(list.get(i) < list.get(i + 1))
                state[i] = 's';
            else
                return false;
        }

        int count = 0;
        for(int i = 0; i < state.length; i++) {
            if(state[i] == 'g')
                count++;
            else
                count--;

            if(count < - 1 || count > 1)
                return false;
        }

        return true;
    }

    public static int zCount(int n) {
        int count = 0;
        for(int i = 0; i <= n; i++) {
            if(isZNumber(i))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(zCount(n));
    }
}
