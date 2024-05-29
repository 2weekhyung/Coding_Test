import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int score = 0;
        int sum =0;

        for (int i = 0; i < a; i++) {
            String s = sc.next();

            char [] arr = s.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == 'O'){
                    sum++;
                    score += sum;
                }
                else if(arr[j] == 'X'){
                    sum = 0;

                }
            }
            System.out.println(score);
            score = 0;
            sum=0;
        }


    }
}