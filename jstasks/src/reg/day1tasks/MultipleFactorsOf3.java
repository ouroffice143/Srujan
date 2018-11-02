package reg.day1tasks;

import java.util.Scanner;

public class MultipleFactorsOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count=0;
		
		//getting array size
		System.out.println("enter the array size");
		Scanner sc= new Scanner(System.in);
		int  size=sc.nextInt();
		int arr[]=new int[size];
		
		//entering elements into an array
		System.out.println("enter the elements into an array");
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//logic for multiples of 3
		for(i=0;i<size;i++) {
			if((arr[i]%3)==0) {
				System.out.println(arr[i]+"is multiple of 3");
			}
		}
	}

}
