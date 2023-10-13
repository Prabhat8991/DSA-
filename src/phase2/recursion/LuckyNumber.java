package phase2.recursion;

public class LuckyNumber {

    public static void main(String[] args) {
        System.out.println(luckyNumber(5));
    }

    public static boolean luckyNumber(int n) {
       return isLuckyNumber(n, 2);
    }

    public static boolean isLuckyNumber(int n, int k) {
        if (n%k == 0) {
            return false;
        }
        if (k > n) {
            return true;
        }
        return isLuckyNumber(n-n/k, k+1);
    }

}
