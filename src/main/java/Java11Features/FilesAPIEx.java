package Java11Features;

import java.nio.file.Files;
import java.nio.file.Path;

public class FilesAPIEx {
    public static void main(String[] args) throws Exception {
        Path path = Files.writeString(Files.createTempFile("siva", ".txt"), "Java 11 is cool");
        String s = Files.readString(path);
        System.out.println(s);
    }
}
