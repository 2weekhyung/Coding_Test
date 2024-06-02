import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<Integer>();
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // N의 약수를 구하기
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                array.add(i);
            }
        }

        // K번째 약수 출력 또는 0 출력
        if (array.size() >= m) {
            System.out.println(array.get(m - 1));
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
