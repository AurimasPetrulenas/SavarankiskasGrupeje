package sdaSchedulerApplication;

public class Trainer extends Person{
    boolean isExperienced;

    public Trainer(String firstName, String lastName, int age, boolean isExperienced) {
        super(firstName, lastName, age);
        this.isExperienced = isExperienced;

    }
}
