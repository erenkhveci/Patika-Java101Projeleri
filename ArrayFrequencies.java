package Arrays;

import com.sun.jdi.Value;

import java.util.Arrays;

public class ArrayFrequencies {
    static boolean isFind(int[]arr,int value){
        for(int i:arr){
            if(i== value){
                return true;
            }
        }
    return false;
    }
    public static void main(String[] args) {
        int[] list ={10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicated=new int[2];
        int startIndex=0;
        System.out.println("Dizi : "+Arrays.toString(list));
        System.out.println("Tekrar sayıları");
        int tencount=1;
        int twentycount=1;

        for(int i =0;i<list.length;i++){

            for(int j =0;j<list.length;j++){
                if(list[i]==list[j]&&i!=j){
                    if(list[i]==10){
                        tencount++;
                    }

                }
            }

            for(int k=0;k<list.length;k++){
                if(list[i]==list[k]&& i!=k){
                    if(!isFind(duplicated,list[i])){
                        duplicated[startIndex++]=list[i];
                    }
                    break;
                }
            }


        }

        System.out.println("10 Sayısı "+tencount+" kere tekrar edildi.");
        System.out.println("20 Sayısı "+twentycount+" kere tekrar edildi.");

    }
}
