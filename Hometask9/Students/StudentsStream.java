package Hometask9.Students;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentsStream {
    Collection<Student> students = Arrays.asList(
            new Student("Дмитрий", 17, Gender.MAN),
            new Student("Максим", 20, Gender.MAN),
            new Student("Екатерина", 20, Gender.WOMAN),
            new Student("Михаил", 28, Gender.MAN)
    );

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;

        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" + "name= '" + name + '\'' + ", age=" + age + '\'' + ", gender=" + gender + "}";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }

    public static void main(String[] args) {
        StudentsStream studentsStream = new StudentsStream();

        Stream<Student> studentStream = studentsStream.students.stream();
        Stream<Student> menStream = studentStream.filter(s -> s.getGender() == Gender.MAN);
        Collection<Integer> menAges = menStream.map(Student::getAge).collect(Collectors.toList());
        double averageAge = menAges.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Средний возраст студентов мужского пола: " + averageAge);

        studentStream = studentsStream.students.stream();
        Stream<Student> draftStream = studentStream.filter(s -> s.getGender() == Gender.MAN
                && s.getAge() >= 18 && s.getAge() <= 27);
        Collection<String> draftNames = draftStream.map(Student::getName).collect(Collectors.toList());


        System.out.println("Студенты, которым грозит получение повестки: " + draftNames);
    }
}
