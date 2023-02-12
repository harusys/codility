package Java;

import java.util.Arrays;

class PermCheck {
    public static void main(String[] args) {
        int[] A = { 4, 1, 3, 2 };
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return 0;
            }
        }
        return 1;
    }
}
