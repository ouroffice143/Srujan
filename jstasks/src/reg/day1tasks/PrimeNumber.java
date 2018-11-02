package reg.day1tasks;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int flag=0;
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int m= num/2;
		for(int i=2;i<=m;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println(num+ "is not prime number");
		}
		else
			System.out.println(num +" is prime number");
	}

}
