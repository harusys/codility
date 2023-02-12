package Java;

public class BinaryGap {
    public static void main(String[] args) {
        int N = 1041;
        System.out.println(solution(N));
    }

    public static int solution(int N) {
        int finalGap = 0;
        char binaryRep[] = Integer.toBinaryString(N).toCharArray();
        int tempGap = 0;
        for (int x = 0; x < binaryRep.length; x++) {
            if (binaryRep[x] == '0') {
                tempGap++;
                continue;
            } else if (binaryRep[x] == '1') {
                if (tempGap > finalGap)
                    finalGap = tempGap;
                tempGap = 0;
            }
        }
        return finalGap;
    }
}