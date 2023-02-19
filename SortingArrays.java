package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin Boyutu :");
        int length=sc.nextInt();
        int[] list= new int[length];
        System.out.println("Dizinin elemanlarını giriniz :");
        for(int i=0;i<length;i++){
            System.out.print((i+1)+".nci elemanı :");
            list[i]=sc.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralama :"+Arrays.toString(list));
    }
}
