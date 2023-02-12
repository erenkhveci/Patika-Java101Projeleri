import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,toplam;
        Scanner sc = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armut=sc.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elma=sc.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domates=sc.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muz=sc.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican=sc.nextDouble();
        toplam =2.14*armut+elma*3.67+domates*1.11+5.00*patlican+0.95*muz;
        System.out.println("Toplam Tutar : "+toplam+" TL");
    }
}
