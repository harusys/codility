package Java;

class XOR {
    public static void main(String[] args) {
        System.out.println(solution(5, 8));
    }

    public static int solution(int M, int N) {
        int ans = 0;
        for (int i = M; i <= N; i++) {
            ans ^= i;
        }
        return ans;
    }
}
