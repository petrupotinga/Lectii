package Stream;

import java.util.ArrayList;
import java.util.List;

public class TestFlatMap {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nicolai", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 5.5);
        Student st4 = new Student("Petru", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);

        Faculty f1 = new Faculty("Economica");
        Faculty f2 = new Faculty("Matematica");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty ->
                        faculty.getStudentOnFaculty().stream()).
                forEach(e -> System.out.println(e.getName()));
    }
}


class Faculty {
    String name;
    List<Student> studentOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentOnFaculty = new ArrayList<>();

    }

    public List<Student> getStudentOnFaculty() {
        return studentOnFaculty;
    }

    public void addStudentToFaculty(Student st) {
        studentOnFaculty.add(st);
    }
}
