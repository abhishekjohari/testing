package week1;

import java.util.Scanner;

public class FibonacciDemo {

	public static void main(String[] args) {
		int Fiblength;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		 Fiblength = sc.nextInt();
		 int[] num = new int[Fiblength];
		 num[0] = 0;
		 num[1] = 1;
		 
		 for(int i=2; i<Fiblength; i++) {
			 num[i] = num[i-1] + num[i-2];
			 
		 }
		 System.out.println("Fibonacci is ");
		 for(int i=0; i<Fiblength; i++) {
			 System.out.println(num[i] + " ");
		 }
	}

}
