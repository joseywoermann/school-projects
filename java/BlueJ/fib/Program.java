public class Program {
    public static int fib(int n) {
        if (n == 0) { return 0; }
        if (n == 1) { return 1; }
        return (fib(n - 1) + fib(n - 2));
    }
    
    public static void printFib(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));
        }
    }
}