import java.util.*;
import java.io.*;
import java.util.function.*;
public class Admin extends Person{
    public Admin(String id, String name, String email, int Age) {
        super(id, name, email, Age);
    }
    List<Person> persons = new ArrayList<>();
    public void Thought(){
        System.out.println("\n Students sorted by age: ");
        persons.stream()
                .filter( person -> person.Age > 20 )
                .sorted(Comparator.comparingInt((Person::age)));
    }


    public static void main(String[] args) {

       List<Person> p = new ArrayList<>();



    }
}
