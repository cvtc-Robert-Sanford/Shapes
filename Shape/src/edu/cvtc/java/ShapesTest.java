package edu.cvtc.java;

/**
 * @author: rsanford7
 * @Date: 8/30/20
 * @Purpose: Create a Class to find the surface area and volume of shapes.
 */

public class ShapesTest {
  
  public static void main(String[] args) {
    
    // Declare Variables
    float width = 1;
    float height = 2;
    float depth = 3;
    float radius = 5;
    
    // Create cuboid object
    Cuboid cuboid = new Cuboid(width, height, depth);
    
    // Create Cylinder object
    Cylinder cylinder = new Cylinder(radius, height);
    
    // Create a Sphere object
    Sphere sphere = new Sphere(radius);
    
    // Call render methods to display results
    cuboid.render();
    cylinder.render();
    sphere.render();
    
  }
  
}
