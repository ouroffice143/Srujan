package reg.day1tasks;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		System.out.println("enter the size of pattern");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int i,j,k;
		for(i=1;i<=size;i++) {
			for(j=i;j<size;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			
			System.out.println("");
			
		}

	}

}
