import java.util.*;
import java.io.*;
import java.util.function.*;
public class Student extends Person {
    List<Person> enrolledCourses = new ArrayList<>();
     public void EnrolledCourse(){

        enrolledCourses.stream().distinct();
    }
  List<Person> students = new ArrayList<>();
    public void SortByAge(){
        System.out.println("\n Students sorted by age: ");
             students.stream()
                .filter( person -> person.Age > 20 )
                .sorted(Comparator.comparingInt((Person::age)));
    }
    public void SortByEnrolling(){
        System.out.println("\n number of syudents aree enrolled:" );

    }



    public Student(String id, String name, String email,int Age) {
        super(id, name, email,Age);
    }


    @Override
    public void ShowDetails() {
        super.ShowDetails();
    }
}
