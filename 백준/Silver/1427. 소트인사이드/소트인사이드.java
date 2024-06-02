import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력을 받습니다.
        String N = scanner.nextLine();

        // 문자열을 문자 배열로 변환합니다.
        Character[] digits = new Character[N.length()];
        for (int i = 0; i < N.length(); i++) {
            digits[i] = N.charAt(i);
        }

        // 문자 배열을 내림차순으로 정렬합니다.
        Arrays.sort(digits, Collections.reverseOrder());

        // 정렬된 문자 배열을 문자열로 결합합니다.
        StringBuilder result = new StringBuilder(digits.length);
        for (Character digit : digits) {
            result.append(digit);
        }

        // 결과를 출력합니다.
        System.out.println(result.toString());

        scanner.close();
    }
}
