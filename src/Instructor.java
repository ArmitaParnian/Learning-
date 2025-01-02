import java.util.*;
import java.io.*;
import java.util.function.*;
public class Instructor extends Person{


List<Course> teachingCourses = new ArrayList<>();
public void TeachingCourses(){
    teachingCourses.stream()
            .map(stu -> stu.courseId.toUpperCase()).toList()
            .forEach(System.out::println);
}
public void FIndAll(){
        System.out.println("\find all students thought");
        teachingCourses.stream().map(stu -> stu.courseName.toUpperCase()).toList()
                .forEach(System.out::println);
}
    @Override
    public void ShowDetails() {
        System.out.println("Name:"+name + "InstructorId:"+ id + ",Email:" + email);
    }

    public Instructor(String id, String name, String email, int Age) {
        super(id, name, email, Age);
    }
}
