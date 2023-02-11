import java.util.Scanner;
public class KDV_Tutari_Hesaplayan_Program {
    public static void main(String[] args) {
        kdvHesapla();
    }
    public static void kdvHesapla(){
        Scanner sc = new Scanner(System.in);
        System.out.print("KDV si hesaplanacak miktarı giriniz :");
        double hesaplanacakSayi=sc.nextDouble();
        double kdvTutari=hesaplanacakSayi*0.18;
        double kdvliSayi=hesaplanacakSayi+kdvTutari;
        System.out.println("KDV'li sayi :"+kdvliSayi + "   KDV Tutarı :"+kdvTutari+"   KDV'siz tutar :"+hesaplanacakSayi);
    }
}