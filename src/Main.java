import java.util.Scanner;
public class Main {
    static String path = "C:/Users/Lenovo/Desktop/";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the input file name");
        String input= sc.next();
        System.out.println("Please enter the output file name");
        String output= sc.next();
        System.out.println("Please enter your preferences as type of screen or file");
        UserPreferences pref=UserPreferences.valueOf(sc.next().toUpperCase());

        WriteZehra opr=new ReadWrite(path+input, path+output, pref);
        //opr.write(opr.read());
        //sol taraflar hep interface olsun

    }
}