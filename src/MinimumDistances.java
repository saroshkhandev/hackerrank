import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumDistances {
    public static int minDist(List<Integer> a) {
        int dist = 0;
        ArrayList<Integer> distances = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            int element = a.get(i);
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(j) == element) {
                    dist = j - i;
                    distances.add(dist);
                }
            }
        }

        if(distances.size() == 0)
            return -1;

        return Collections.min(distances);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> values = IntStream.range(0, n).mapToObj(i -> sc.nextInt()).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(minDist(values));
    }
}
