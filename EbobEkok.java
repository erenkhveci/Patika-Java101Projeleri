import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1,n2,ek,i=1;
        int ebob=1;
        System.out.print("İlk sayıyı giriniz :");
        n1=sc.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        n2=sc.nextInt();
        if(n1<n2){
            ek=n1;
        }else{
            ek=n2;
        }
        while(ek>=1){
           if(n1%ek==0&& n2%ek==0){
                ebob=ek;

           break;
           }
            ek--;
        }
        System.out.println("Ebob :"+ebob);
        while(i<=(n1*n2)){
        if(i%n1==0 && i%n2==0){
            int ekok=i;
            System.out.println("Ekok :"+ekok);
            break;
        }
        i++;
        }
     /*    for(int i=1;i<=ek;i++){
            if(n1%i==0&& n2%i==0){
                ebob+=i+",";
            }

        }*/
        System.out.println("Formülü ile çözümünde Ekok :"+((n1*n2)/ebob));
    }

}
