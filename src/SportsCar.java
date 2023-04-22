/**
 * A subclass to superclass Car.
 * 
 * @author     Ceballos, Melrose
 * @assignment ICS 111 Assignment 12
 * @date       04/22/2023
 * @bugs       Short description of bugs in the program, if any.
 *
 */
 
public class SportsCar extends Car {
   
   /** Instance variables */
   private double maximumSpeed = 200.8;
   private double horsepower = 3000.0;
   private int numberOfSeats = 2;
   
   
  /** Constructors for SportsCar Object */
   public SportsCar() {
   
   }
   public SportsCar(String color, String make, String model, double maximumSpeed, double horsepower, int numberofSeats) {
      super(color, make, model);
      this.maximumSpeed = maximumSpeed;
      this.horsepower = horsepower;
      this.numberOfSeats = numberOfSeats;
      
   }
 /** Accessor Method **/
   public double getMaximumSpeed() {
      return this.maximumSpeed;
   }
   public double horsepower() {
      return this.horsepower;
   }
   public int numberOfSeats() {
      return this.numberOfSeats;
   }
 
 /** Printing SportsCar info */
 public void printSportsCar() {
 System.out.println("\n Printing Sports Car info");
 System.out.println("This car tops at" + this.maximumSpeed);
 System.out.println("This car has " + this.horsepower + "horsepower");
 System.out.println("This car has this many number of seats" + this.numberOfSeats);
 
 }
}
