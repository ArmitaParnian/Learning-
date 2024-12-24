import java.util.*;
import java.io.*;
import java.util.function.*;
public class Instructor extends Person{


List<Person> teachingCourses = new ArrayList<>();
public void StudentsName(){
    teachingCourses.stream()
            .map(stu -> stu.name.toUpperCase()).toList()
            .forEach(System.out::println);
}
public void FIndAll(){
        System.out.println("\find all students thought");
        teachingCourses.stream().map(stu -> stu.name.toUpperCase()).toList()
                .forEach(System.out::println);
}
    @Override
    public void ShowDetails() {
        super.ShowDetails();
    }

    public Instructor(String id, String name, String email, int Age) {
        super(id, name, email, Age);
    }
}
