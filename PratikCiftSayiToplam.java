import java.util.Scanner;
public class PratikCiftSayiToplam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,toplam=0;
        System.out.print("Sayı giriniz : ");
        n=sc.nextInt();
        while((n%2==0)){

            toplam+=n;
            if(n%4==0){
                toplam+=n;
            }
            System.out.print("Sayı giriniz : ");
            n=sc.nextInt();
        }
        System.out.println("Toplam : "+toplam);
    }
}
