import java.util.Scanner;

public class CombinationsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,c,totaln=1,totalr=1,totalnr=1;
        System.out.print("Enter n :");
        n=sc.nextInt();
        System.out.print("Enter r :");
        r=sc.nextInt();

        for(int i=1;i<=n;i++){

            totaln *=i;

        }
        System.out.println("Totaln :"+totaln);
        for(int i=1;i<=r;i++){

            totalr *=i;

        }
        System.out.println("Totalr :"+totalr);

        for(int i=1;i<=(n-r);i++){
            totalnr *=i;

        }
        System.out.println("Totanr :"+totalnr);



        c=totaln/(totalr*totalnr);
        System.out.println("C(n,r)'nin kombinasyonu : "+ c +"dir");
    }
}
