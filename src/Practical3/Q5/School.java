package Practical3.Q5;

import Practical3.Q5.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author travi
 */
public class School {

    private Person[] persons;
// used to store lecturer or student objects
    private int numOfPeople;
// used to keep track of the number of people

    public School() {
        numOfPeople = 0; // School is empty initially
        populateSchool();
        displayPopulation();
    }

    public void populateSchool() {
        String inStr = JOptionPane.showInputDialog(
                null,
                "Enter number of people to create: ",
                "School",
                JOptionPane.QUESTION_MESSAGE);
        int size = Integer.parseInt(inStr);
//create Persons array with the size
//entered by the user
// Use a loop, in the loop:
//
// (1) Generate a random number from 1 to 2
// (2) If number is 1,
//add a student object to the persons array.
//You will need to call createStudent() method.
// (3) If the number is 2,
//add a lecturer object to the persons array.
//You will need to call createLecturer() method.
        persons = new Person[size];
        for (int i = 0; i < size; i++) {
            int num = (int) (Math.random() * 2) + 1;
            if (num == 1) {
                persons[i] = createStudent();
            } else {
                persons[i] = createLecturer();
            }
        }
    }

    public Student createStudent() {
        String name = JOptionPane.showInputDialog(
                null,
                "Enter Name:",
                "School - Create Student",
                JOptionPane.QUESTION_MESSAGE);
        String inStr = JOptionPane.showInputDialog(
                null,
                "Enter year of Study:",
                "School - Create Student",
                JOptionPane.QUESTION_MESSAGE);
        char yr = inStr.charAt(0);
//Create a Student object based on the values entered
// and store the object in the persons array
        return new Student(name, yr);
    }

    public Lecturer createLecturer() {
// Write the code needed to create a lecturer object.
// It will prompts the user to enter the no. of modules
// and the module code(s) that the lecturer is teaching.
// For example, if the lecturer teaches 3 modules,
// it will prompt the user to enter the module code 3
// times.
// It then creates a Lecturer object and
// stores in the persons array
        String name = JOptionPane.showInputDialog(
                null,
                "Enter Name:",
                "School - Create Lecturer",
                JOptionPane.QUESTION_MESSAGE);

        int numModules = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Enter number of modules",
                "School - Enter modules",
                JOptionPane.QUESTION_MESSAGE));

        String[] modules = new String[numModules];

        for (int i = 1; i <= numModules; i++) {
            String moduleCode = JOptionPane.showInputDialog(
                    null,
                    "Enter module code #" + i,
                    "School - Enter module codes",
                    JOptionPane.QUESTION_MESSAGE);
            modules[i - 1] = moduleCode;
        }

        return new Lecturer(name, modules);
        
        
    }

    public void displayPopulation() {
        // Write the code to display the information about
        // each person in the school.
// It uses the introduce() method in each class
// to achieve this.
        for (int i = 1; i <= persons.length; i++) {
            System.out.println("Person " + i + ":");
            persons[i - 1].introduce();
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        School school = new School();
    }
}
