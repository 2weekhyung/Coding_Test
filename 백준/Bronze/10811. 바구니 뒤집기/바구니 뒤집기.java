import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 바구니의 개수 N과 역순으로 만들 바구니의 순서를 입력받을 횟수 M 입력
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 바구니의 순서를 저장할 배열 생성
        int[] baskets = new int[N + 1]; // 1부터 시작하기 위해 크기를 N + 1로 설정

        // 바구니의 순서를 1부터 N까지 초기화
        for (int i = 1; i <= N; i++) {
            baskets[i] = i;
        }

        // M번 반복하면서 역순으로 만들 바구니의 범위를 입력받고 해당 범위를 역순으로 만듦
        for (int i = 0; i < M; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            reverse(baskets, start, end);
        }

        // 결과 출력
        for (int i = 1; i <= N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }

    // 역순으로 만들 바구니의 범위를 역순으로 만드는 메소드
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
