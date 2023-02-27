import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Reading implements ReadZehra {

    @Override
    public List<String> read(String input) throws IOException { // read method
        List<String> content = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(input));
            String line;
            while ((line = reader.readLine()) != null) {
                content.add(line);
            }
            reader.close();
            System.out.println("File read successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            throw e;
        }

        return content;
    }

}

public interface ReadZehra {
    List<String> read(String input) throws IOException;
}
