public class Employee {
    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding equals for state-based equality
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }

    // Standalone class for comparison
    public static class Equals {
        public static void main(String[] args) {
            // Primitive comparison
            int a = 5;
            int b = 5;
            System.out.println("a == b: " + (a == b)); // true (value comparison)

            // Object comparison
            Employee emp1 = new Employee(1, "Shive");
            Employee emp2 = new Employee(1, "Shive");
            Employee emp3 = emp1;

            // == comparison (checks references)
            System.out.println("emp1 == emp2: " + (emp1 == emp2)); // false (different references)
            System.out.println("emp1 == emp3: " + (emp1 == emp3)); // true (same reference)

            // equals() comparison (checks state)
            System.out.println("emp1.equals(emp2): " + emp1.equals(emp2)); // true (same state)
            System.out.println("emp1.equals(emp3): " + emp1.equals(emp3)); // true (same reference and state)
        }
    }
}
