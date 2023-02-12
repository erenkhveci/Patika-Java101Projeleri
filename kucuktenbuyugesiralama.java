import java.util.Scanner;
public class kucuktenbuyugesiralama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("1.Sayıyı giriniz :");
        a=sc.nextInt();
        System.out.print("2.Sayıyı giriniz :");
        b=sc.nextInt();
        System.out.print("3.Sayıyı giriniz :");
        c=sc.nextInt();
        if((c<a)&&(c<b)){
            if(a<b){
                System.out.println("Sıralama : c<a<b");
            }else{
                System.out.println("Sıralama : c<b<a");
            }
        }
        else if((b<a)&&(b<c)){
            if(a<c){
                System.out.println("Sıralama : b<a<c");
            }else{
                System.out.println("Sıralama : b<c<a");
            }
        }
        else  if((a<c)&&(a<b)){
            if(c<b){
                System.out.println("Sıralama : a<c<b");
            }else{
                System.out.println("Sıralama : a<b<c");
            }
        }
    }
}
