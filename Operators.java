public class Operators {
    public static void main(String[] args) {
        System.out.println("Assignment Operators:");
        int a = 10, b = 5;
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

        a = 10;
        b = 5;

        System.out.println("\nComparison Operators:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b)); 
        System.out.println("a < b: " + (a < b)); 
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\nString Comparison:");
        String name1 = "Hemanth";
        String name2 = "Hemanth";
        String name3 = "Kumar";

        System.out.println("name1 == name2: " + (name1 == name2)); 
        System.out.println("name1 == name3: " + (name1 == name3)); 
        System.out.println("name1 != name2: " + (name1 !=name2));
        System.out.println("name1 != name3: " + (name1 != name3));
       
    }
}