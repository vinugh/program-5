package prog5;
public class FibonacciSeries {
    public static void main(String[] args) {
        if (args.length == 5) {
            System.out.println("eneter no.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int a = 1, b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}