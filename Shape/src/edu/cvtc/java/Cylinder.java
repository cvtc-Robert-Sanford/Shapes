package edu.cvtc.java;

import javax.swing.JOptionPane;

/**
 * @author: rsanford7
 * @Date: 8/30/20
 * @Purpose: Create a Class to take in the parameters for a Cylinder and then
 * output the surface area and volume.
 */

public class Cylinder extends Shape {
  
  //Create private variables for the Cylinder class
  private float radius;
  private float height;
  
  // Constructor
  public Cylinder(float radius, float height) {
    super();
    this.radius = radius;
    this.height = height;
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

  // Getter and Setter for height
  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    // Validate field to make sure it a positive number
    if (height < 0) {
      throw new IllegalArgumentException("Please enter an number greater than 0.");
    }
    this.height = height;
  }

  // Methods from the abstract Shape
  @Override
  public float surfaceArea() {
    // Formula for the surface area of a cylinder
    return (2 * (float) (Math.PI) * radius * height) + ( 2 * (float) (Math.PI) * (radius * radius));   
  }

  @Override
  public float volume() {
    // Formula for the surface area of a cylinder
    return (float) ((Math.PI) * (radius * radius) * height);    
  }

  @Override
  public void render() {
    // Display the results in a dialog box
    JOptionPane.showMessageDialog(null, "The demensions of a Cylinder\nRadius: " + radius + "\nHeight: " + height + 
        "\nSurface Area: " + surfaceArea() + "\nVolume: " + volume()); 
    
  }
  
}
