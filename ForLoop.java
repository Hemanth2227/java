public class ForLoop {
    public static void main(String[] args) {
        int limit = 30;
        int number = 7;
        int digitNumber = 2227;

        // Prime Numbers
        System.out.print("Prime numbers up to " + limit + ": ");
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Multiplication 
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Sum of Digits
        int sum = 0;
        for (int n = digitNumber; n > 0; n /= 10) {
            sum += n % 10;
        }
        System.out.println("Sum of digits of " + digitNumber + " is: " + sum);
    }
}