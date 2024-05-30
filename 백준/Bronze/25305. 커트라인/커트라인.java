import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] a = br.readLine().split(" ");

        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);

        String []b = br.readLine().split(" ");

        int [] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(b[i]);
        }

        for(int i = 0; i < score.length-1; i++){
            for(int j = 0; j < score.length-1-i; j++){
                if(score[j] < score[j+1]){
                    int temp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = temp;
                }
            }
        }

        System.out.println(score[m-1]);
    }
}