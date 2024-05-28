import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 행렬의 크기 N과 M 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];

        // 행렬 A의 원소 입력받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 행렬 B의 원소 입력받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 두 행렬의 합을 저장할 행렬 result 선언 및 초기화
        int[][] result = new int[N][M];

        // 행렬 A와 B의 합을 구해서 행렬 result에 저장
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // 결과 행렬 result 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
