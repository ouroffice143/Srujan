package reg.day1tasks;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many digit number you want to check");
		int digit=sc.nextInt();
		System.out.println("enter the number");
		
		int num=sc.nextInt();
		int compare=num;
		
		
		while(num!=0) {
			temp=num%10;
			int count=digit+1;
			while(count>=digit) {
				temp=temp*temp;
				count--;
			}
			sum=sum+temp;
			num=num/10;
			
		}
		
		if(sum==compare) {
			System.out.println(compare +" is armstrong number");
		}
		else {
			System.out.println(compare +" is not armstrong number");
		}
		
	}

}
