import java.util.*;

public class Course {
    String courseId;
    String courseName;
    String instructorName;

    List<Person> enrolledCourses = new ArrayList<>();

    public void EnrolledCourses() {

        enrolledCourses.stream().count();
    }

    public void SortByEnrolling() {

        enrolledCourses.stream()
                .filter(stu -> stu.getStudents() > 20).count();
    }

    public void SortByStudentCount() {
        System.out.println("\n number of students that allready inrolled");
        enrolledCourses.stream()
                .sorted(Comparator.comparingInt((Person::getStudents)))
                .forEach(System.out::println);
    }


    public void EnrolledCourse() {
        long x=enrolledCourses.stream().map(stu -> stu.getStudents())
                .distinct().count();

        System.out.println(x);


        System.out.println("Course not found");
    }

    public static void main(String[] args) throws Exception {
        Scanner reader= new Scanner(System.in);
        Course course = new Course();
        try{
            course.courseName = args[reader.nextInt()];
        }catch(Exception e){
            throw new CourseNotFoundException("Course not found");
        }
    }
}



