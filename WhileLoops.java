public class WhileLoops{
    public static void main(String[] args) {
        int N = 10;  
        int num = 5; 
        int terms = 7; 
        //Sum of Natural Numbers
        int sum = 0, i = 1;
        while (i <= N) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + N + " natural numbers: " + sum);

        //Factorial 
        int factorial = 1, j = num;
        while (j > 1) {
            factorial *= j;
            j--;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);

        //Fibonacci
        int first = 0, second = 1, count = 0;
        System.out.print("Fibonacci Sequence (" + terms + " terms): ");
        while (count < terms) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            count++;
        }
        System.out.println(); 
    }
}