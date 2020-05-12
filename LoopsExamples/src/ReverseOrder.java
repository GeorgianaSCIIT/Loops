import java.util.Scanner;

/**
 * Read 2 keys from the keyboard and print them in the reverse order
 */
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("Insert first number: ");
        a = sc.nextInt();
        System.out.println("Insert second number: ");
        b = sc.nextInt();
        System.out.println("The numbers are: " + b + " and " + a);

    }
}
