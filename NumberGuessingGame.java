import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand=new Random();
        int value=rand.nextInt(100);
        Scanner sc= new Scanner(System.in);

        int right=4;
        int index=0;
        int[] wrong=new int[5];
        while(true){

            if(right==-1){
                System.out.println("Üzgünüm Kaybettin :'()");

                System.out.println("Yanlış girdiğin sayılar :"+Arrays.toString(wrong));

                break;
            }
            System.out.print("Sayı giriniz :");
            int number =sc.nextInt();
            wrong[index]=number;
            index++;
            if(number<0||number>99){
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz ");
                continue;
            }
            if(number==value){
                System.out.println("Kazandın!");
                break;
            }else if(number!=value&&right!=0){

                System.out.println("Yanlış tahmin "+(right)+" Hakkın kaldı!");
                if(number<value){
                    System.out.println("Biraz daha yukarılara çık!");
                }else{
                    System.out.println("Biraz daha aşağılara in!");
                }
            }

        right--;
        }

    }
}
