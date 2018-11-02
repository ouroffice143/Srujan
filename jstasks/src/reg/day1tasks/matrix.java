package reg.day1tasks;

import java.util.Scanner;

public class matrix {
static Scanner sc=new Scanner(System.in);
 static int row1,col1,row2,col2,i,j;
	public static void main(String[] args) {
		System.out.println("enter rows size");
		row1=sc.nextInt();
		System.out.println("enter coloumn size");
		col1=sc.nextInt();
		int one[][]=new int[row1][col1];
		System.out.println("enter the elements into an array");
		for(i=0;i<row1;i++) {
			for(j=0;j<col1;j++) {
				one[i][j]=sc.nextInt();
			}
		}
		matrix m=new matrix();
		System.out.println("entered first matrix is");
		m.print(one, row1, col1);
		
		System.out.println("enter thr rows of second matrix");
		row2=sc.nextInt();
		System.out.println("enter coloumn size of second matrix");
		col2=sc.nextInt();
		int two[][]=new int[row2][col2];
		System.out.println("enter the elements into an array");
		for(i=0;i<row2;i++) {
			for(j=0;j<col2;j++) {
				two[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("entered first matrix is");
		m.print(two, row2, col2);
		
		int it=1;
		while(it==1) {
			System.out.println("select your choice");
			System.out.println("1 for add");
			System.out.println("2 for multiply");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:m.add(one, two);
				   System.out.println("you wish to continue select 1");
				   it=sc.nextInt();
				   if(it!=1)
				   break;
				   else
					   continue;
			case 2:	m.multiply(one, two);
			   		System.out.println("you wish to continue select 1");
			   		it=sc.nextInt();
			   		if(it!=1)
			   			break;
			   		else
			   			continue;   

			default:
				break;
			}
		}
		
				
	}
	
	
	
	public void print(int print[][],int row,int col) {
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(print[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public void add(int one[][],int two[][]) {
		
		if((row1==row2)&&(col1==col2)) {
			int add[][]=new int[row1][col1];
			for(i=0;i<row1;i++) {
				for(j=0;j<col1;j++) {
					add[i][j]=one[i][j]+two[i][j];
				}
			}
			System.out.println("addition of matrix is");
			print(add, row1, col1);
		}
		else
			System.out.println("addition is not possible");
	
	
	}
	
	public void multiply(int one[][],int two[][]) {
		if(col1==row2) {
			int sum=0;
			int mul[][]=new int[row1][col2];
			for(i=0;i<row1;i++) {
				for(j=0;j<col1;j++) {
					for( int k=0;k<col2;k++) {
						sum=sum+one[i][k]*two[k][j];
					}
					mul[i][j]=sum;
					sum=0;
				}
			}
			System.out.println("multiplication is");
			print(mul, row1, col2);
		}
	}
	

}

