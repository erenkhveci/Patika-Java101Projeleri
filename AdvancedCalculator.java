import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select ;
        String menu=
                "1- Toplama İşlemi \n"+
                "2- Çıkarma İşlemi \n"+
                "3- Çarpma İşlemi \n"+
                "4- Bölme İşlemi \n"+
                "5- Üslü Sayı Hesaplama\n"+
                "6- Faktoriyel Hesaplama\n"+
                "7- Mod Alma \n"+
                "8- Dikdörtgen Alan ve Çevre Hesabı \n"+
                "0- Çıkış Yap \n";
        System.out.println(menu);
        System.out.print("Hangi İşlemi Yapmak İstersiniz ?");
        select=sc.nextInt();

        switch (select){
            case 1:plus ();break;
            case 2:minus();break;
            case 3:times();break;
            case 4:devided();break;
            case 5:power();break;
            case 6:factorial();break;
            case 7:mode();break;
            case 8:areaPerimeter();break;
            case 0:
                System.out.println("Görüşürüz :)");break;
        }

    }

    private static void areaPerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Uzun kenar :");
        int longSide=sc.nextInt();
        System.out.print("Kısa kenar :");
        int shortSide=sc.nextInt();
        int alan=shortSide*longSide;
        int cevre=(shortSide+longSide)*2;
        System.out.println("Dikdörtgenin Çevresi "+cevre+" Alanı :"+alan);
    }

    private static void mode() {
    Scanner sc = new Scanner(System.in);
        System.out.print("Modu alınacak sayı :");
        int result;
        int mod=sc.nextInt();
        System.out.print("Hangi sayıya göre modu alınacak ? :");
        int mod2=sc.nextInt();
        result=mod%mod2;
        System.out.println("Sonuç :"+result);
    }


    static void plus (){
        System.out.print("Toplamak istediğiniz Sayı miktarı :");
        Scanner sc = new Scanner(System.in);
        int tekrar =sc.nextInt();
        int toplam=0;
        for (int i =1;i<=tekrar;i++){
            System.out.print(i+".Sayıyı Giriniz :");
            int sayi=sc.nextInt();
            toplam+=sayi;

        }
        System.out.println("Sayıların Toplamı : "+toplam);
    }
    static void minus(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }
    static void times(){
        Scanner sc = new Scanner(System.in);
      int number,result=1,i=1;
      while(true){
          System.out.print(i+". sayi :");
          number=sc.nextInt();
            if(number ==1 ){
                break;
            }
            if(number==0){
                result=0;
                break;
            }
            result*=number;

      }
       }
        static void devided(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç adet Sayı Gireceksiniz ?");
        int counter =sc.nextInt();
        double number,result=0;
        for(int i =1;i<=counter;i++){
            System.out.print(i+". sayıyı giriniz : ");
            number =sc.nextDouble();
            if(i!=0&&number==0){
                System.out.println("Böleni 0 giremezsiniz ");
                continue;
            }
            if(i==1){
                result=number;
                continue;
            }
            result/=number;
        }
            System.out.println("Sonuç : " + result);

    }

    static void power(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değerini giriniz :");
        int base=sc.nextInt();
        System.out.print("Üs değerini giriniz :");
        int exponent=sc.nextInt();
        int result=1;
        for(int i =1;i<=exponent;i++){
            result*=base;
        }

        System.out.println("Sonuç : " + result);
    }
    private static void factorial() {
        System.out.print("Hangi sayının faktoriyelini alıyoruz ? :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result=1;
        for(int i =1;i<=n;i++){
            result*=i;
        }
        System.out.println("Sonuc :"+result);
    }
}
/* for (int i = 1; i <= counter; i++) {
         System.out.print(i + ". sayı :");
         number = scan.nextInt();
         if (i == 1) {
         result += number;
         continue;
         }
         result -= number;
         }

         System.out.println("Sonuç : " + result);
         }*/
