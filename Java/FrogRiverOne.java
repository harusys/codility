package Java;

import java.util.HashSet;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
        System.out.println(solution(5, A));
    }

    public static int solution(int X, int[] A) {
        HashSet<Integer> L = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X)
                L.add(A[i]);

            if (L.size() == X)
                return i;
        }

        return -1;
    }
}
