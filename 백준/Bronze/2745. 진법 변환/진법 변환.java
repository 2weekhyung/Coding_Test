import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String number = sc.next(); // B진법의 수
        int base = sc.nextInt(); // B진법
        
        int decimal = convertToDecimal(number, base); // 10진법으로 변환
        
        System.out.println(decimal); // 결과 출력
        
        sc.close();
    }
    
    // B진법 수를 10진법으로 변환하는 메서드
    public static int convertToDecimal(String number, int base) {
        int decimal = 0;
        int power = 1; // 각 자리의 가중치 (base^0부터 시작)
        
        // 문자열을 뒤에서부터 순회하여 각 자리의 수를 10진법으로 변환하여 합산
        for (int i = number.length() - 1; i >= 0; i--) {
            char digit = number.charAt(i);
            int value;
            if (Character.isDigit(digit)) { // 숫자인 경우
                value = digit - '0';
            } else { // 알파벳인 경우
                value = digit - 'A' + 10;
            }
            decimal += value * power;
            power *= base; // 다음 자리의 가중치를 계산하기 위해 base를 곱함
        }
        
        return decimal;
    }
}
