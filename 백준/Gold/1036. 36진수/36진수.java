import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 처리
        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비
        String[] numbers = new String[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextLine();
        }
        int K = sc.nextInt();
        
        // 최대 합 출력
        System.out.println(getMaxSum(numbers, K));
    }
    
    static String getMaxSum(String[] numbers, int K) {
        // 각 문자에 대한 이득 맵 초기화
        Map<Character, BigInteger> gainMap = new HashMap<>();
        
        // 모든 숫자에 대한 이득 계산
        for (String number : numbers) {
            int len = number.length();
            for (int i = 0; i < len; i++) {
                char ch = number.charAt(i);
                BigInteger value = BigInteger.valueOf(Character.isDigit(ch) ? ch - '0' : ch - 'A' + 10);
                BigInteger positionValue = BigInteger.valueOf(36).pow(len - i - 1);
                gainMap.put(ch, gainMap.getOrDefault(ch, BigInteger.ZERO).add(positionValue.multiply(BigInteger.valueOf(35).subtract(value))));
            }
        }
        
        // 이득이 가장 큰 K개의 문자 결정
        List<Map.Entry<Character, BigInteger>> gainList = new ArrayList<>(gainMap.entrySet());
        gainList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        Set<Character> toReplace = new HashSet<>();
        for (int i = 0; i < Math.min(K, gainList.size()); i++) {
            toReplace.add(gainList.get(i).getKey());
        }
        
        // 문자를 바꾸고 합 계산
        BigInteger totalSum = BigInteger.ZERO;
        for (String number : numbers) {
            BigInteger currentSum = BigInteger.ZERO;
            int len = number.length();
            for (int i = 0; i < len; i++) {
                char ch = number.charAt(i);
                BigInteger value = BigInteger.valueOf(toReplace.contains(ch) ? 35 : (Character.isDigit(ch) ? ch - '0' : ch - 'A' + 10));
                currentSum = currentSum.add(value.multiply(BigInteger.valueOf(36).pow(len - i - 1)));
            }
            totalSum = totalSum.add(currentSum);
        }
        
        // 합을 36진법으로 변환하여 반환
        return totalSum.toString(36).toUpperCase();
    }
}
