package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOfCloseNumbers {

    public static void finder(int[] list,int value){
        int ek=list[0],eb=list[0];
        Arrays.sort(list);
        for (int i:list){
            if(i<value){
                ek=i;
            }
        }

            for(int i:list){
                if(value<i){
                    eb=i;
                    break;
                }


        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :"+ek+"\n"+"Girilen sayıdan büyük en yakın sayı :"+eb );
    }

    public static void main(String[] args) {
        int[] list ={15,12,788,1,-1,-778,2,0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Girilen Sayı :");
        int value=sc.nextInt();
        finder(list,value) ;
    }
}
