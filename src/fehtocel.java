import java.util.Scanner;
public class fehtocel {
//    public static int sum(int a,int b)
//    {
//        System.out.print("int sum ");
//        return a+b;
//    }
//    public static double sum(double a,double b)
//    {
//        System.out.print("float sum ");
//        return a+b;
//    }

    public static void printAllPairs(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }
    }

    public static void printLargestColumnSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < cols; i++) {
            int sum = 0;
            for(int j = 0; j < rows; j++) {
                sum += arr[j][i];
            }
            if(sum > max) max = sum;
        }
        System.out.println("Largest Column Sum: " + max);
    }

    public static void change(int input[]){
        input = new int[5];
        input[0] = 15;
    }

    public static void printChar(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void reverseString(String str) {
        str = str.trim();
        for(int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }

    public static String reverseWordWise(String input) {
        // Write your code here
        int ws = 0;
        int we = 0;
        input = input.trim();
        input = input + " ";
        String output = "";
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' ') {
                we = i;
                String temp = " " + input.substring(ws, we);
                output = temp + output;
                ws = i+1;
            }
        }

        return output;

    }


    public static void main (String[] args) {
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows: ");
//        int rows = sc.nextInt();
//        System.out.println("Enter the number of columns: ");
//        int cols = sc.nextInt();
//        int[][] arr = new int[rows][cols];
//        for(int i = 0; i < rows; i++) {
//            for(int j = 0; j < cols; j++) {
//                System.out.println("Enter the element for " + i + j + ": ");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        printLargestColumnSum(arr);
//        int arr[] = new int[5];
//        arr[1] = 10;
//        arr = new int[2];
//        System.out.println(arr[0]);
//            int arr[] = new int[5];
//            change(arr);
//            System.out.println(arr[0]);
//        printChar("Sarosh");
//        reverseString("Sarosh is learning Java");
//        String str1 = "abc";
//        String str2 = new String("abc");
//        System.out.println(str1 == str2);
//        String s1 = "abc";
//        String s2 = "abc";
//        String s3 = new String("abc");
//
//        System.out.println(s1.hashCode()); // 96354
//        System.out.println(s2.hashCode()); // 96354
//        System.out.println(s3.hashCode()); // 96354
//
//        System.out.println(s1 == s2); // true
//        System.out.println(s1 == s3); // false
//        System.out.println(s1.equals(s3)); // true
//
//        System.out.println(System.identityHashCode(s1)); // 225534817
//        System.out.println(System.identityHashCode(s2)); // 225534817
//        System.out.println(System.identityHashCode(s3)); // 1878246837

//        String str = "SAROSH";
//        for(int i = 0; i < str.length(); i++) {
//            for(int j = i; j < str.length(); j++) {
//                for(int k = i; k <= j; k++) {
//                    System.out.print(str.charAt(k));
//                }
//                System.out.print(", ");
//            }
//        }

        System.out.println(reverseWordWise("Sarosh is Learning Java"));
    }


}
