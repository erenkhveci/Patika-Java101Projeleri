import java.util.Scanner;

public class PratikTwoPower {
    public static void main(String[] args) {
        int number,i=1,uslusayi=1;
        Scanner sc =new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        number=sc.nextInt();

        while(true){

            for(i=1;uslusayi<number;i*=4){
                uslusayi=i*4;
                System.out.println("girilen sayıya kadar olan 4 ün kuvvetleri : "+ uslusayi);
            }
            break;

    }
}
}
