package Java;

import java.util.HashSet;

class Distinct {
    public static void main(String[] args) {
        int[] A = { 2, 1, 1, 2, 3, 1 };
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int a : A)
            hash.add(a);
        return hash.size();
    }
}
