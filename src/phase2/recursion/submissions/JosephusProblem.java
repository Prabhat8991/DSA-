package phase2.recursion.submissions;

public class JosephusProblem {
    public static void main(String[] args) {
      System.out.println(josephus(3,2));
    }

    public static int josephus(int n, int k)
    {
        if (n == 1) {
            return 0;
        }
        return (josephus(n-1, k)+k)%n;
    }

}
