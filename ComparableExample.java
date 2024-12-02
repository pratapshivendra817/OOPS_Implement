
import java.util.ArrayList;
import java.util.Collections;


    class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
      //compareTo Method
    @Override
    public int compareTo(Student other) 
    {
       return this.name.compareTo(other.name);
    }
    @Override
    public String toString()
    {
        return "Student{name='" + name + "' , age=" + age + "}";
    }

    public class ComparableExample
    {
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();

            students.add(new Student("Shive", 25));
            students.add(new Student("Sona", 20));
            students.add(new Student("Sanoo", 22));

            
            Collections.sort(students); 

            System.out.println("Sorted by name : " + students);

        }
    }
}
    

