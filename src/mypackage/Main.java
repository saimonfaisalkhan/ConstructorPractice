package mypackage;
import mypackage.Room;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Room room=new Room(12,5);
		room=new Room();
		
		int result=room.area();
		System.out.println(result);
		Room room1=new Room(5,10);
		int result2=room1.area();
		System.out.println("Room2: "+result2);
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		Room room3=new Room(x,y);
		int result3=room3.area();
		System.out.println("Room3: "+result3);
		float result4=room3.area(4);
		System.out.println("Room3: "+result4);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Calculation: "+room3.calculate(a, b));
		double re=Math.pow(2, 3);
		System.out.println("Pow "+re);
	}
}
