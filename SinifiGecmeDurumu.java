import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        double avarage;
        int math,turkce,fizik,kimya,music;
        Scanner sc = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz: ");
        math=sc.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce=sc.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik=sc.nextInt();
        System.out.print("Kİmya Notunuzu Giriniz: ");
        kimya=sc.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        music=sc.nextInt();
        avarage=0;

        if((kimya<=100) &&(kimya>=0)){avarage+=kimya;}
        if((math<=100) &&(math>=0)){avarage+=math;}
        if((music<=100) &&(music>=0)){avarage+=music;}
        if((fizik<=100) &&(fizik>=0)){avarage+=fizik;}
        if((turkce<=100) &&(turkce>=0)){avarage+=turkce;}
        avarage/=5;
        if(avarage<=55){
                System.out.println("Sınıftan kaldınız seneye tekrar görüşmek üzere");
                System.out.println("ORtalamanız :"+avarage);
        }else{
                System.out.println("Sınıftan "+avarage+" Ortalamasıyla geçtiniz !");
            }


        }
    }

