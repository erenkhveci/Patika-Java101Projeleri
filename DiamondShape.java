import java.util.Scanner;

public class DiamondShape {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for(int i = 0; i<= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=(2*i+1);k++){
            System.out.print("*");
        }

        System.out.println(" ");
    }
        for(int i = 0; i<= n; i++) {
            int tempnum=n-i;
            for (int j = 0; j <tempnum-(tempnum- i); j++) {
                System.out.print(" ");
            }

            for(int k=0;k<=(2*tempnum+1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
