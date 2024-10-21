
import java.io.*;
import java.util.Scanner;

public class ALittleAboutMe {

        public static void main (String [] args){

            try {

                PrintWriter writer = new PrintWriter("MyBio.txt");

                writer.print("Mein Hauptziel in meiner Karriere als Student ist es, meine akademischen Ziele zu erreichen und meinen Abschluss mit herausragenden\nLeistungen zu erlangen.");
                writer.println("Ich bin motiviert, das Beste aus meiner Zeit an der Universität zu machen und mich sowohl beruflich als\nauch persönlich weiterzuentwickeln.");
                writer.print("Ich bin : ");
                writer.println(26 + " Jahre Alt");
                writer.println("Ich bin Studentin an der Universität mannheim und arbeite gerade als Werkstudentin  ");
                writer.println("Bitte etwas über dich erzählen : ");
                writer.close();
                Scanner rc = new Scanner(System.in);
                String rueckMeldung = rc.nextLine();

                FileWriter fileWriter = new FileWriter("MyBio.txt", true);
                PrintWriter appendWriter = new PrintWriter(fileWriter);
                appendWriter.println(rueckMeldung);
                appendWriter.close();

                File file = new File("MyBio.txt");
                Scanner fileReader = new Scanner(file);

                System.out.println("\n ------------- ");
                while (fileReader.hasNextLine()) {
                    System.out.println(fileReader.nextLine());
                }

                fileReader.close();


            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
}
