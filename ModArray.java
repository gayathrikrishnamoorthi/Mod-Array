package sample;

public class ModArray {
	

	import java.util.Scanner;

	


		public static void main(String[] args) {
				    Scanner sc = new Scanner(System.in);
				    StringBuilder s = new StringBuilder();
				    System.out.println("Enter the length:");
				    int n = sc.nextInt();
				    System.out.println("Enter B:");
			        int b = sc.nextInt();	    
				    int[] a=new int[n];
				    System.out.println("Enter the array elements:");
				    for(int i = 0;i<n;i++){
				        a[i] = sc.nextInt();
				    }
				    for(int j=0; j<n; j++){
				        s.append(a[j]);
				    }
				    String num = s.toString();
				    int num1 = Integer.parseInt(num);
				    System.out.println(num1%b);

				    }

	 


