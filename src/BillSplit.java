import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BillSplit {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int amount = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i == k) {
                continue;
            }
            amount += bill.get(i);
        }
        System.out.println("amount: " + amount);
        System.out.println("b: " + b);

        if (amount/2 == b)
            System.out.println("Bon Appetit");
        else {
            int actual = b - amount/2;
            System.out.println(actual);
        }

    }

    public static void main(String[] args) {
        List<Integer> bill = Arrays.asList(3, 10, 2, 9);
        bonAppetit(bill, 1, 12);
    }
}
