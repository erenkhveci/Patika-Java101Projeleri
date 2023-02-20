import java.util.Scanner;

public class PalindromicString {
    static boolean isPalindromic(String str){
        int i=0;
        int j =str.length()-1;
        while (i!=str.length()){

            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
                return true;
         }else{
                return false;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.print("String'inizi giriniz ");
        str=sc.nextLine();
        int i =str.length()-1;
        String nstr="";
        while(i>=0){

            nstr+=str.charAt(i);
            i--;
        }
        if(nstr.equals(str)){
            System.out.println("Polindromik String girdiniz");
        }else{
            System.out.println("Polindromik bir String değil");
        }


    }
}
