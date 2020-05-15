import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase where operations are made
 */
class OperationsCalculator {

    //Calculate Sum
    protected int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    //Calculate Difference
    protected int calculateDifference(int a, int b){
        int dif = a - b;
        return dif;
    }

    //Calculate Product
    protected int calculateProduct(int a, int b){
        int prod = a * b;
        return prod;
    }

    //Calculate Division
    protected int calculateDivision(int a, int b){
        int div =  a/b;
        return div;
    }

    //Calculate sin(value)
    protected double calculateSin(int value){
        double sin = Math.sin(value);
        return sin;
    }

    //Calculate cos(value)
    protected double calculateCos(int value){
        double cos = Math.cos(value);
        return cos;
    }

    //Calculate sin2(value) + cos2(value)
    protected double calculateSinPlusCos(int value){
        double sin = calculateSin(value);
        double cos = calculateCos(value);
        double result = Math.pow(sin,2) + Math.pow(cos,2);
        return result;
    }

    //Calculate sqrt(value)
    protected double calculateSqrt(int value){
        double sqrt = Math.sqrt(value);
        return sqrt;
    }

}

/**
 * Scanner class
 * All scanner methods are here
 */

class ScannerCalculator{
    OperationsCalculator operations = new OperationsCalculator();

    /**
     * Menu method
     */
    public void menu(){
        Scanner sc = new Scanner(System.in);
        int sel = 0;
        while(sel != 2) {
            System.out.println("Selelect operation: " +
                    "\n1  Calculator:" +
                    "\n2 Exit ");
            sel = validateNumber(sc);
            switch (sel) {
                case 1:
                    scanOperation(sc);
                    break;
                case 2:
                    System.out.println("Existing...");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Error! Insert 1 or 2");

            }
        }

    }

    /**
     * This method help us to choose the operation
     * @param sc - Scanner
     */

    private void scanOperation(Scanner sc){
        int a = 0;
        int b = 0;
        int c = 0;
        int operation = 0;
        do {
            System.out.println("Selelect operation: " +
                    "\n1 + " +
                    "\n2 - " +
                    "\n3 * " +
                    "\n4 / " +
                    "\n5 sin(x) " +
                    "\n6 cos(x) " +
                    "\n7 sin2(x) + cos2(x) "+
                    "\n8 sqrt(x) ");
            operation = validateNumber(sc);
            if (operation < 5) {
                System.out.println("Insert first number");
                a = validateNumber(sc);
                System.out.println("Insert first number");
                b = validateNumber(sc);
            } else if (operation >= 5 && operation <= 8) {
                System.out.println("Insert a number:");
                c = validateNumber(sc);
            } else {
                sc.nextLine();
            }
            switchOperation(operation, a, b, c);
            System.out.println();
        }while(operation > 8);
    }

    /**
     * Method where calculations are made
     * @param operation
     * @param a
     * @param b
     * @param c
     */

    private void switchOperation(int operation, int a, int b, int c){
        switch (operation) {
            case 1:
                System.out.println("Sum of " + a + " and " + b + " is: " + operations.calculateSum(a, b));
                break;
            case 2:
                System.out.println("Difference of " + a + " and " + b + " is: " + operations.calculateDifference(a, b));
                break;
            case 3:
                System.out.println("Product of " + a + " and " + b + " is: " + operations.calculateProduct(a, b));
                break;
            case 4:
                System.out.println("Division of " + a + " and " + b + " is: " + operations.calculateDivision(a, b));
                break;
            case 5:
                System.out.println(" Sin of " + c + " is: " + operations.calculateSin(c));
                break;
            case 6:
                System.out.println(" Cos of " + c + " is: " + operations.calculateCos(c));
                break;
            case 7:
                System.out.println("sin2(x) + cos2(x) of " + c + " is:  " + operations.calculateSinPlusCos(c));
                break;
            case 8:
                System.out.println(" Sqrt of " + c + " is: " + operations.calculateSqrt(c));
                break;
            default:
                System.out.println("Insert a number beetwen 1 and 8!!!!");
        }

    }

    /**
     * Method to validate the numbers we are entering in the system
     * @param sc
     * @return
     */

    private int validateNumber(Scanner sc){
        int value = 0;
        boolean aError = true;
        do {
            try {
                value = Integer.parseInt(sc.next());
                if (value < 0) {
                    System.out.println("Insert a positive value!");
                } else {
                    aError = false;
                }

            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("Error! Insert a number!");
            }

        } while (aError);

        return value;
    }


}

/**
 * Main Class
 * The program starts here
 */

public class AritmethicCalculator {
    public static void main(String[] args) {
        ScannerCalculator calculator = new ScannerCalculator();
        calculator.menu();

    }
}
