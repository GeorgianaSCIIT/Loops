import java.util.Scanner;

public class DoWhileUdemy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        do{
            System.out.println("Insert a number: ");
            number = sc.nextInt();

        }while(number != 5);
        System.out.println("Got it five!!!!!");


    }
}
