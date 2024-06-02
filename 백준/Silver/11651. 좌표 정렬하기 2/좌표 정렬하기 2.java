import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 점의 개수를 입력받습니다.
        int N = scanner.nextInt();
        
        // 점들을 저장할 배열을 만듭니다.
        int[][] points = new int[N][2];
        
        // 점들을 입력받습니다.
        for (int i = 0; i < N; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }
        
        // 점들을 정렬합니다.
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] point1, int[] point2) {
                if (point1[1] == point2[1]) {
                    return Integer.compare(point1[0], point2[0]);
                } else {
                    return Integer.compare(point1[1], point2[1]);
                }
            }
        });
        
        // 정렬된 점들을 출력합니다.
        for (int i = 0; i < N; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }
        
        scanner.close();
    }
}
