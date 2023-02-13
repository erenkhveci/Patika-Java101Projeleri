import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        int n,k,sonuc=1;
        Scanner sc =new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n=sc.nextInt();
        System.out.print("Üst olacak sayı : ");
        k=sc.nextInt();
        for(int i=1;i<=k;i++){
            sonuc*=n;
        }
        System.out.println("Sonucumuz : "+sonuc);
    }
}
