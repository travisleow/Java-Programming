import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class DemoStudents {
    public static void main(String[] args) {
        Student [] myStudents = new Student[6];
        int index = 0;

        try {
            File file = new File("students.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s;

            while ((s = br.readLine()) != null) {
                System.out.println(s);
                String [] temp = s.split(",");

                for(int i = 0; i < temp.length; i++) {
                    System.out.println(temp[i]);
                }
                // myStudents[index] = new Student(temp[0],temp[1],temp[2],Integer.parseInt(temp[3]));
                // System.out.println(myStudents[index].getStudentInfo());
                // index++;
            }
            br.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
