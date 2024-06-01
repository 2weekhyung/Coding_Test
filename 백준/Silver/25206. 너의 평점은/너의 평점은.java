import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 과목 등급별 평점 매핑
        Map<String, Double> gradeToPoint = new HashMap<>();
        gradeToPoint.put("A+", 4.5);
        gradeToPoint.put("A0", 4.0);
        gradeToPoint.put("B+", 3.5);
        gradeToPoint.put("B0", 3.0);
        gradeToPoint.put("C+", 2.5);
        gradeToPoint.put("C0", 2.0);
        gradeToPoint.put("D+", 1.5);
        gradeToPoint.put("D0", 1.0);
        gradeToPoint.put("F", 0.0);

        double totalScore = 0.0; // 총 (학점 × 평점)의 합
        double totalCredits = 0.0; // 총 학점의 합

        // 20번 입력 받기
        for (int i = 0; i < 20; i++) {
            String subject = sc.next(); // 과목명
            double credits = sc.nextDouble(); // 학점
            String grade = sc.next(); // 등급

            // 등급이 P인 과목은 계산에서 제외
            if (!grade.equals("P")) {
                totalScore += credits * gradeToPoint.get(grade); // (학점 × 평점)의 합을 누적
                totalCredits += credits; // 학점의 총합을 누적
            }
        }

        // 전공평점 계산
        double gpa = totalScore / totalCredits;
        
        // 결과 출력 (소수점 4자리까지)
        System.out.printf("%.4f\n", gpa);
        
        sc.close(); // Scanner 객체를 닫음
    }
}
