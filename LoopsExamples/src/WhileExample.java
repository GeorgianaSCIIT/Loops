import java.util.Scanner;

/**
 * Read numbers from keyboard until their sum is greater than 20
 */

public class WhileExample {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
            System.out.println("Insert numbers: ");
            for (int i =0; i<=20; i++){
                while(sum < 20){
                int a = sc.nextInt();
                sum +=a;
            }
        }
        System.out.println("The sum is: " + sum);
    }

}
