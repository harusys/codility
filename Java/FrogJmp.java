package Java;

public class FrogJmp {
    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }

    public static int solution(int X, int Y, int D) {
        int distance = Y - X;
        int cnt = distance / D;
        if (distance % D != 0)
            cnt++;
        return cnt;
    }
}
