import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gidilecek KM sayısını giriniz:");
        double taksimetre,km;
        km=sc.nextDouble();
        taksimetre=10+km*2.20;
        taksimetre=(taksimetre < 20) ? 20 :  10 + (km * 2.20);
        System.out.println("taksimetre ücreti :"+taksimetre);
    }
}