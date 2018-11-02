package reg.day1tasks;

import java.util.Scanner;

public class Duplicate {

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
		
		//printing the array that user had entered
		System.out.println("the user entered array is :");
		for(i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//logic to find duplicates
		for(i=0;i<size;i++) {
			count=0;
			for(j=0;j<size;j++) {
				if(arr[i]==arr[j]) {  
					count++;
					if(i!=j)
					arr[j]=-1;			// this step changes the logic of the given array if 
																													
				}
				
			}
			if(count>1&&arr[i]!=-1) {
				System.out.println("the"+ arr[i]+"th element repeated "+count+" times" );
				
			}
			
			
		}
	}

}
