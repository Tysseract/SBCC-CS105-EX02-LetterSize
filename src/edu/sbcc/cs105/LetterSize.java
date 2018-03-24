/**
 * CS 105 Theory & Practice I
 * CRN: 62499
 * Assignment: LetterSize
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Mattys C vanZeyl
 */
package edu.sbcc.cs105;

/**
 * This class tests the LetterSize object.
 *
 */
public class LetterSize {

    /**
     * Write source code to calculate the size of an 8.5 x 11 inch letter in millimeters.
     */
    public static String computeLetterSize() {
        // Put your code here.
    	final double MMperIN = 25.4; //conversion value
    	
    	//set values
    	double paperHeightIN = 8.5;
    	double paperLengthIN = 11;
    	
    	//compute values
    	double paperHeightMM = paperHeightIN * MMperIN;
    	double paperLengthMM = paperLengthIN * MMperIN;
    	
    	//convert to strings
    	String paperHeightMMstr = String.format("%.2f",paperHeightMM);
    	String paperLengthMMstr = String.format("%.2f",paperLengthMM);
    	
    	//Concatenate and print
    	String paperSizeMM = (paperHeightMMstr + "x" + paperLengthMMstr);
    	return paperSizeMM;
    			
    			
    }    
    public static void main(String[] args) {
        System.out.println(computeLetterSize());
    }
}