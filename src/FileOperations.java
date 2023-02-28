
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.List;

public abstract class FileOperations {
    protected String input;
    protected String output;
    protected UserPreferences pref; // enum for the preferences type, it can be either screen or file


    protected FileOperations(String input, String output, UserPreferences pref) { // constructor
        this.input = input;
        this.output = output;
        this.pref = pref;


    }

}
