import java.util.Scanner;

public class WhileTestUdemy {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);

        while(a != 5){
            System.out.println("Insert number 5:");
            if(sc.hasNextInt()){
                a = sc.nextInt();
            }else{
                sc.nextLine();
            }
        }
        System.out.println("Got it!");
    }
}
