import java.util.*;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int[] types = new int[5];

        for (Integer element : arr) {
            switch (element) {
                case 1 -> types[0]++;
                case 2 -> types[1]++;
                case 3 -> types[2]++;
                case 4 -> types[3]++;
                case 5 -> types[4]++;
            }
        }

        int max = types[0];
        int index = 1;
        for (int j = 1; j < types.length; j++) {
            if (max < types[j]) {
                max = types[j];
                index = j + 1;
            }
        }
        return index;


//        int maxFreq = 0;
//        int mfe = arr.get(0);
//        for(int i = 0; i < arr.size(); i++) {
//            int freq = 0;
//            int element = arr.get(i);
//            for(int j = i+1; j < arr.size(); j++) {
//                if(arr.get(j) == element)
//                    freq++;
//            }
//            if(freq > maxFreq) {
//                maxFreq = freq;
//                mfe = element;
//            }
//        }
//
//        return mfe;

    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 4, 4, 5, 3);
        System.out.println(migratoryBirds(list));
    }
}
