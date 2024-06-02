import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }

            int sum = 0;
            StringBuilder sb = new StringBuilder(); // 약수들을 저장할 문자열

            // 약수 구하기 및 약수의 합 계산
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    if (sb.length() > 0) {
                        sb.append(" + ");
                    }
                    sb.append(i); // 약수 추가
                }
            }

            // 완전수인지 판단
            if (sum == n) {
                System.out.println(n + " = " + sb.toString());
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }

        sc.close();
    }
}
