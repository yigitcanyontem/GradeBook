import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BIO102 {

    static Scanner scanner = new Scanner(System.in);

    static double Homework;
    static double Midterm;
    static double Final;
    static double Average;


    BIO102(double Midterm,double Homework, double Final){

        this.Midterm = Midterm;
        this.Homework = Homework;
        this.Final = Final;

    }

    public static void BIO102_Grades(){
        System.out.println("What's your Midterm Grade ?");
        Midterm = scanner.nextDouble();
        System.out.println("What's your Homework Grade ?");
        Homework = scanner.nextDouble();
        System.out.println("What's your Final Grade ?");
        Final = scanner.nextDouble();

        Average =(Midterm*0.3) + (Homework*0.1) + (Final*0.6) ;

        try {
            FileWriter myWriter = new FileWriter("BIO102.txt");
            myWriter.write("BIO102 GRADES:"+ "\nMidterm Grade : "+ Midterm + "\nHomework Grade :" + Homework + "\nFinal Grade : "+ Final + "\nAverage Grade : " + Average);
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
            File grade = new File("BIO102.txt");
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



