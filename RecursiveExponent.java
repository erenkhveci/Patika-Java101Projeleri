import java.util.Scanner;

public class RecursiveExponent {

 
        public static int us(int taban,int us){
            if(us<1){
                return 1;
            }else{
            return taban*us(taban,us-1);
        }
        }
        public static void main (String [] args) {

            Scanner sc= new Scanner(System.in);
            System.out.print("Taban değeri giriniz  :");
            int  base=sc.nextInt();
            System.out.print("üs değeri giriniz :");
            int exponent=sc.nextInt();
            System.out.println(us(base,exponent));
        }

        }
