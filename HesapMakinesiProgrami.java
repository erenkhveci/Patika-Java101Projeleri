import java.util.Scanner;
public class HesapMakinesiProgrami {
    public static void main(String[] args) {
        double n1,n2,result;
        int select;
        Scanner sc = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz :");
        n1=sc.nextInt();
        System.out.print("ikinci sayıyı giriniz :");
        n2=sc.nextInt();
        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme \n");
        System.out.print("Seçiminiz :");
        select=sc.nextInt();
        switch (select){
            case 1 : result=n1+n2;
                System.out.println("sonucunuz .:"+result); break;
            case 2 : result=n1-n2;
                System.out.println("sonucunuz .:"+result);break;
            case 3 : result=n1*n2;
                System.out.println("sonucunuz .:"+result);break;
            case 4 : result=n1/n2;
                System.out.println("sonucunuz .:"+result);break;
            default: System.out.println("Yanlış Seçim Yaptınız");
        }
    }
}
