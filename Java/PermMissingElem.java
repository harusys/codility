package Java;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = { 2, 3, 1, 5 };
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i])
                return i + 1;
        }
        return A.length + 1;
    }
}
