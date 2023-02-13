import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Yıl Giriniz :");
        year=sc.nextInt();
        if(year%100==0){
            if(year%400==0){
                System.out.println(year+" is leap year !");
            }
        }else if(year%4==0){
            System.out.println(year+" is leap year !");
        
        }else {
            System.out.println(year+" is not a leap year");
        }
    }
}
