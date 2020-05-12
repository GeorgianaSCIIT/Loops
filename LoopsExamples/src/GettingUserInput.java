import java.util.InputMismatchException;
import java.util.Scanner;

class ScannerInput {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int sel = 0;
        while (sel != 2) {
            System.out.println("Selelect operation: " +
                    "\n1  Insert personal details:" +
                    "\n2 Exit ");
            sel = sc.nextInt();
            switch (sel) {
                case 1:
                    scanPersonalDetails(sc);
                    break;
                case 2:
                    closeScanner();
                    break;
                default:
                    System.out.println(" Error! Insert 1 or 2");

            }
        }
    }

    private void scanPersonalDetails(Scanner sc) {
        System.out.println("Insert your name: ");
        String name = sc.next();
        System.out.println("Insert your surname:");
        String surname = sc.next();
        System.out.println("Insert your age: ");
        int age = validate(sc);
        System.out.println("Insert your weight:");
        int weight = validate(sc);
        System.out.println("Insert your height:");
        int height = validate(sc);

        System.out.println("Your profile : \n name: " + name + "\n surname: " + surname +
                "\n age: " + age + " years old" + "\n weight: " + weight + " kilograms " + "\n height: "
                + height + " centimers");
        System.out.println();

    }

    private int validate(Scanner sc) {
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

    private void closeScanner() {
        System.out.println("Exiting.....");
        System.exit(1);
    }
}


public class GettingUserInput {
    public static void main(String[] args) {
        ScannerInput input = new ScannerInput();
        input.menu();
    }

}
