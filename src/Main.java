import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 60000, "IT"),
            new Employee("Anil", 52000, "IT"),
            new Employee("Bob", 55000, "IT"),
            new Employee("Amit", 49000, "IT"),
            new Employee("Charlie", 70000, "HR"),
            new Employee("Arun", 51000, "Finance")
        );

        List<String> filteredNames = employees.stream()
            .filter(e -> e.getSalary() > 50000)
            .filter(e -> "IT".equalsIgnoreCase(e.getDepartment()))
            .filter(e -> e.getName().startsWith("A"))
            .map(Employee::getName) // extract only the name
            .collect(Collectors.toList());

        System.out.println("Qualified employee names:");
        filteredNames.forEach(System.out::println);
    }
}
