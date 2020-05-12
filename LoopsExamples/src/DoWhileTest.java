import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        do{
            System.out.println("Insert a number: ");
            if(sc.hasNextInt()){
                value = sc.nextInt();
            }else{
                sc.nextLine();
            }

        }while(value <= 10);
        System.out.println("Integer greater than 10 detected!");
    }
}
