import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int [][] array = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int max = array[0][0];
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        // 행과 열은 1부터 시작하므로 x와 y에 1을 더합니다.
        System.out.println(max);
        System.out.println((x + 1) + " " + (y + 1));
    }
}
