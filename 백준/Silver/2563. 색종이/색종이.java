import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 색종이의 수
        boolean[][] paper = new boolean[100][100]; // 100x100 도화지
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // 색종이의 크기 10x10을 도화지에 표시
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = true;
                }
            }
        }
        
        int area = 0;
        
        // 검은 영역의 넓이 계산
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    area++;
                }
            }
        }
        
        System.out.println(area);
        
        sc.close();
    }
}
