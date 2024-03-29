import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class PersonUser {

    public void saveObject() {
        File f = new File("Person.dat");
        Person p = new Person("Josh", 35, 69.99);

        try {
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(f));
            outStream.writeObject(p);
            outStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0, null);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0, null);
        }
    }

    public void readObject() {
        File f = new File("Person.dat");
        try {
            ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(f));
            Person inP = (Person) inStream.readObject();
            System.out.println("Name: " + inP.getName());
            System.out.println("Age: " + inP.getAge());
            System.out.println("Salary: " + inP.getSalary());
            inStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        PersonUser pu = new PersonUser();
        // pu.saveObject();
        pu.readObject();
    }
}
