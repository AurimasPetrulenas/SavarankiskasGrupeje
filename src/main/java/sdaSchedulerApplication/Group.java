package sdaSchedulerApplication;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Group {
    private String name;
    private Trainer trainer;
    private Set<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Student> getStudents() {
        List<Student> studentsList = new ArrayList<>();
        for (Student student : students) {
            studentsList.add(student);

        }
        return studentsList;

    }

    public void setStudents(Set<Student> students) throws MaximumNumberOfStudentsReached {
        if (students.size() < 6) {
            this.students = students;
        } else {
            throw new MaximumNumberOfStudentsReached();

        }

    }

    public void addStudentInGroup(Student student) throws MaximumNumberOfStudentsReached {
        if (students.size() < 5) {
            students.add(student);

        } else {
            throw new MaximumNumberOfStudentsReached();

        }

    }
}
