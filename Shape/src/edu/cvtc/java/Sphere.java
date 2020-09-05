package edu.cvtc.java;

import javax.swing.JOptionPane;

/**
 * @author: rsanford7
 * @Date: 8/30/20
 * @Purpose: Create a Class to take in the parameters for a sphere and then
 * output the surface area and volume.
 */

public class Sphere extends Shape {

  //Create private variables for the Sphere class
  private float radius;
  
  // Constructor
  public Sphere(float radius) {
    super();
    this.radius = radius;
  }

  // Getter and Setter for radius
  public float getRadius() {
    return radius;
  }

  public void setRadius(float radius) {
    // Validate field to make sure it a positive number
    if (radius < 0) {
      throw new IllegalArgumentException("Please enter an number greater than 0.");
    }
    this.radius = radius;
  }
  
  // Methods from the abstract Shape
  @Override
  public float surfaceArea() {
    // Formula for the surface area of a sphere
    return (float) (4 * Math.PI * Math.pow(radius, 2));
  }

  @Override
  public float volume() {
    // Formula for the surface area of a sphere
    return (float) ( (4.0/3.0) * Math.PI * Math.pow(radius, 3));
  }

  @Override
  public void render() {
    // Display the results in a dialog box
    JOptionPane.showMessageDialog(null, "The demensions of a Sphere\nRadius: " + radius +  
        "\nSurface Area: " + surfaceArea() + "\nVolume: " + volume());  
    
  }
  
}
