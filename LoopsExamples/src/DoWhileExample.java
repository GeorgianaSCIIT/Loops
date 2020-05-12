import java.util.Scanner;

/**
 * Read numbers from keyboard until the first even number is typed.
 */

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("Insert a number:");
            number = sc.nextInt();

        }while(number%2 != 0);
        System.out.println("You have entered an even number!!");

    }
}
