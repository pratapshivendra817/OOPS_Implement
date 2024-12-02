import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    
 private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 5000));
        employees.add(new Employee("Alice", 7000));
        employees.add(new Employee("Bob", 6000));

        // Sort by name
        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("Sorted by name: " + employees);

        // Sort by salary (reverse order)
        employees.sort(Comparator.comparingInt(Employee::getSalary).reversed());
        System.out.println("Sorted by salary (descending): " + employees);
    }
}

