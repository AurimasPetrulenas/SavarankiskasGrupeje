package sdaSchedulerApplication;

public class Student extends Person implements Comparable<Student>{
    boolean hasPreviousJavaKnowledge;


    public Student(String firstName, String lastName, int age, boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, age);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;

    }

    @Override
    public int compareTo(Student studentToComapre) {
        return this.getLastName().compareTo(studentToComapre.getLastName());
    }
}
