import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 입력을 받는다.
        Scanner sc = new Scanner(System.in);
        // 입력된 단어를 변수에 저장한다.
        String word = sc.nextLine();
        
        // 초기값을 카운트 0으로 설정
        int count = 0;
        int length = word.length();

        for (int i = 0; i < length; i++) {
            // 크로아티아 알파벳을 체크
            if (i < length - 1) {
                if (word.charAt(i) == 'c' && (word.charAt(i + 1) == '=' || word.charAt(i + 1) == '-')) {
                    i++;
                } else if (word.charAt(i) == 'd') {
                    if (i < length - 2 && word.charAt(i + 1) == 'z' && word.charAt(i + 2) == '=') {
                        i += 2;
                    } else if (word.charAt(i + 1) == '-') {
                        i++;
                    }
                } else if (word.charAt(i) == 'l' && word.charAt(i + 1) == 'j') {
                    i++;
                } else if (word.charAt(i) == 'n' && word.charAt(i + 1) == 'j') {
                    i++;
                } else if (word.charAt(i) == 's' && word.charAt(i + 1) == '=') {
                    i++;
                } else if (word.charAt(i) == 'z' && word.charAt(i + 1) == '=') {
                    i++;
                }
            }
            // 크로아티아 알파벳이든 아니든 알파벳 수 증가
            count++;
        }

        // 결과 출력
        System.out.println(count);

        // 스캐너 객체를 닫는다.
        sc.close();
    }
}
