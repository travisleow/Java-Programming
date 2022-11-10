package Practical3;

/**
 *
 * @author travi
 */
public class LecturerQ5 extends Person{
    String[] modules;
    
    public LecturerQ5() {
        modules = null;
    }
    
    public LecturerQ5(String aName, String[] aModules) {
        super(aName);
        modules = aModules;
    }
    
    public String getModule(int index) {
        return modules[index];
    }
    
    public String[] getModules() {
        return modules;
    }
    
    public void introduce() {
        super.introduce();
        System.out.println("I am a lecturer for the following subjects:");
        for (int i = 0; i < modules.length; i++) {
            System.out.println(i+1 + ". " + modules[i]);
        }
    }
}
