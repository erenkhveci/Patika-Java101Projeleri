import java.util.Scanner;

public class PalindromicNumbers {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Palindromik olup olmadığını bulmak istediğiniz sayıyı Yazınız :");
        n=sc.nextInt();
        function(n);
    }

    static void  function(int sayi){
        int tempsayi=sayi,tempbasamaksayisi,ilksayi=sayi;
        int basamak,basamaksayisi=1;
       while(!(sayi/10==0)){//BASAMAK SAYISINI BULDUM..
           sayi=sayi/10;
            basamaksayisi++;

       }
        double onluk=1;
        tempbasamaksayisi=basamaksayisi;
       for(int i=1;i<=tempbasamaksayisi;i++) {
            onluk*=10;

        }
         int yenisayi=0;
         for(;basamaksayisi>=1;basamaksayisi--){
           basamak=tempsayi%10;
           tempsayi/=10;
           onluk/=10;
          yenisayi+=(int)(basamak*onluk);
       }

        if(yenisayi==ilksayi){
            System.out.println(yenisayi+" Polindromik Bir Sayidir.");
        }else {
            System.out.println(yenisayi+" Polindromik Bir Sayı Değildir.");
        }
    }
}
