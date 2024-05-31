import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 이차원 배열 생성
        char[][] arr = new char[5][];

        // 입력받기
        for (int i = 0; i < 5; i++) {
            String line = sc.nextLine();
            arr[i] = line.toCharArray(); // 각 줄을 char 배열로 변환하여 저장
        }

        // 세로로 읽기
        StringBuilder result = new StringBuilder();
        int maxLength = getMaxLength(arr); // 최대 길이 계산

        for (int col = 0; col < maxLength; col++) {
            for (int row = 0; row < 5; row++) {
                if (col < arr[row].length) {
                    result.append(arr[row][col]); // 세로로 읽은 문자 추가
                }
            }
        }

        // 결과 출력
        System.out.println(result.toString());
    }

    // 이차원 배열에서 최대 길이 찾기
    private static int getMaxLength(char[][] arr) {
        int maxLength = 0;
        for (char[] row : arr) {
            maxLength = Math.max(maxLength, row.length);
        }
        return maxLength;
    }
}