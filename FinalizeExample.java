public class FinalizeExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called before garbage collection.");
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        obj = null; // Eligible for garbage collection
        System.gc(); // Suggest JVM to run Garbage Collector
    }
}
    

