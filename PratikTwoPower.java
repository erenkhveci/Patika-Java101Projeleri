import java.util.Scanner;

public class PratikTwoPower {
    public static void main(String[] args) {
        int number,i=1,uslusayi=1;
        Scanner sc =new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        number=sc.nextInt();

        while(true){

            for(i=1;i<number;i*=4){

                System.out.println("girilen sayıya kadar olan 4 ün kuvvetleri : "+ i);
            }
            for(i=1;i<number;i*=5){
                System.out.println("girilen sayıya kadar olan 5 ün kuvvetleri : "+ i);
            }
            break;

    }
}
}
