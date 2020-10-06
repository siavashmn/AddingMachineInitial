
package cse360assignment02;
/**
 *
 * Name: Siavash Moeini
 * Student id: 1217773375
 * Class: CSE 360
 * Date: 10/05/2020
 * Purpose: This program is designed for the students to get familiar with github repository.
 * github Link: https://github.com/siavashmn/AddingMachineInitial.git
 */
import java.util.*;
public class AddingMachine {
    private int total;
    private String memory;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    memory = "0";
  }
  
  //this returns the current total
  public int getTotal () {
    return total; 
  }
  
  //This method adds the given value to the total
  public void add (int value) {
      total = total + value;
      memory += " + " + value;
  }
  //This method subtracts the given value from total
  public void subtract (int value) {
      total = total - value;
      memory += " - " + value;
  }
  //This is the toStirng method to show all the operations
  public String toString () {
    return memory;
  }
  //This method clears the memory
  public void clear() {
      total = 0;
      memory = "0";
      
  }
    
}
