package edu.cvtc.java;

import javax.swing.JOptionPane;

/**
 * @author: rsanford7
 * @Date: 8/30/20
 * @Purpose: Create a Class to take in the parameters for a cuboid and then
 * output the surface area and volume.
 */

public class Cuboid extends Shape {
  
  // Create private variables for the Cuboid class
  private float width;
  private float height;
  private float depth;

  // Constructor
  public Cuboid(float width, float height, float depth) {
    super();
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  // Getter and Setters for width
  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    // Validate field to make sure it a positive number
    if (width < 0) {
      throw new IllegalArgumentException("Please enter an number greater than 0.");
    }
    this.width = width;
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

  // Getter and Setter for Depth
  public float getDepth() {
    return depth;
  }

  public void setDepth(float depth) {
    // Validate field to make sure it a positive number
    if (depth < 0) {
      throw new IllegalArgumentException("Please enter an number greater than 0.");
    }
    this.depth = depth;
  }
  
  // Methods from the abstract Shape
  
  @Override
  public float surfaceArea() {   
    // Formula for the surface area of a cuboid
    return ((depth * width) + (depth * height) + (width * height))*2;   
  }

  @Override
  public float volume() {
    // Formula for the volume of a cuboid
    return width * height * depth;
  }

  @Override
  public void render() {
    // Display the results in a dialog box
    JOptionPane.showMessageDialog(null, "The demensions of a Cuboid\nWidth: " + width + "\nHeight: " + height + "\nDepth: " + depth +
        "\nSurface Area: " + surfaceArea() + "\nVolume: " + volume()); 
    
  }
  
}
