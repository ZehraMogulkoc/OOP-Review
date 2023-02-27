import java.io.*;
import java.util.List;

class Writing implements WriteZehra {


    public void writeToScreen(List<String> content) {
        System.out.println(content);
    }

    public void writeToFile(List<String> content, String output) throws IOException {
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(output));

            for (String line : content) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            throw e;
        }
    }

    @Override
    public void write(List<String> content, UserPreferences pref, String output) throws IOException {
        if (pref == UserPreferences.SCREEN) {
            writeToScreen(content);
        } else if (pref == UserPreferences.FILE) {
            writeToFile(content, output);
        }
    }


}

public interface WriteZehra {

    void write(List<String> content, UserPreferences pref, String output) throws IOException;
}
