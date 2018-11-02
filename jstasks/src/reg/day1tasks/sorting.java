package reg.day1tasks;


import java.util.Arrays;
import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		int i,j,temp;
		
		//getting aay size
		System.out.println("enter the array size");
		Scanner sc= new Scanner(System.in);
		int  size=sc.nextInt();
		int a[]=new int[size];
		
		//entering elements into an aay
		System.out.println("enter the elements into an array");
		for(i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		//printing the aay that user had entered
		System.out.println("the user entered array is :");
		for(i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		//logic
		Arrays.sort(a);
		System.out.println("the sorted array is :");
		for(i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				if((a[i]%2)==0) {    //checking a[i] is even
					
					if(a[j]%2!=0) {			//checking a[j] is odd
						if(i<j) {			//i should not compare with lower than i value and swaping numbers
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
					}
					else {
						if(a[i]>a[j]) {			//cheking even numbers and swaping in desending order
							temp=a[j];
							a[j]=a[i];
							a[i]=temp;
							
						}
					}
				}
				
				
			}
		}
		System.out.println("the required sorted array is :");
		for(i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
	}
	
}
