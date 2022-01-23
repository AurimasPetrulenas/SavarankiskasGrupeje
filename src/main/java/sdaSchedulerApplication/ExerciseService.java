package sdaSchedulerApplication;

import java.text.spi.CollatorProvider;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExerciseService {
    List<Group> groups = new ArrayList<>();

    public ExerciseService(List<Group> groups) {
        this.groups = groups;
    }

    public List<Student> studentsSortByLastName() {
        return groups.stream()
                .flatMap(group -> group.getStudents().stream())
                .sorted(Comparator.comparing(student -> student.getLastName()))
                .collect(Collectors.toList());
    }

    public Group findBiggestGroup() {
        int maxSize = 0;
        Group biggestGroup = null;
        for (Group group : groups) {
            if (group.getStudents().size() > maxSize) {
                maxSize = group.getStudents().size();
                biggestGroup = group;

            }

        }
        return biggestGroup;
    }
}