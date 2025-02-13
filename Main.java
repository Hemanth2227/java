import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int Num = 97;
        float f = 97.75f;
        char ch = 'C';
        boolean h = true;
        String name = "Hemanth";
    
        System.out.println("Hello World!");
        System.out.println("My name is: " + name);
        System.out.println("My jersy number is:" + Num);
        System.out.println("Float : " +f);
        System.out.println("Character : "  +ch);
        System.out.println("Boolean: " +h);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAssignment Operators:");
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b= scanner.nextInt();
        
        System.out.println("Initial values: a = " + a + ", b = " + b);
        a += b; 
        System.out.println("After a += b: a = " + a); 
        a -= b;
        System.out.println("After a -= b: a = " + a); 
        a *= b;
        System.out.println("After a *= b: a = " + a); 
        a /= b;
        System.out.println("After a /= b: a = " + a); 
        a %= b;
        System.out.println("After a %= b: a = " + a); 

        System.out.print("Enter the first integer: ");
        int c = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int d = scanner.nextInt();

        System.out.println("\nComparison Operators:");
        System.out.println("c = " + c + ", d = " + d);
        System.out.println("c == d: " + (c == d));
        System.out.println("c != d: " + (c != d));
        System.out.println("c > d: " + (c > d)); 
        System.out.println("c < d: " + (c < d)); 
        System.out.println("c >= d: " + (c >= d));
        System.out.println("c <= d: " + (c <= d));

        System.out.println("\nString Comparison:");
        String name1 = "Hemanth";
        String name2 = "Hemanth";
        String name3 = "Kumar";

        System.out.println("name1 == name2: " + (name1 == name2)); 
        System.out.println("name1 == name3: " + (name1 == name3)); 
        System.out.println("name1 != name2: " + (name1 !=name2));
        System.out.println("name1 != name3: " + (name1 != name3));

        scanner.close();
       
    }
}