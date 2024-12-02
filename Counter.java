public class Counter {

    // Static variable to hold the count
    private static int count = 0;

    // Static method to increment the count
    public static void incrementCount() {
        count++;
    }

    // Static method to get the current count
    public static int getCount() {
        return count;
    }

    // Instance method for demonstration
    public void display() {
        System.out.println("This is an instance method");
    }
}

 class StatickeywordExample {
    public static void main(String[] args) {
        // Increment the count using the static method
        Counter.incrementCount();
        Counter.incrementCount();

        // Display the static variable
        System.out.println("Counter count (Static variable): " + Counter.getCount());

        // Create an instance of Counter
        Counter counter = new Counter();

        // Call the instance method using the object
        counter.display();

        // Increment count again using the static method
        Counter.incrementCount();

        // Display the count after the increment
        System.out.println("Current count after instance call (Static method): " + Counter.getCount());
    }
}
