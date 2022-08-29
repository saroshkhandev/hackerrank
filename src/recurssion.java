public class recurssion {
    public static int fact(int n) {
        if(n == 0)
            return 1;
        return n*fact(n-1);
    }

    public static int sum(int n) {
        if(n == 1)
            return 1;
        return n + sum(n - 1);
    }

    public static int fib(int n) {
        if(n == 0 || n == 1)
            return n;

        return fib(n-1) + fib(n-2);
    }

    public static void print(int n){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(n);
            return;
        }
        print(n--);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(sum(3));
        System.out.println(fib(10));
    }
}
