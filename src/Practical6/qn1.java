import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class qn1 {
    private static int i = 0;
    public static void main(String[] args) {
        saveMarks();
        System.out.println("Average is " + readMarks());
    }
    public static void saveMarks() {
        File marks = new File("marks.txt");
        try {
            PrintWriter br = new PrintWriter(new FileWriter(marks));

            for(int i=1; i<=10;i++) {
                String input = JOptionPane.showInputDialog(null, "Enter marks for student " + i + " : ");
                br.println(input);
            }
            br.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static double readMarks() {
        double avg=0;
        double total = 0;
        int count = 0;
        
        String marksStr;
        try {
            BufferedReader br = new BufferedReader(new FileReader("marks.txt"));
            while((marksStr = br.readLine())!=null) {
                total += Double.parseDouble(marksStr);
                count++;
            }
            br.close();
            avg = total/count;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return avg;
    }
}
