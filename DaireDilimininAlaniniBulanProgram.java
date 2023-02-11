import java.util.Scanner;
public class DaireDilimininAlaniniBulanProgram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz :");
        double r,x,dairedilimialani,pi=3.14;
        r=sc.nextDouble();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz  :");
        x=sc.nextDouble();
        dairedilimialani=(pi*r*r*x)/360;
        System.out.println("Daire diliminin alanı: "+dairedilimialani);
    }
}
