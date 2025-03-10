public class FibonacciManipulator {
    private int[] fibonacciSeries;
    private int fibonacciSum;
    public int calculateFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
    public int calculateFibonacci(double n) {
        return calculateFibonacci((int) n);
    }
    public void printFibonacciSeries(int n) {
        fibonacciSeries = new int[n];
        fibonacciSeries[0] = 0;
        if (n > 1) fibonacciSeries[1] = 1;

        System.out.print("Fibonacci Series: ");
        System.out.print(fibonacciSeries[0] + " ");
        if (n > 1) System.out.print(fibonacciSeries[1] + " ");

        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
            System.out.print(fibonacciSeries[i] + " ");
        }
        System.out.println();
    }
    public void sumFibonacci(int n) {
        fibonacciSum = 0; 
        int first = 0, second = 1, sum = 0; 

        for (int i = 0; i < n; i++) {
            fibonacciSum += first; 
            sum += first; 
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println("Sum of first " + n + " Fibonacci numbers (using instance variable): " + fibonacciSum);
        System.out.println("Sum of first " + n + " Fibonacci numbers (using local variable): " + sum);
    }
     public static void main(String[] args) {
        FibonacciManipulator fibManipulator = new FibonacciManipulator();
        int n = 10;
        System.out.println("10th Fibonacci number: " + fibManipulator.calculateFibonacci(n));
        fibManipulator.printFibonacciSeries(n);
        fibManipulator.sumFibonacci(n);
        System.out.println("10th Fibonacci number using overloaded method: " + fibManipulator.calculateFibonacci(10.5));
    }
}