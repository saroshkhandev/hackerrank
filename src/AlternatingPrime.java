import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlternatingPrime {
    public static int minPenalty(int[] arr) {
        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> nonPrime = new ArrayList<>();
        for(int num : arr) {
            if(isPrime(num))
                prime.add(num);
            else
                nonPrime.add(num);
        }
        Collections.sort(prime);
        Collections.sort(nonPrime);

        int min = 0;
        if(prime.size() == nonPrime.size())
            return min;
        if(prime.size() > nonPrime.size()) {
            int diff = prime.size() - nonPrime.size() - 1;
            for(int i = 0; i < diff; i++) {
                min += prime.get(i);
            }
        } else {
            int diff = nonPrime.size() - prime.size() - 1;
            for(int i = 0; i < diff; i++) {
                min += nonPrime.get(i);
            }
        }

        return min;

    }



    public static boolean isPrime(int num) {
        if(num < 2)
            return false;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minPenalty(arr));
    }
}
