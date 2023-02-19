package Arrays;

import java.util.Arrays;

public class ArrayTranpose {
    static void printArray(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] list={{2,3,4},{5,6,4}};
        int[][] newList=new int[3][2];
        int k=0;
        int[]tempList=new int[6];
        for(int i =0;i<list.length;i++){
            for(int j =0;j<list[i].length;j++){

                if(k<6){
                tempList[k]=list[i][j];
                k++;
            }
            }
        }
        k=0;
        for(int i =0;i<newList.length;i++){
            for(int j =0;j<newList[i].length;j++){
                if(k<6){
                newList[i][j]=tempList[k];
                k++;
                }
            }
        }

        System.out.println("Matris :");
        printArray(newList);
        System.out.println("Transpoze :");
        printArray(list);
    }


}
