import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tantianbao
 */
public class Bread implements Serializable {
    private String name;
    private int amtOfFlour;
    private int numOfLoaves;

    public Bread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmtOfFlour() {
        return amtOfFlour;
    }

    public void setAmtOfFlour(int amtOfFlour) {
        this.amtOfFlour = amtOfFlour;
    }

    public int getNumOfLoaves() {
        return numOfLoaves;
    }

    public void setNumOfLoaves(int i) {
        this.numOfLoaves = i;
    }

}
