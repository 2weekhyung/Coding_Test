import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체를 생성하여 입력을 받음
        int N = sc.nextInt(); // 단어의 개수를 입력받음
        sc.nextLine(); // 개행 문자 소비 (nextInt() 후에 남은 개행 문자를 처리)
        int groupWordCount = 0; // 그룹 단어의 개수를 세기 위한 변수 초기화

        // 입력된 단어의 개수만큼 반복
        for (int i = 0; i < N; i++) {
            String word = sc.nextLine(); // 각 단어를 입력받음
            if (isGroupWord(word)) { // 단어가 그룹 단어인지 확인
                groupWordCount++; // 그룹 단어이면 카운트를 증가시킴
            }
        }

        System.out.println(groupWordCount); // 최종 그룹 단어의 개수를 출력
        sc.close(); // Scanner 객체를 닫음
    }

    // 단어가 그룹 단어인지 확인하는 메서드
    public static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26]; // 각 문자의 등장 여부를 저장하는 배열
        char lastChar = ' '; // 마지막으로 등장한 문자를 저장하는 변수
        
        // 단어의 각 문자를 순회
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i); // 현재 문자를 가져옴
            if (currentChar != lastChar) { // 현재 문자가 마지막 문자와 다르면
                if (seen[currentChar - 'a']) { // 현재 문자가 이전에 등장한 적이 있는지 확인
                    return false; // 이전에 등장한 적이 있으면 그룹 단어가 아님
                }
                seen[currentChar - 'a'] = true; // 현재 문자를 등장한 것으로 표시
                lastChar = currentChar; // 마지막 문자를 현재 문자로 갱신
            }
        }
        return true; // 모든 조건을 통과하면 그룹 단어임
    }
}
