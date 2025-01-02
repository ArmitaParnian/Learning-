import java.util.*;
import java.io.*;
import java.util.function.*;
public class Student extends Person {

    public Student(String id, String name, String email,int Age) {
        super(id, name, email,Age);
    }


    List<Course> courses = List.of(
            new Course("ar","main","af",12),
            new Course("er","as","af",13)

    );

    List<Student> students = Arrays.asList();

    //list of  courses that taken by any of student
     public void CoursesTakenByStudents(){

         List<String> stucourses = new ArrayList<>();
         stucourses.stream().map(stu-> getStudents());

     }
// list all students older than 20
  
    public void SortByAgeOlderThan20(){
        System.out.println("\n Students sorted by age: ");
             students.stream()
                .filter( person -> person.Age > 20 )
                .sorted(Comparator.comparingInt((Person::age)))
                     .toList()
                     .forEach(System.out::println);
    }
// find all students find by a specific Instructor id
public void findAllStudentsTaughtBySpecificInstructorId(){
ArrayList<Course> instructor = new ArrayList<>();
instructor.stream().map(ins -> ins.courseId).forEach(System.out::println);
}


    public void SortByEnrolling(){
        System.out.println("\n number of syudents aree enrolled:" );

    }




    @Override
    public void ShowDetails() {
        System.out.println("Name:"+name + "StudentId:"+ id + ",Email:" + email);
            }


}
