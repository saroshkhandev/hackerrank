import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class KungFuPanda {
    public static int totalDumplings(int[] dumplings) {
        int total = 0;
        int size = dumplings.length;
        while(dumplings.length > 0) {
            int p = dumplings[0];
            int index = 0;
            total += p;
            int[] temp = new int[size];
            size = 0;
            for(int i = 1; i < dumplings.length; i++) {
                if(dumplings[i] != (p + 1) && dumplings[i] != (p - 1)) {
                    temp[index] = dumplings[i];
                    index++;
                    size++;
                }
            }
            dumplings = temp;
        }
        String s = "sadf";
        char ch = 'a';
        char ch1 = Character.toUpperCase(ch);
        return total;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dumplings = new int[n];
        for(int i = 0; i < n; i++) {
            dumplings[i] = sc.nextInt();
        }

        System.out.println(totalDumplings(dumplings));
    }
}
