package Arrays;

public class ArrayHarmonicSum{
    static double arrayHarmonicSum(int[] arr){
        double harmonic=1;
        for (int i=0;i<arr.length;i++){
            harmonic +=1/arr[i];
        }
       double harmonicAvarage=arr.length/harmonic;
        return harmonicAvarage;
    }


    public static void main(String[] args) {
        int[] list={1,2,3,4,5,6,7,8,9};
        System.out.println("Arraydeki sayıların harmonik ortalaması :"+(arrayHarmonicSum(list)));
    }

}




