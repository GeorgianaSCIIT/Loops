import java.util.Scanner;

public class SwitchTestUdemy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while(number >= 0){
            System.out.println("Insert a number: ");
            if(sc.hasNextInt()){
                number = sc.nextInt();
                switch(number){
                    case 1:
                        System.out.println("Got 1");
                        break;

                    case 66:
                        System.out.println("Got 66");
                        break;

                    default:
                        System.out.println("Got something else");
                    }
                } else{
                sc.nextLine();
            }
        }
    }
}
