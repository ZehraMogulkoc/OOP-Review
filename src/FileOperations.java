
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.List;

public class FileOperations implements WriteZehra, ReadZehra {
    private String input;
    private String output;
    private UserPreferences pref; // enum for the preferences type, it can be either screen or file
    private WriteZehra writer;
    private ReadZehra reader;

    protected FileOperations(String input, String output, UserPreferences pref) { // constructor
        this.input = input;
        this.output = output;
        this.pref = pref;


    }


    public void write(List<String> content, UserPreferences pref, String output) throws IOException {
        writer = new Writing();
        writer.write(content, this.pref, this.output);
    }


    public List<String> read(String input) throws IOException { // read method

        reader = new Reading();
        return reader.read(this.input);
    }
}
