import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName,password;
        int balance=1500;
        int right=0,select=0;
        while(right<3){
            System.out.print("Kullanıcı Adınız : ");
            userName=sc.nextLine();
            System.out.print("Şifreniz : ");
            password=sc.nextLine();
            if(userName.equals("eren")&&password.equals("kahveci")){
                System.out.println("Başarıyla giriş yaptınız .");
                System.out.println("Merhaba KAHVECİ Bank'e Hoşgeldiniz");
                while(select!=4){
                    System.out.println("Yapabileceğiniz işlemler :");
                     System.out.println("1 - Para Yatırma \n"+"2 - Para Çekme \n"+"3 - Bakiye Sorgula \n"+"4 - Çıkış" );
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
                    select=sc.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırılacak para miktarı :");
                            int price=sc.nextInt();
                            balance+=price;
                            System.out.println("Hesabınızdaki para miktarı :"+balance);
                            break;

                        case 2:System.out.print("Çekilecek para miktarı :");
                            int withdraw =sc.nextInt();
                            if(withdraw<balance){
                                balance-=withdraw ;
                                System.out.println("Hesabınızdaki para miktarı :"+balance);
                            }else{
                                System.out.println("O kadar paranız yok ...");
                            }
                            break;
                        case 3:
                            System.out.println("Hesabınızdaki güncel bakiyeniz :"+balance);break;
                        case 4:
                            System.out.println("İyi günler dileriz .");break;
                        default:
                            System.out.println("Yanlış rakam girildi");break;
                    }

                }

                break;
            }else{
                System.out.println(
                        "KULLANICI ADI veya ŞİFRENİZ YANLIŞ YENİDEN DENEYİNİZ"
                );
                System.out.println("Kalan hakkınız :"+(2-right));
                right++;

                if(right==3){
                    System.out.println("Hesabınız geçici süreliğine bloke edilmiştir.");
                }
            }
        }
    }
}
