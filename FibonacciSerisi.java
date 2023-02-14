import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.print("kaç elemanlı bir seri istiyorsunuz ? :");
        int eleman,n0=0,n1=1,n2 = 0;
        eleman=sc.nextInt();
        String fibonacci=" ";
        for(int k =1;k<=eleman;k++){
            n2=n0+n1;
            n0=n1;
            n1=n2;
            fibonacci+=n2+" ";
        }

        System.out.println(fibonacci);
    }
}
