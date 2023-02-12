package Java;

import java.util.Arrays;

class CyclicRotation {
    public static void main(String[] args) {
        int[] A = { 3, 8, 9, 7, 6 };
        int K = 3;
        System.out.println(Arrays.toString(solution(A, K)));
    }

    public static int[] solution(int[] A, int K) {
        int n = A.length;
        int[] rotatedA = new int[n];

        for (int i = 0; i < n; i++) {
            int index = (i + K) % n;
            rotatedA[index] = A[i];
        }

        return rotatedA;
    }
}