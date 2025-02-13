import java.util.Scanner;

public class Loop {
    public static void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
    public static void temperatureInfo(double celsiusTemp) {
        double fahrenheitTemp = (celsiusTemp * 9 / 5) + 32;
        String category;

        if (celsiusTemp < 10) {
            category = "Cold";
        } else if (celsiusTemp <= 25) {
            category = "Warm";
        } else {
            category = "Hot";
        }

        System.out.printf("Temperature: %.2f°F, Category: %s%n", fahrenheitTemp, category);
    }
    public static void calculateDiscount(double totalAmount) {
        double discount;

        if (totalAmount < 100) {
            discount = 0;
        } else if (totalAmount <= 500) {
            discount = totalAmount * 0.10;
        } else {
            discount = totalAmount * 0.20;
        }

        double finalAmount = totalAmount - discount;
        System.out.printf("Discount: RS %.2f, Final Total: RS %.2f%n", discount, finalAmount);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        checkVotingEligibility(age);
        System.out.print("Enter temperature in Celsius: ");
        double celsiusTemp = scanner.nextDouble();
        temperatureInfo(celsiusTemp);
        System.out.print("Enter total purchase amount: ");
        double totalAmount = scanner.nextDouble();
        calculateDiscount(totalAmount);
        scanner.close();
    }
}