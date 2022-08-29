import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int vf = 1;
        int ub = num * num + num;
        int vs;
        int limit = num;
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for(int m = 1; m <= limit; m++) {
                System.out.print(vf + " ");
                vf++;
            }
            vs = (ub + 2) - vf;
            for(int n = 1; n <= limit; n++) {
                System.out.print(vs + " ");
                vs++;
            }
            System.out.println();
            limit--;
        }
    }

}

//      1 2 3 4 17 18 19 20
//        5 6 7 14 15 16
//          8 9 12 13
//            10 11
