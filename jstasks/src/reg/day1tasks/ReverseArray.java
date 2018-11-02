package reg.day1tasks;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
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
		
		//printing the array that user had entered
		System.out.println("the user entered array is :");
		for(i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//printing the array from right to left
		System.out.println("Reverse of an array is");
		for(i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
