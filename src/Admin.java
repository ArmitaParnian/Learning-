import java.lang.module.InvalidModuleDescriptorException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Admin extends Person {

    public Admin(String id, String name, String email, int Age) {
        super(id, name, email, Age);
    }

    @Override
    public void ShowDetails() {

    }

    List<String> permissions = new ArrayList<>();

    // read and edit files
    public void ReadFile() throws IOException {








        Scanner reader = new Scanner(System.in);
        File file = new File(permissions.toString());
        FileWriter fr = null;
        try {

            fr = new FileWriter(file);
            fr.write(reader.nextLine());


        } catch (IOException e) {
            System.out.println("an error recorded");
        } finally {
            fr.close();
        }

    }


}