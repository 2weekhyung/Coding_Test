import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N != 1) {
            primeFactors(N);
        }

        sc.close();
    }

    // 주어진 정수 N을 소인수분해하여 소수인 소인수를 출력하는 함수
    public static void primeFactors(int n) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }
}
