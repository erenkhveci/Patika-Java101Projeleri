import java.util.Scanner;
public class BasicUserLogin {
    public static void main(String[] args) {
        String userName,password,sifirlama,newUserName,newPassword;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz :");
        userName= sc.nextLine();
        System.out.print("Kullanıcı şifrenizi giriniz :");
        password= sc.nextLine();
        if(userName.equals("patika")&& password.equals("java123")){
            System.out.println("Giriş Yaptınız.");
        }else{
            System.out.println("Bilgillerinizi yanlış girdiniz!");
            System.out.print("Şifrenizi Sıfırlamak İster Misiniz? (E veya H)");
            sifirlama=sc.nextLine();
            if(sifirlama.equalsIgnoreCase("E")){
                System.out.print("Yeni Şifrenizi Giriniz :");
                newPassword=sc.nextLine();
                if(!(newPassword.equals("java123"))){
                    password=newPassword;
                    System.out.println("Yeni Şifreniz Oluşturuldu");
                }else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                }
            }else if(sifirlama.equalsIgnoreCase("H")){
                System.out.println("Have a Nice Day(Bon Jovi)");
            }else{
                System.out.println("E veya H şeklinde giriniz");
            }
        }
    }
}
