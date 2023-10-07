package phase2;

import java.util.ArrayList;

public class TestJava {

    public static void main(String[] args) {
      System.out.println(toh(3, 1, 3, 2));
    }

    public static long toh(int N, int from, int to, int aux) {
        long sum = 0;
        if (N == 1) {
            System.out.println("move disk 1 from " + from + " to " + to);
            return 1;
        }
        sum = sum + toh(N-1, from, aux, to);
        sum += 1;
        System.out.println("move disk " + N + " from " + from + " to " + to);
        sum = sum + toh(N-1, aux, to, from);
        return sum;
    }

}

