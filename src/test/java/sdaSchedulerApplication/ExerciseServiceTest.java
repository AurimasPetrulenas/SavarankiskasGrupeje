package sdaSchedulerApplication;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseServiceTest {
    private Student student1 = new Student("Tomas", "Tomauskas", 24, true);
    private Student student2 = new Student("Jura", "Jurgaite", 22, false);
    private Student student3 = new Student("Jonas", "Jonaitis", 21, true);
    private Student student4 = new Student("Aidas", "Aidelis", 18, false);
    private Student student5 = new Student("Sarunas", "Jasikevicius", 22, true);
    private Student student6 = new Student("Arvydas", "Sabonis", 20, true);
    private Student student7 = new Student("James", "Cook", 24, false);
    private Student student8 = new Student("Gitanas", "Nauseda", 21, true);
    private Student student9 = new Student("Jonas", "Valanciunas", 24, true);
    private Student student10 = new Student("Aurimas", "Petrulenas", 22, true);
    private Student student11 = new Student("Tomas", "Tomauskas", 24, true);
    private Student student12 = new Student("Irena", "Gaizauskiene", 22, true);
    private Student student13 = new Student("Samanta", "Tomauskiene", 24, true);
    private Student student14 = new Student("Jurgis", "Tomauskas", 24, true);
    private Student student15 = new Student("Aidas", "Buzelis", 24, false);

    private Trainer treiner1 = new Trainer("Jonas", "Jonaitis", 52, true);
    private Trainer treiner2 = new Trainer("Antanas", "Lukminas", 42, true);
    private Trainer treiner3 = new Trainer("Jonas", "Kazlauskas", 56, true);
    private Trainer treiner4 = new Trainer("Petras", "Petraitis", 51, false);


    private Set<Student> students1 = new HashSet<>();
    private Set<Student> students2 = new HashSet<>();
    private Set<Student> students3 = new HashSet<>();
    private Set<Student> students4 = new HashSet<>();


    private Group group1 = new Group();
    private Group group2 = new Group();
    private Group group3 = new Group();
    private Group group4 = new Group();

    List<Group> groups = new ArrayList<>();


    @BeforeEach
    void setUp() throws MaximumNumberOfStudentsReached {
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        students2.add(student5);
        students2.add(student6);
        students2.add(student7);
        students3.add(student8);
        students3.add(student9);
        students4.add(student10);
        students4.add(student11);
        students4.add(student12);
        students4.add(student13);
        students4.add(student14);

        group1.setName("Balandeliai");
        group1.setTrainer(treiner1);
        group1.setStudents(students1);

        group2.setName("Draugai");
        group2.setTrainer(treiner2);
        group2.setStudents(students2);

        group3.setName("Kaimynai");
        group3.setTrainer(treiner3);
        group3.setStudents(students3);

        group4.setName("Kambariokai");
        group4.setTrainer(treiner4);
        group4.setStudents(students4);

        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        groups.add(group4);
        ExerciseService exerciseService = new ExerciseService(groups);
    }

    @Test
    void testStudentsSortByLastName() {
        ExerciseService exerciseService = new ExerciseService(groups);
        List<Student> temporaryList = new ArrayList<>();
        temporaryList.add(student3);

        assertThat(exerciseService.studentsSortByLastName()).isEqualTo(temporaryList);
    }
    @Test
    void testFindBiggestGroup(){
        ExerciseService exerciseService = new ExerciseService(groups);
        assertThat(exerciseService.findBiggestGroup()).isEqualTo(group4);
    }
}