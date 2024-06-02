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
        
        // 병합 정렬을 사용하여 점들을 정렬합니다.
        mergeSort(points, 0, N - 1);
        
        // 정렬된 점들을 출력합니다.
        for (int i = 0; i < N; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }
        
        scanner.close();
    }
    
    // 병합 정렬 함수
    public static void mergeSort(int[][] points, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(points, left, mid);
            mergeSort(points, mid + 1, right);
            merge(points, left, mid, right);
        }
    }
    
    // 병합 함수
    public static void merge(int[][] points, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        // 임시 배열 생성
        int[][] leftArray = new int[n1][2];
        int[][] rightArray = new int[n2][2];
        
        // 데이터 복사
        for (int i = 0; i < n1; i++) {
            leftArray[i][0] = points[left + i][0];
            leftArray[i][1] = points[left + i][1];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i][0] = points[mid + 1 + i][0];
            rightArray[i][1] = points[mid + 1 + i][1];
        }
        
        // 병합
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i][0] < rightArray[j][0] || 
               (leftArray[i][0] == rightArray[j][0] && leftArray[i][1] <= rightArray[j][1])) {
                points[k][0] = leftArray[i][0];
                points[k][1] = leftArray[i][1];
                i++;
            } else {
                points[k][0] = rightArray[j][0];
                points[k][1] = rightArray[j][1];
                j++;
            }
            k++;
        }
        
        // 남은 데이터 복사
        while (i < n1) {
            points[k][0] = leftArray[i][0];
            points[k][1] = leftArray[i][1];
            i++;
            k++;
        }
        while (j < n2) {
            points[k][0] = rightArray[j][0];
            points[k][1] = rightArray[j][1];
            j++;
            k++;
        }
    }
}
