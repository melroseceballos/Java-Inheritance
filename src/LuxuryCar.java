/**
 * A subclass for Car superclass.
 * 
 * @author     Ceballos, Melrose
 * @assignment ICS 111 Assignment 12
 * @date       04/22/2023
 * @bugs       Short description of bugs in the program, if any.
 *
 */
 
 public class LuxuryCar extends Car {
   
    /** Instance variables */
    private int price = 120000;
    
    /** Constructor for Luxury Car */
    public LuxuryCar() {
    
    }
    
    public LuxuryCar(String color, String make, String model, int price){
       super(color, make, model);
       this.price = price;
    }
    /** Accessor methods */
    public int getPrice(){
       return this.price;
    }
    /** toString method */
    public String toString() {
       return "This car's price is " + this.price;
    }
    
    /** Printing LuxuryCar info */
    public void printLuxuryCar(){
       System.out.println("I am now printing info for luxury car");
       System.out.println("The price of this car is " + this.price);
    }
 }