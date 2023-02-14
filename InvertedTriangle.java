import java.io.*;
import java.util.Scanner;


class InvertedTriangle {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number ;
        System.out.print("Kaç Satır istersiniz ? :");
        number=sc.nextInt();
        int i = number, j;

        while (i > 0) {
            j = 0;

            while (j++ < number - i) {
                System.out.print(" ");
            }
            j = 0;
       while (j++ < (i * 2) - 1) {
                System.out.print("*");
            }

       System.out.println();

            i--;
        }
    }
}