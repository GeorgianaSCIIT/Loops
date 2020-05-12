import java.util.InputMismatchException;
import java.util.Scanner;

public class GettingUserInputUdemyUglyVersion {
    public static void main(String[] args) {

        //Create scanner object
        Scanner sc = new Scanner(System.in);

        //Output the prompt
        System.out.println("What is your name? ");

        //wait for the use to enter a line of text
        String name = sc.nextLine();

        System.out.println("What is your surname?");
        String surname = sc.nextLine();

        boolean aError = true;
        boolean wError = true;
        boolean hError = true;

        int age = 0;
        int weight = 0;
        int height = 0;

        do {
            try {
                System.out.println("Insert your age: ");
                age = Integer.parseInt(sc.next());
                if (age < 0) {
                    System.out.println("Age must be positive");
                }else {
                    aError = false;
                }

            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("Insert a number!");
            }

        } while (aError);

        do{
            try{
                System.out.println("Insert your weight:");
                weight = Integer.parseInt(sc.next());
                if(weight < 0){
                    System.out.println("Weight must be positive");
                }else {
                    wError = false;
                }

            }catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("Insert a number!");
            }

        }while(wError);

        do{
            try{
                System.out.println("Insert your height:");
                height = Integer.parseInt(sc.next());
                if(height < 0){
                    System.out.println("Height must be positive");
                }else {
                    hError = false;
                }

            }catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("Insert a number!");
            }

        }while(hError);
        System.out.println("Your personal profile: \n Your name is: " + name + "\n Your surname is: " + surname
                + "\n Your age is: " + age + "\n Your weight: " + weight + " kilograms \n Your height is: " + height + " centimeters");

    }
}
