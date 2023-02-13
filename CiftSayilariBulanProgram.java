import java.util.Scanner;

public class CiftSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,toplam=0 ;
        double avarage;
        System.out.print("N'i giriniz : ");
        n=sc.nextInt();
        i=0;
        System.out.print("Girdiğiniz sayı içerisinden 3 ve 4 e bölünebilen sayılar :  ");
        while(i<n){
        if(i%3==0||i%4==0){
            System.out.print(i+",");
         toplam +=i;
        }
        i++;
    }
        avarage=toplam/n;
        System.out.println("");
        System.out.println("Girdiğiniz sayı içerisinden 3 ve 4 e bölünebilenlerin ortalaması "+avarage);

    }
}
