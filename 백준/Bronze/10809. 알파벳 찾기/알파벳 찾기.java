import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int[] positions = new int[26]; // 알파벳 개수만큼의 배열을 생성하여 위치를 저장합니다.
        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1; // 초기값으로 -1을 설정합니다.
        }

        // 문자열을 순회하면서 각 알파벳의 위치를 찾습니다.
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int index = c - 'a'; // 알파벳의 인덱스를 계산합니다.
            // 해당 알파벳의 위치가 아직 설정되지 않았다면, 현재 인덱스를 저장합니다.
            if (positions[index] == -1) {
                positions[index] = i;
            }
        }

        // 결과를 출력합니다.
        for (int i = 0; i < positions.length; i++) {
            System.out.print(positions[i] + " ");
        }
    }
}
