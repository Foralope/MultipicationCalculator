/*
 * A multiplication calculator
 * 1/10/18
 */

package inputforcalc2;
import java.util.Scanner;
/**
 * @author wizwa9381
 */
public class InputForCalc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        //Variables
        double firstNumber,secondNumber,answer;
        //Input numbers
        System.out.println("Finding the product. ");
        System.out.print("Enter the first number: ");
        firstNumber = keyedInput.nextDouble();
        System.out.print("Enter the second number: ");
        secondNumber = keyedInput.nextDouble();
        //Calculation
        answer = firstNumber * secondNumber;
        //Show
        System.out.println("The product of the 2 numbers is " + answer);
        //Finish
        keyedInput.close();
    }
    
}
