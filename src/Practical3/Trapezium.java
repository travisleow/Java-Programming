/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3;

/**
 *
 * @author travi
 */
public class Trapezium{
    double base, top, height;

    public Trapezium(double aBase, double aTop, double aHeight) {
        base = aBase;
        top = aTop;
        height = aHeight;
    }

    public double calculateArea() {
        return (base + top) * height / 2;
    }

}
