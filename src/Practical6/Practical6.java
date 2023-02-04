/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 *
 * @author tantianbao
 */
public class Practical6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s;
            // s = br.readLine();
            while((s=br.readLine())!=null)
                System.out.println(s);

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, "Error in reading file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
