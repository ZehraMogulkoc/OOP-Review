import java.io.*;
import java.util.List;

 class Writing extends FileOperations implements WriteZehra {


     protected Writing(String input, String output, UserPreferences pref) {
         super(input, output, pref);
     }

     public void writeToScreen(List<String> content) {
        System.out.println(content);
    }

    public void writeToFile(List<String> content) throws IOException {
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(this.output));

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
    public void write(List<String> content) throws IOException {
        if (this.pref == UserPreferences.SCREEN) {
            writeToScreen(content);
        } else if (this.pref == UserPreferences.FILE) {
            writeToFile(content);
        }
    }

}

public interface WriteZehra {

    void write(List<String> content) throws IOException;
}
