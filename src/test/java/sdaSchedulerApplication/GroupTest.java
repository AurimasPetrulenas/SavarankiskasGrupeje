package sdaSchedulerApplication;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {

    @Test
    void testAddStudentInGroup() throws MaximumNumberOfStudentsReached {
        Student student1 = new Student("Tomas", "Tomauskas",24, true);
        Set<Student> students1 = new HashSet<>();
        students1.add(new Student("Tomas", "Tomaitis",24, true));
        students1.add(new Student("Tomas", "Tomaitis",24, true));
        students1.add(new Student("Tomas", "Tomaitis",24, true));
        students1.add(new Student("Tomas", "Tomaitis",24, true));
        students1.add(new Student("Tomas", "Tomaitis",24, true));

        Group group = new Group();
        group.setStudents(students1);
        //assertThat(group.addStudentInGroup(student1))


    }
}