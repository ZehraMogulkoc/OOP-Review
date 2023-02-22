
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite implements WriteZehra {
    private String input;
    private String output;
    private UserPreferences pref; // enum for the preferences type, it can be either screen or file

    protected ReadWrite (String input, String output, UserPreferences pref) { // constructor
        this.input = input;
        this.output = output;
        this.pref = pref;
    }

    @Override
    public void write(List<String> content) {
        if (pref == UserPreferences.SCREEN) {
            writeToScreen(content);
        } else if (pref == UserPreferences.FILE) {
            writeToFile(content);
        }
    }

    private void writeToScreen(List<String> content) {
        System.out.println(input);
    }

    private void writeToFile(List<String> content) {
        try {
            PrintWriter writer = new PrintWriter(new File(output));
            for (String line : content) {
                writer.println(line);
            }
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }


    protected List<String> read() throws IOException { // read method
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
