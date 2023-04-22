/**
* A superclass that contains 3 characteristics
* 
* @author     Ceballos, Melrose
* @assignment ICS 111 Assignment 12
* @date       04/22/2023
* @bugs       Short description of bugs in the program, if any.
*
**/



public class Car {

    /** Instance Variables */
   private String color = "gray";
   private String make = "Nissan";
   private String model = "Leaf";

/*** Constructors here */
   public Car() {
   }

   public Car (String color, String make, String model) {
      this.color = color;
      this.make = make;
      this.model = model;
   }

/** Accessor method */
   public String getColor()   {
      return this.color;
   }
   public String getMake() {
      return this.make;
   }
   public String getModel() {
      return this.model;
   }

/** Mutator Method */
   public void setColor(String newColor) {
      this.color = newColor;
   }
   public void setMake(String newMake) {
      this.make = newMake;
   }
   public void setModel(String newModel) {
      this.model = newModel;
   }

/*** toString Method */
   public String toString() {
      return "The color of this car is" + this.color + "and the make is" + this.make + "and the model is " + this.model;
   }
}
