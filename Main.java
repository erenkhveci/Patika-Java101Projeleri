import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mat notunuzu giriniz:");
        int matNot=sc.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        int kimyaNot=sc.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        int turkceNot=sc.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        int tarihNot=sc.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        int muzikNot=sc.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        int fizikNot=sc.nextInt();
        int toplam=(fizikNot+tarihNot+matNot+muzikNot+turkceNot+kimyaNot);
        double ortalama=toplam/6;
        System.out.println("Not Ortalamanız :"+ortalama);
        System.out.println( (ortalama > 60) ? "Geçtiniz" : "Kaldınız daha çok çalışın");


    }
}