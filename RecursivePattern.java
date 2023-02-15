import java.util.Scanner;

public class RecursivePattern {
    private static int n,islem=1,tempn=n,sonuc=n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern için test sayınızı giriniz :");
        n=sc.nextInt();
        tempn=n;
        System.out.println("N sayısı :"+n+"tempn :"+tempn+"sonuc :"+sonuc);
        function(n);
    }


        static int function(int n){
             int sonuc=n;
            while(islem==2){
                System.out.print(sonuc+"  ");
                if (sonuc==tempn) {
                    return sonuc;
                }
                return function(n+5);

            }
            while(islem==1){
               if(sonuc>=0) {
                   System.out.print(sonuc+"  ");
                   return function(n - 5);
               }else{
                   System.out.print(sonuc+"  ");
                   islem=2;
                return function(n+5);
               }
           }


        return sonuc;
    }

        }