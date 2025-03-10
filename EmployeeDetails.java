class Employee {
    public String name;
    public int age;
    public double salary;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be greater than 0.");
        }
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) { 
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary must be non-negative.");
        }
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Kumar");
        employee.setAge(25);
        employee.setSalary(50000);

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
    }
}