import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
interface Employee {
    String getName();
    double getSalary();
    double calculateBonus();
}
abstract class RegularEmployee implements Employee {
    public String name;
    public double salary;
    public RegularEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
class FullTimeEmployee extends RegularEmployee {
    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }
    public double calculateBonus() {
        return getSalary() * 0.15;
    }
}
class PartTimeEmployee extends RegularEmployee {
    public PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }
    public double calculateBonus() {
        return getSalary() * 0.10;
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Hemanth", 50000));
        employees.add(new PartTimeEmployee("Kumar", 30000));
        employees.add(new FullTimeEmployee("Kiran", 60000));
        employees.add(new PartTimeEmployee("Sudheer", 25000));
        List<Employee> filteredEmployees = employees.stream()
                .filter(e -> e.getSalary() >= 30000 && e.getSalary() <= 55000)
                .collect(Collectors.toList());
        System.out.println("Employees with salary between 30000 and 55000:");
        filteredEmployees.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));
        List<Employee> sortedEmployees = employees.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
        System.out.println("\nEmployees sorted by name:");
        sortedEmployees.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));
        System.out.println("\nEmployee Bonuses:");
        employees.forEach(e -> System.out.println(e.getName() + " - Bonus: " + e.calculateBonus()));
    }
}