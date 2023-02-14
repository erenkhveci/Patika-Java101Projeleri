import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        double n;
        double result=0;
        n= sc.nextInt();
        for(double i=1;i<=n;i++){
            result+=(1/i);
        }
        System.out.println("Sonucumuz : "+result);
    }
}
