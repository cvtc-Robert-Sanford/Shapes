package edu.cvtc.java;

/**
 * @author: rsanford7
 * @Date: 08/30/20
 * @Purpose: Superclass for the Cuboid, Cylinder, and Sphere Classes
 */

public abstract class Shape {
  
  // Create abstract methods for extended classes
  public abstract float surfaceArea(); 
  public abstract float volume();
  public abstract void render();
  
}
