package obsqraassignment;

import java.util.Scanner;

public class LinearSearch {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++) {
			
			a[i]=sc.nextInt();
		}
for(int i=0;i<size;i++) {
	System.out.println(a[i]);

			
		}
System.out.println("enter the element to be serched");
int b= sc.nextInt();
for (int i=0;i<size;i++) {
	if(a[i]==b) {
		System.out.println("element found at index="+i);
	}
	
}
}}
