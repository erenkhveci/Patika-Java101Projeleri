import java.util.Scanner;

public class MukkemmelSayi {
    public static void main(String[] args) {
        int number,toplam=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mükkemmel olup olmadığını Sorgulamak istediğiniz sayıyı giriniz : ");
        number = sc.nextInt();
        for(int i =1;i<number;i++){
            if(number%i==0){
                toplam+=i;
            }
        }
        if(toplam==number){
            System.out.println(number+" Sayısı Mükkemmel bir Sayıdır!");
        }else{
            System.out.println(number+" Sayısı Mükkemmel Sayı değildir!");

        }
    }
}
