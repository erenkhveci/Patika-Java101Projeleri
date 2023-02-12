import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dogduguay ;
        int dogdugugun;
        System.out.print("Doğduğunuz ayı giriniz : ");
        dogduguay=sc.nextLine();
        System.out.print("Doğduğunuz günü giriniz : ");
        dogdugugun=sc.nextInt();
        if(dogduguay.equalsIgnoreCase("Ocak")){
            if(dogdugugun<22){
                System.out.println("Oğlak Burcusun");
            }else{
                System.out.println("Kova Burcusun");
            }
        }else if (dogduguay.equalsIgnoreCase("Şubat")) {
            if (dogdugugun < 20) {
                System.out.println("Kova Burcusun");
            } else {
                System.out.println("Balık Burcusun");
            }
        }else if (dogduguay.equalsIgnoreCase("Mart")) {
            if (dogdugugun < 21) {
                System.out.println("Balık Burcusun");
            } else {
                System.out.println("Koç Burcusun");
            }
        }else if (dogduguay.equalsIgnoreCase("Nisan")) {
            if (dogdugugun < 21) {
                System.out.println("Koç Burcusun");
            } else {
                System.out.println("Boğa  Burcusun");
            }
        }else if (dogduguay.equalsIgnoreCase("Mayıs")) {
            if (dogdugugun < 22) {
                System.out.println("Boğa  Burcusun");
            } else {
                System.out.println("İkizler  Burcusun");
            }
        }else if (dogduguay.equalsIgnoreCase("Haziran")) {
            if (dogdugugun < 24) {
                System.out.println("İkizler  Burcusun");
            } else {
                System.out.println("Yengeç Burcusun");
            }
        }else if (dogduguay.equalsIgnoreCase("Temmuz")) {
            if (dogdugugun < 23) {
                System.out.println("Yengeç Burcusun");
            } else {
                System.out.println("Aslan  Burcusun");
            }
        }else if (dogduguay.equalsIgnoreCase("Ağustos")) {
            if (dogdugugun < 23) {
                System.out.println("Aslan Burcusun");
            } else {
                System.out.println("Başak  Burcusun");
            }
        }else if (dogduguay.equalsIgnoreCase("Eylül")) {
            if (dogdugugun < 23) {
                System.out.println("Başak Burcusun");
            } else {
                System.out.println("Terazi  Burcusun");
            }
        }else if (dogduguay.equalsIgnoreCase("Ekim")) {
            if (dogdugugun < 23) {
                System.out.println("Terazi  Burcusun");
            } else {
                System.out.println("Akrep  Burcusun");
            }
        }else if (dogduguay.equalsIgnoreCase("Kasım")) {
            if (dogdugugun < 22) {
                System.out.println("Akrep Burcusun");
            } else {
                System.out.println("Yay Burcusun");
            }
        }else if (dogduguay.equalsIgnoreCase("Aralık")) {
            if (dogdugugun < 22) {
                System.out.println("Yay Burcusun");
            } else {
                System.out.println("Oğlak  Burcusun");
            }
        }else{
            System.out.println("Bir şeyler yanlış gidiyor");
        }



    }
}
