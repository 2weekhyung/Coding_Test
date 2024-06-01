import java.util.Scanner;
public class Main {
   public static void main(String [] args)
   {
	   Scanner sc = new Scanner(System.in);
	   
	   int []a = new int [6];
	   for(int i = 0 ; i<a.length;i++)
	   {
		   a[i] = sc.nextInt();
	   }
	   int [] b= {1,1,2,2,2,8};
	   
	   for(int j = 0 ; j<a.length;j++)
	   {
		   int c= b[j]-a[j];
		   System.out.printf("%d " ,c);
	   }
   }
}