
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.StreamHandler;
import java.util.stream.Collectors;
public class Main{

    public static void main(String[] args) {
        List<Course> courses = Arrays.asList(
                new Course("as", "ad", "af", 23),
                new Course("ad", "at", "pa", 13)
        );
         Course course = new Course("as","ad","12",23);
         course.CountStudentsEnrolledInaSpecificCourseId();
         course.StudentsEnrolled();
         course.FilterCourseLessThan5Studets();
         course.SortByNumberOfStudents();



    }
}