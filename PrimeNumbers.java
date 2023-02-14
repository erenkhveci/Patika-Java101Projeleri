public class PrimeNumbers {
    public static void main(String[] args) {
        int start = 1;
        int end =100;
        System.out.println("Bu Sayılar : " + start + " ve " + end +"Arasındaki asallar :");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
