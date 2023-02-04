

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class DemoCopy {
    public static void main(String[] args) {
        File inputFile = new File("numbers.txt");
        File outputFile = new File("newNumbers.txt");

        String s;
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            PrintWriter pw = new PrintWriter(new PrintWriter(outputFile));
            
            while ((s=br.readLine()) != null) {
                pw.println(s);
            }
            br.close();
            pw.close();
        } catch (Exception e) {
            System.out.println("test");
        }

    }
}