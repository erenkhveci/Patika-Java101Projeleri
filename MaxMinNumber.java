import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi,ek=0,eb=0;
        System.out.print("Kaç sayı gireceksiniz ? :");
        sayi=sc.nextInt();
        for(int i=1;i<=sayi;i++){
            System.out.print("Sayınızı giriniz :");
            int sorgula=sc.nextInt();
         if(i==1){
             ek=sorgula;
             eb=sorgula;
         }
         if(sorgula>eb){
             eb=sorgula;
         }else if(sorgula<ek){
             ek=sorgula;
         }
        }
        System.out.println("En Büyük Sayı :"+eb+"  En Küçük Sayı :"+ek);
    }
}
