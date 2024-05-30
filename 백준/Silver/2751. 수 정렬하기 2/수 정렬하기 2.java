import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 수의 개수 N을 읽습니다.
        int[] arr = new int[n]; // 크기가 N인 배열을 생성합니다.

        // N개의 수를 읽어서 배열에 저장합니다.
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(arr, 0, n - 1); // 병합 정렬을 수행합니다.

        StringBuilder sb = new StringBuilder(); // 결과를 저장할 StringBuilder를 생성합니다.

        // 정렬된 배열의 원소를 StringBuilder에 추가합니다.
        for (int num : arr) {
            sb.append(num).append('\n');
        }

        System.out.print(sb); // 최종 결과를 출력합니다.
    }

    // 병합 정렬 함수
    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) { // 배열의 크기가 1보다 클 때
            int mid = (start + end) / 2; // 중간 지점을 계산합니다.
            mergeSort(arr, start, mid); // 왼쪽 부분 배열에 대해 병합 정렬을 재귀적으로 수행합니다.
            mergeSort(arr, mid + 1, end); // 오른쪽 부분 배열에 대해 병합 정렬을 재귀적으로 수행합니다.
            merge(arr, start, mid, end); // 두 부분 배열을 병합합니다.
        }
    }

    // 두 부분 배열을 병합하는 함수
    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1]; // 임시 배열을 생성합니다.

        int i = start; // 왼쪽 부분 배열의 시작 인덱스
        int j = mid + 1; // 오른쪽 부분 배열의 시작 인덱스
        int k = 0; // 임시 배열의 인덱스

        // 두 부분 배열을 병합하여 임시 배열에 저장합니다.
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // 남은 원소들을 임시 배열에 추가합니다.
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // 임시 배열의 원소들을 원본 배열에 복사합니다.
        for (int l = 0; l < temp.length; l++) {
            arr[start + l] = temp[l];
        }
    }
}