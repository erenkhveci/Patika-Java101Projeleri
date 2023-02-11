import java.util.Scanner;
public class VucutKitleİndeksiHesaplama {
    public static void main(String[] args) {
        double vki,kilo,boy;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy=sc.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo=sc.nextDouble();
        vki=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+vki);
    }

}
