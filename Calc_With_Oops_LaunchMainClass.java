package calc_With_OopsPackage;

import java.util.Scanner;

abstract class Shapes
{
	Scanner sc = new Scanner(System.in);
	float area;
	abstract void input();
	abstract void compute();
	public void display()
	{
		System.out.println("The area is "+area);
	}
}

class Rectangle extends Shapes
{
	float length,breadth;
	public void input()
	{
		System.out.println("Please enter the length of the rectangle");
		length=sc.nextFloat();
		System.out.println("Please enter the breadth of the rectangle");
		breadth=sc.nextFloat();
	}
	public void compute()
	{
		area=length*breadth;
		
	}
	
}
class Square extends Shapes
{
	float length;
	public void input()
	{
		System.out.println("Please enter the length of the Square");
		length=sc.nextFloat();
	}
	public void compute()
	{
		area=length*length;
		
	}
	
}
class Circle extends Shapes
{
	final float Pi=3.14f;
	float radius;
	public void input()
	{
		System.out.println("Please enter the radius of the Circle");
		radius=sc.nextFloat();
	}
	public void compute()
	{
		area=Pi*radius*radius;
		
	}
	
}
class Geometry
{
	public void permits(Shapes s)
	{
		s.input();
		s.compute();
		s.display();
	}
	
}

public class Calc_With_Oops_LaunchMainClass {

	public static void main(String[] args) {

		Rectangle r=new Rectangle();
		Square s= new Square();
		Circle c= new Circle();
		Geometry g= new Geometry();
		
		g.permits(r);
		g.permits(s);
		g.permits(c);
	}

}
