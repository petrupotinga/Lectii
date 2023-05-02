package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestLambda {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nicolai", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 5.5);
        Student st4 = new Student("Petru", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';

        info.testStudents(students, p1.or(p2));

        List<String> numeBarbati = new ArrayList<>();
        for(Student s :students) {
            if (s.sex == 'm') {
                numeBarbati.add(s.name);
            }
        }

        List<Double> doubles = students.stream()
                .filter(s -> s.sex == 'm')
                .filter(s -> s.avgGrade > 8)
                .map(student -> student.avgGrade)
                .toList();


//        info.testStudents(students, (Student s) -> {
//            return s.age < 30;
//        });
//        info.testStudents(students, s -> s.age <= 18);
//        info.testStudents(students, s -> s.name.startsWith("A"));
// 1
//        info.testStudents(students, new CheckOverGrade());
// 2
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean checks(Student s) {
//                return s.sex == 'f';
//            }
//        });
// 3
//        info.testStudents(students, (Student s) -> {
//            return s.age < 30;
//        });
//// 4
//        info.testStudents(students, student -> {
//            return student.sex == 'f';
//        });
//// 5
//        Function<Student, Double> f = student -> student.avgGrade;
        double rez = avgOfSmth(students, stud -> (double) stud.age);
        System.out.println(rez);
    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double rezult = 0;
        for (Student st : list) {
            rezult += f.apply(st);
        }
        return rezult / list.size();
    }
}

//        interface StudentChecks {
//            boolean checks(Student s);
//        }

class StudentInfo {
    void testStudents(List<Student> students, Predicate<Student> pr) {
        for (Student s : students) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}
//    void printStudentsOverGrade(ArrayList<Student> al1, double grade) {
//        for (Student s : al1) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }

//class CheckOverGrade implements StudentChecks {
//
//    @Override
//    public boolean checks(Student s) {
//        return s.sex == 'f';
//    }
////}
//
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course- s2.course;
//            }
//        });
//        System.out.println(students);
//        Collections.sort(students, (stud1, stud2)->stud1.course-stud2.course);
//        System.out.println(students);


