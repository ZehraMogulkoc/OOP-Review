import java.io.IOException;
import java.util.Scanner;
public class Main {
    static String path = "C:/Users/Lenovo/Desktop/";

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the input file name");
        String input= sc.next();
        System.out.println("Please enter the output file name");
        String output= sc.next();
        System.out.println("Please enter your preferences as type of screen or fıle");
        UserPreferences pref;
        try {
            pref = UserPreferences.valueOf(sc.next().toUpperCase());
      }catch (Exception e){
            throw new IllegalArgumentException("Invalid preference value: " + e);
      }

        ReadZehra readZ=new Reading(path+input, path+output, pref);
        WriteZehra writeZ=new Writing(path+input, path+output, pref);

        writeZ.write(readZ.read());
        //sol taraflar hep interface olsun

    }
}