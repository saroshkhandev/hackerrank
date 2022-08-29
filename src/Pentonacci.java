public class Pentonacci {
    public static int pentonacciSeries(int n) {
        if(n <= 1)
            return n;

        return pentonacciSeries(n - 1) + pentonacciSeries(n - 2) + pentonacciSeries(n - 3) + pentonacciSeries(n - 4) + pentonacciSeries(n - 5);
    }

    public static void main(String[] args) {
        System.out.println(pentonacciSeries(100));
    }
}
