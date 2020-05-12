public class WhileLoopUdemy {
    public static void main(String[] args) {
        int value = 0;
        while(value<=10){
            System.out.println(value);
            value = value + 1;
        }
        System.out.println();

        int count = 2;
        while(count < 6){
            System.out.println(count);
            count++;
        }
        System.out.println();

        int x = 5;
        while(x < 10){
            System.out.println(x);
            x = x + 2;
        }
        System.out.println();

        int a = 2;
        int b = 15;
        while(a < b){
            System.out.println("a is: " +a + " and b is: " +b);
            a = a + 5;
            b = b + 1;
        }
    }
}
