package reg.day1tasks;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Areas {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Areas a=new Areas();
		a.selection();

	}
	
	public void selection() {
		System.out.println("Select your choice");
		System.out.println("1 for Triangle area");
		System.out.println("2 for Perimeter");
		System.out.println("3 for circle Area");
		System.out.println("4 for circumferance");
		int c=sc.nextInt();
		
		switch(c){
		case 1:
				double ar=triarea();
				System.out.println("area of triangle "+ar);
				System.out.println("to continue press 1 else any number");
				int ch=sc.nextInt();
				if(ch==1)
					selection();
				else
				break;
		case 2:
				System.out.println("Enter the three sides of triangle");
				double x=sc.nextDouble();
				double y=sc.nextDouble();
				double z=sc.nextDouble();
				perimeter(x, y, z);
				System.out.println("to continue press 1 else any number");
				 ch=sc.nextInt();
				if(ch==1)
					selection();
				else
				break;
		case 3:
				System.out.println("Area of circle");
				circleArea();
				System.out.println("to continue press 1 else any number");
				ch=sc.nextInt();
				if(ch==1)
					selection();
				else
				break;
		case 4:	
				System.out.println("circumfeance of circle");
				circumferance();
				System.out.println("to continue press 1 else any number");
				ch=sc.nextInt();
				if(ch==1)
					selection();
				else
				break;
		}
	}
	
	public double triarea() {
		System.out.println("enter the height of triangle");
		double h=sc.nextDouble();
		System.out.println("enter the base of triangle");
		double b=sc.nextDouble();
		double area;
		area=.5*(h*b);
		return area;		
	}
	public void perimeter(double a,double b,double c) {
		System.out.println("the area of triangle is :"+(a+b+c));
	}
	public void circleArea() {
		System.out.println("enter the radius");
		double r=sc.nextDouble();
		
		double area=(22/7.0)*(r*r);
		System.out.println("The Area of circle is : "+area);
		
	}
	public void circumferance() {
		System.out.println("enter the radius");
		double r=sc.nextDouble();
		double cir=2*(22/7.0)*r;
		System.out.println("the circumferance is : "+cir);
		
	}

}
