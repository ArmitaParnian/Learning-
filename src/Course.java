import java.util.*;

public class Course {

    String courseId;
    String courseName;
    String instructorName;
    int enrolledStudents;
public Course(String courseId,String courseName,String instructorName,int enrolledStudents ){
    this.courseId=courseId;

    this.courseName=courseName;
    this.instructorName=instructorName;
    this.enrolledStudents = enrolledStudents;
}
List<Person> student;
public Course(List<Person> student){
    this.student = student;
}
    List<Student> getEnrolledStudents = new ArrayList<>();

    public void CountStudentsEnrolledInaSpecificCourseId() {

        System.out.println(getEnrolledStudents.stream().count());

    }


    public void FilterCourseLessThan5Studets(){
       System.out.println(getEnrolledStudents.stream().filter(course -> course.getStudents() < 5));


}



    public void SortByNumberOfStudents() {
        System.out.println("\n number of students that allready inrolled");
        getEnrolledStudents.stream()
                .sorted(Comparator.comparingInt((Person::getStudents)))
                .forEach(System.out::println);
    }


    public void StudentsEnrolled() {
        long x=getEnrolledStudents.stream().map(stu -> stu.getStudents())
                .distinct().count();

        System.out.println(x);
        System.out.println("Course not found");
    }
//exception handeling
    public static void main(String[] args) throws Exception {
        Scanner reader= new Scanner(System.in);
        Course course = new Course("ar","as","ad",13);
        try{
            course.courseName = args[reader.nextInt()];
        }catch(Exception e){
            throw new CourseNotFoundException("Course not found");
        }
        finally{
            reader.close();
        }
    }
}



