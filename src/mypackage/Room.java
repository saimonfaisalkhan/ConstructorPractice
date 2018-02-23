package mypackage;
import java.lang.Math;
public class Room {
	int height;
	int width;
	final float pi=3.1416f;
	public Room()
	{
		
	}
   public Room(int height,int width)
	{
		this.height=height;
		this.width=width;
	}
	public int area()
	{
		return height*width;
	}
	public float area(int radious)
	{
		//this.pi=p;
		float result=pi*radious*radious;
		return result;
	}
	public int calculate(int a,int b)
	{
	
		//Math m=new Math
		
		int result=(Integer.parseInt(""+Math.pow(a, a)))+(2*a*b)+(b*b);
		return result;
	}
}
