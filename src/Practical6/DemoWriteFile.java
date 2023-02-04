

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class DemoWriteFile {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("abc.txt", true));

            for (int i = 0; i<10;i++) {
                int num = (int) (Math.random()*101);
                pw.println("Student #" + (i+1) + num);
            }
            pw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, "Error in writing file...", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
