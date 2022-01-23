package sdaSchedulerApplication;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;

}
