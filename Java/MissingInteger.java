package Java;

import java.util.Arrays;

class MissingInteger {
    public static void main(String[] args) {
        int[] A = { 1, 3, 6, 4, 1, 2 };
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        boolean[] B = new boolean[1000001];
        Arrays.fill(B, false);
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                B[A[i]] = true;
            }
        }
        for (int j = 1; j < B.length; j++) {
            if (!B[j])
                return j;
        }
        return 1000001;
    }
}
