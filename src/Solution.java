import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static class Client implements Comparable<Client> {
        int minX, maxY;

        public Client(int minX, int maxY) {
            this.minX = minX;
            this.maxY = maxY;
        }

        @Override
        public int compareTo(Client o) {
            return (o.minX == this.minX) ? this.maxY - o.maxY : this.minX - o.minX;
        }
    }

    static class House implements Comparable<House> {
        int x, y;

        public House(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(House o) {
            return (o.x == this.x) ? this.y - o.y : this.x - o.x;
        }
    }

    static int realEstateBroker(int[][] clients0, int[][] houses0) {
        int cc = clients0.length;
        int hc = houses0.length;
        List<Client> cs = new ArrayList<>(cc+1);
        List<House> hs = new ArrayList<>(hc+1);
        for (int a[] : clients0) cs.add(new Client(a[0], a[1]));
        for (int a[] : houses0) hs.add(new House(a[0], a[1]));
        Collections.sort(cs);
        Collections.sort(hs);
        cs.add(new Client(Integer.MAX_VALUE, Integer.MAX_VALUE));

        int c = 0;
        int h = 0;
        int sold = 0;
        TreeSet<Long> ts = new TreeSet<>(); // unique  min price
        while (c < cc && h < hc) {
            while (h < hc && hs.get(h).x <= cs.get(c).minX)
                h++;
            if (h >= hc)
                break;
            while (c < cc && hs.get(h).x > cs.get(c).minX) {
                ts.add(cs.get(c).maxY * 1000L + c);
                c++;
            }
            while (h < hc && hs.get(h).x <= cs.get(c).minX) {
                Long g = ts.ceiling(hs.get(h).y * 1000L);
                if (g != null) {
                    ts.remove(g);
                    sold++;
                }
                h++;
            }
        }
        return sold;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int c = Integer.parseInt(nm[0].trim());

        int h = Integer.parseInt(nm[1].trim());

        int[][] clients = new int[c][2];

        for (int clientsRowItr = 0; clientsRowItr < c; clientsRowItr++) {
            String[] clientsRowItems = scanner.nextLine().split(" ");

            for (int clientsColumnItr = 0; clientsColumnItr < 2; clientsColumnItr++) {
                int clientsItem = Integer.parseInt(clientsRowItems[clientsColumnItr].trim());
                clients[clientsRowItr][clientsColumnItr] = clientsItem;
            }
        }

        int[][] houses = new int[h][2];

        for (int housesRowItr = 0; housesRowItr < h; housesRowItr++) {
            String[] housesRowItems = scanner.nextLine().split(" ");

            for (int housesColumnItr = 0; housesColumnItr < 2; housesColumnItr++) {
                int housesItem = Integer.parseInt(housesRowItems[housesColumnItr].trim());
                houses[housesRowItr][housesColumnItr] = housesItem;
            }
        }

        int result = realEstateBroker(clients, houses);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}