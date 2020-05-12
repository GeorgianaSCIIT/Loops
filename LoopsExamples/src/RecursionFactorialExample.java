import java.util.Scanner;
/**
 * Calculate and print n!. Read n from keyboard
 * // E.g. 4! = 4*3*2*1 (factorial 4)
 */

public class RecursionFactorialExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Factorial de 1 este: " + calculateFactorial(1));
        System.out.println("Factorial de 2 este: " + calculateFactorial(2));
        System.out.println("Factorial de 3 este: " + calculateFactorial(3));
        System.out.println("Factorial de 4 este: " + calculateFactorial(4));
        System.out.println("Factorial de 5 este: " + calculateFactorial(5));
        System.out.println("Factorial de 6 este: " + calculateFactorial(6));

        int n = 1;
        do {
            System.out.println("Insert a number: ");
            n = sc.nextInt();
            System.out.println("Factorial is " + factorial(n));
            System.out.println();
        }while(n>=1);

    }

    public static int factorial(int n){
        int fact = 1;
        for(int i=2; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    private static int calculateFactorial(int value){
        if(value == 1){
            return 1;
        }
        return calculateFactorial(value -1) * value;
    }
}

