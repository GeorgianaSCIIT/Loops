import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchStatementUdemy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
        String text = " ";

//        while(text != "stop"){
//            System.out.println("Please enter a command: ");
//            text = sc.nextLine();
//            switch(text){
//                case "start":
//                    System.out.println("Machine started");
//                    break;
//                case "stop":
//                    System.out.println("Machine stopped");
//                    System.exit(1);
//                    break;
//                default:
//                    System.out.println("Command not recognized")
//            }
//        }
        String operation = " ";
        while(operation != "exit"){
            try{
                System.out.println("Insert first number:");
                int a = Integer.parseInt(sc.next());
                System.out.println("Insert second number:");
                int b = Integer.parseInt(sc.next());
                System.out.println("Insert operation:");
                operation = sc.next();
                switch(operation){
                    case "+":
                        System.out.println("a + b: " + (a+b));
                        break;
                    case "-":
                        System.out.println("a - b: " + (a-b));
                        break;
                    case "*":
                        System.out.println("a * b: " + (a*b));
                        break;
                    case "/":
                        System.out.println("a / b: " + (a/b));
                        break;
                    case "exit":
                        System.out.println("Exiting....");
                        System.exit(1);
                    default:
                        System.out.println("Wrong operation");
                }

            }catch(InputMismatchException | NumberFormatException ex){
                System.out.println("Error! Not a number!");
            }

        }



    }
}
