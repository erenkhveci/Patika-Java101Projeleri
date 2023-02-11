import java.util.Scanner;
public class DikUcgendeHipotenus {
    public static void main(String[] args) {
        double a ,b,c,u,alan,cevre;
        Scanner sc = new Scanner(System.in);
        System.out.print("A Kenarını giriniz:");
        a=sc.nextDouble();
        System.out.print("B Kenarını giriniz:");
        b=sc.nextDouble();
        System.out.print("C Kenarını giriniz:");
        c=sc.nextDouble();
        u=(a+b+c)/2;
        cevre = 2*u;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı :"+alan);
        System.out.println("Üçgenin çevresi :"+cevre);
    }
}