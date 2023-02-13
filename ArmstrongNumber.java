import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,basNumber=0,tempnumber,basValue,toplam=0;
        System.out.print("Sorgulanacak Sayıyı giriniz : ");
        number=sc.nextInt();
        tempnumber=number;
        tempnumber=number;
        while(tempnumber!=0){
            basValue=tempnumber%10;
            toplam+=basValue;

            tempnumber/=10;
        }
        System.out.println(number+"+Sayısının rakamlarının toplamı :"+toplam);
    }
}


