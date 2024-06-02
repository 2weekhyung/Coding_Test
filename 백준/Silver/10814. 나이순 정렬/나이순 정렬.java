import java.util.*;

class Member {
    int age;
    String name;
    int index;

    public Member(int age, String name, int index) {
        this.age = age;
        this.name = name;
        this.index = index;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 회원의 수 N을 입력받습니다.
        int N = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 문자를 소비합니다.
        
        // 회원 정보를 저장할 리스트를 만듭니다.
        List<Member> members = new ArrayList<>();
        
        // 회원 정보를 입력받습니다.
        for (int i = 0; i < N; i++) {
            int age = scanner.nextInt();
            String name = scanner.next();
            members.add(new Member(age, name, i));
        }
        
        // 회원 정보를 정렬합니다.
        members.sort((m1, m2) -> {
            if (m1.age == m2.age) {
                return Integer.compare(m1.index, m2.index);
            } else {
                return Integer.compare(m1.age, m2.age);
            }
        });
        
        // 정렬된 회원 정보를 출력합니다.
        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
        
        scanner.close();
    }
}
