package phase2.recursion;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int n = 999;
        int number = n;
       do {
           number = sum(number);
       } while (number/10 > 0);
       System.out.println(number);
    }

    public static int sum(int n) {
        if (n == 0) {
            return n;
        }

        return sum(n/10) + n%10;
    }

}
