/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Practical3.Q2;

/**
 *
 * @author travi
 */
public class Sphere {
    double radius;
    
    public Sphere() {
        radius = 0.0;
    }
    
    public Sphere(double aRadius) {
        radius = aRadius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    public double calculateVolume() {
        return 4.0 / 3.0 * (Math.PI * Math.pow(radius, 3));
    }
}
