package obsqraassignment;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int count=0;
		for(int i=1; i<=a;i++) {
			if(a%i==0) {
				count++;
			}}
			if (count==2) {
				System.out.println("number is prime");
			}
			else {
				System.out.println("number is not  prime");

			}
		}
	}


