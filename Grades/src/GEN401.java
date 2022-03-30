import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GEN401 {

    static Scanner scanner = new Scanner(System.in);

    static double Midterm;
    static double Final;
    static double Average;


    GEN401(double Midterm, double Final){

        this.Midterm = Midterm;
        this.Final = Final;

    }

    public static void GEN401_Grades(){
        System.out.println("What's your Midterm Grade ?");
        Midterm = scanner.nextDouble();
        System.out.println("What's your Final Grade ?");
        Final = scanner.nextDouble();

        Average =(Midterm*0.4) + (Final*0.6) ;

        try {
            FileWriter myWriter = new FileWriter("GEN401.txt");
            myWriter.write("GEN401 GRADES:"+ "\nMidterm Grade : "+ Midterm + "\nFinal Grade : "+ Final + "\nAverage Grade : " + Average);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }

    public static String Grades(){
        String all = "";
        try {
            File grade = new File("GEN401.txt");
            Scanner myReader = new Scanner(grade);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }return "\nComeback Later";

    }

}




