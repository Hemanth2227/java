import java.util.Scanner;

public class SwitchCases {
    
    public static void getDayOfWeek(int dayNum) {
        switch (dayNum) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
    }
    public static void categorizeGrade(char grade) {
        switch (Character.toUpperCase(grade)) {  // Convert to uppercase to handle lowercase input
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Average"); break;
            case 'D': System.out.println("Below Average"); break;
            case 'F': System.out.println("Fail"); break;
            default: System.out.println("Invalid grade! Please enter A, B, C, D, or F.");
        }
    }
    public static void simpleCalculator(char operation, double num1, double num2) {
        switch (operation) {
            case '+': System.out.println("Result: " + (num1 + num2));
                break;
            case '-': System.out.println("Result: " + (num1 - num2)); 
                break;
            case '*': System.out.println("Result: " + (num1 * num2)); 
                break;
            case '/': 
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default: System.out.println("Invalid operation! Please enter +, -, *, or /.");
        }
    }    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int dayNum = scanner.nextInt();
        getDayOfWeek(dayNum);
        System.out.print("Enter a grade (A, B, C, D, F): ");
        char grade = scanner.next().charAt(0);
        categorizeGrade(grade);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        simpleCalculator(operation, num1, num2);

        scanner.close();
    }
}