package Java;

import java.util.Arrays;

class MaxCounters {
    public static void main(String[] args) {
        int[] A = { 3, 4, 4, 6, 1, 4, 4 };
        System.out.println(Arrays.toString(solution(5, A)));
    }

    public static int[] solution(int N, int[] A) {
        int[] ans = new int[N];
        int max = 0;
        int lastMax = 0;
        for (int k = 0; k < A.length; k++) {
            if (A[k] >= 1 && A[k] <= N) {
                ans[A[k] - 1] = Math.max(ans[A[k] - 1], lastMax);
                ans[A[k] - 1] += 1;
                max = Math.max(max, ans[A[k] - 1]);
            } else if (A[k] == N + 1) {
                lastMax = max;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.max(ans[i], lastMax);
        }
        return ans;
    }
}
