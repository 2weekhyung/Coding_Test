import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 문자열을 대문자로 변환
        String s = sc.next().toUpperCase();

        // 알파벳 문자의 빈도를 저장할 배열
        int[] count = new int[26];

        // 각 문자의 빈도를 계산
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

        // 가장 빈도가 높은 문자를 찾기
        int max = 0;
        char maxChar = '?';
        boolean isDuplicate = false;

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                maxChar = (char) (i + 'A');
                isDuplicate = false;
            } else if (count[i] == max) {
                isDuplicate = true;
            }
        }

        // 결과 출력
        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println(maxChar);
        }

        sc.close();
    }
}
