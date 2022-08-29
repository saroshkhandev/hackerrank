import java.util.Scanner;

public class javaAdvance {

    public static void  fun(int[][] arr2d)
    {

        for(int i=0;i<arr2d.length;i++)
        {
            for(int j=0;j<arr2d[i].length;j++)
            {
                arr2d[i][j]=2*i+j;
            }
        }
    }

    public static int peakElement(int[] input, int len) {
        int peakElement = input[1];
        for(int i = 1; i < len - 2; i++) {
            if(input[i] > input[i - 1] && input[i] > input[i + 1])
                return input[i];
        }

        return peakElement;
    }

    public static void main(String[] args) {

        int[] input = {8, 9, 10, 2, 5, 6};

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int a, b, a1, b1, a2, b2;
            a = sc.nextInt();
            b = sc.nextInt();
            a1 = sc.nextInt();
            b1 = sc.nextInt();
            a2 = sc.nextInt();
            b2 = sc.nextInt();

            if((a == a1 || a == b1) && (b == a1 || b == b1)) {
                System.out.println(1);
            } else if((a == a2 || a == b2) && (b == a2 || b == b2))
                System.out.println(2);
            else
                System.out.println(0);

            t--;
        }
//        System.out.println(peakElement(input, input.length));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Rows: ");
//        int rows = sc.nextInt();
//        System.out.println("Enter Columns: ");
//        int cols = sc.nextInt();
//        int arr [][] = new int[rows][cols];
//        for(int i = 0; i < rows; i++) {
//            for(int j = 0; j < cols; j++) {
//                System.out.println("Enter element at " + i + j + ":");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for(int i = 0; i < rows; i++) {
//            for(int j = 0; j < cols; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int[][] arr = new int[2][2];
//        fun(arr);
//        for(int i=0;i<2;i++)
//        {
//            for(int j=0;j<2;j++)
//            {
//                System.out.print(arr[i][j]+" " );
//            }
//        }
//        int arr[][]=new int [4][];
//        System.out.print(arr[2].length);
    }
}
