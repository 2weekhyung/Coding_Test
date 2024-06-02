import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 단어의 개수를 입력받습니다.
        int N = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 문자를 소비합니다.
        
        // 단어들을 저장할 Set을 만듭니다. Set을 사용하여 중복을 제거합니다.
        Set<String> wordSet = new HashSet<>();
        
        // 단어들을 입력받아 Set에 추가합니다.
        for (int i = 0; i < N; i++) {
            wordSet.add(scanner.nextLine());
        }
        
        // Set을 List로 변환합니다.
        List<String> words = new ArrayList<>(wordSet);
        
        // 단어들을 정렬합니다.
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                if (word1.length() == word2.length()) {
                    return word1.compareTo(word2);
                } else {
                    return Integer.compare(word1.length(), word2.length());
                }
            }
        });
        
        // 정렬된 단어들을 출력합니다.
        for (String word : words) {
            System.out.println(word);
        }
        
        scanner.close();
    }
}
