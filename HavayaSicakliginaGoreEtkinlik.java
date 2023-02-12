import java.util.Scanner;
public class HavayaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heat;
        System.out.print("Sıcaklığı giriniz :");
        heat=sc.nextInt();
        if(heat<5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }else if(heat<=25 ){
            if(heat<=15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if(heat >=10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsin.");
        /*
            AÇIK KOD AŞAĞIDA YAZILANA GÖRE DAHA MANTIKLI VE GÜZEL BİR KOD .

        Scanner sc = new Scanner(System.in);
        int heat;
        System.out.print("Sıcaklığı giriniz :");
        heat=sc.nextInt();
        if(heat<5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }else if(heat<10 ){
                System.out.println("Sinemaya gidebilirsiniz.");
        }else if(heat>15){    System.out.println("Pikniğe gidebilirsiniz");}

        }else if(heat<=15 && heat >=10){
            System.out.println("Hem sinemaya Hem pikniğe gidebilirsin.");
        }else{
        System.out.println("Yüzmeye gidebilirsin.");
        }

         */

        }
    }
}