
public class ForLoopUdemy {
    public static void main(String[] args) {
        for(int i = 0; i<=5; i++){
            System.out.println("The value of i is: " + i);
        }

        for(int j = 0; j<6; j++){
            //%d replace the j value
            System.out.printf("The value of j is:%d\n", j);
        }

        for(int c =1; c<5; c++){
            for(int d=15; d>10; d--){
                System.out.println("c is: " + c);
                System.out.println("d is: " + d);
                System.out.println("The value of c + d is: " + (c+d));
            }
        }

        for(int a = 1; a<3; a++){
            System.out.println("a is: " + a);
            for(int b = 7; b>5; b--){
                System.out.println("b is: " + b);
                System.out.println("The value of a + b is: " + (a+b));
            }
        }

    }
}
