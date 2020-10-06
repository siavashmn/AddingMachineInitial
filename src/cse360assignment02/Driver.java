
package cse360assignment02;

/**
 *
 * Name: Siavash Moeini
 * Student id: 1217773375
 * Class: CSE 360
 * Date: 10/05/2020
 * Purpose: This is the driver for AddingMachine.java to test the methods.
 * 
 */
public class Driver {

    public static void main(String[] args) {
        AddingMachine myCal = new AddingMachine();
        myCal.add(4);
        myCal.add(5);
        myCal.subtract(3);
        System.out.println(myCal.toString());
        System.out.println(myCal.getTotal());
        myCal.clear();
        myCal.add(4);
        myCal.add(5);
        myCal.subtract(2);
        System.out.println(myCal.toString());
        System.out.println(myCal.getTotal());
    }
    
}
