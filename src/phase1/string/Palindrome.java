package phase1.string;

public class Palindrome {

    public static void main(String[] args) {
        String test = "ABABA";
        System.out.print(isPalindrome(test));
    }

    private static boolean isPalindrome(String input) {
        boolean isPalindrome = true;
        for(int i = 0; i< input.length()/2; i++) {
            if(input.charAt(i) != input.charAt((input.length()-1-i))) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
