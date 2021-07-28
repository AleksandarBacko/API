package day61_exeption_hendeling.checked_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        try {
            String path="src/day61_exeption_hendeling/checked_exceptions/data.txt";
            List<String>list= Files.readAllLines(Paths.get(path));
            for(String line : list){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
