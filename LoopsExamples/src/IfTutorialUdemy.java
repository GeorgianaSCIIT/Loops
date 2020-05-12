public class IfTutorialUdemy {
    public static void main(String[] args) {
        //boolean cond = 6>1;
        //boolean cond = 8<3;
        //boolean cond = 5!=3;
        boolean cond = 5==3;
        System.out.println(cond);

        int a = 14;
        if(a<10){
            System.out.println("Yes, is true!");
        } else if(a>15){
            System.out.println("No, is false!");
        }else{
            System.out.println("None above!");
        }

        int loop = 0;
        while(true){
            System.out.println("Looping " + loop);
            if(loop == 5){
                break;
            }
            loop++;
            System.out.println("Running");
        }

    }
}
