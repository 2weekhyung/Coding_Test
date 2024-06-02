import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 좌표의 개수 N을 입력받습니다.
        int N = scanner.nextInt();
        
        // 좌표를 저장할 배열을 만듭니다.
        int[] coordinates = new int[N];
        for (int i = 0; i < N; i++) {
            coordinates[i] = scanner.nextInt();
        }
        
        // 좌표를 복사한 후 정렬합니다.
        int[] sortedCoordinates = coordinates.clone();
        Arrays.sort(sortedCoordinates);
        
        // 정렬된 좌표를 기반으로 좌표 압축을 위한 맵을 생성합니다.
        Map<Integer, Integer> coordinateMap = new HashMap<>();
        int index = 0;
        for (int coord : sortedCoordinates) {
            if (!coordinateMap.containsKey(coord)) {
                coordinateMap.put(coord, index++);
            }
        }
        
        // 원본 좌표를 압축된 좌표로 변환하여 출력합니다.
        StringBuilder result = new StringBuilder();
        for (int coord : coordinates) {
            result.append(coordinateMap.get(coord)).append(' ');
        }
        
        // 결과 출력
        System.out.println(result.toString().trim());
        
        scanner.close();
    }
}

