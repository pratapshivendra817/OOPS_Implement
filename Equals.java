import java.util.Objects;

class Employee {
    private int id;
    private String name;

    
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        if (o == null || getClass() != o.getClass()) return false; 
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name); 
    }

    // Adding toString for better readability
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Equals {
    public static void main(String[] args) {
        // Object comparison
        Employee emp1 = new Employee(1, "Shiv");
        Employee emp2 = new Employee(1, "Shiv");
        Employee emp3 = emp1;

        // equals() comparison (checks state)
        System.out.println("emp1.equals(emp2): " + emp1.equals(emp2)); // true (same state)
        System.out.println("emp1.equals(emp3): " + emp1.equals(emp3)); // true (same reference and state)

        // Printing objects
        System.out.println(emp1); 
        System.out.println(emp2); 
        System.out.println(emp3); 
    }
}
