import java.util.Scanner;
public class PlaneTicketPrice {
    public static void main(String[] args) {
        int km,age,type;
        double indirimsiz, indirimli=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz :");
        km=sc.nextInt();
        if(km<=0){
            System.out.println("Km'yi yanlış girdiniz !");
           System.exit(0);
        }
        System.out.print("Yaşınızı giriniz : ");
        age=sc.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        type=sc.nextInt();
        indirimsiz =0.10*km;

        if(age<12){
            indirimli = indirimsiz-(indirimsiz * 0.5);
        }else if(age>=12 && age<=24){
            indirimli = indirimsiz-(indirimsiz * 0.1);
        }else if (age>65){
            indirimli = indirimsiz-(indirimsiz * 0.3);
        }else if (age>24&& age<=65){
            indirimli = indirimsiz;
        }
        switch(type){
            case 1 :
                System.out.println("Toplam Tutar ="+indirimli); break ;

            case 2 :  indirimli=2*indirimli*0.8;
                System.out.println("Toplam Tutar ="+indirimli);break;
            default:
                System.out.println("Hatalı Veri Girdiniz !");break;

        }


    }
}
