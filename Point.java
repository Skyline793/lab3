import static java.lang.Math.*;
import java.util.Scanner;

public class Point
{
	private int X, Y;
	Point()
	{
		X = 0;
		Y = 0;
	}
	
	Point(int x, int y)
	{
		X = x;
		Y = y;
	}
	
	public void Init(int x, int y)
	{
		X = x;
		Y = y;
	}
	
	public int GetX()
	{
		return X;
	}
	
	public int GetY()
	{
		return Y;
	}
	
	public void Display()
	{
		System.out.printf("(%d,%d)\n", X, Y);
	}
	
	public void Read()
	{
		int x, y;
		Scanner inp = new Scanner(System.in);
		System.out.print("Введите координаты (x,y): ");
		x = inp.nextInt();
		y = inp.nextInt();
		inp.close();
		this.Init(x, y);
	}
	
	public void PolarCoords()
	{
		double r, f;
		r = sqrt(X*X + Y*Y);
		if(X==0){
			if(Y>0)
				f = PI/2;
			if(Y < 0)
				f = 3*PI/2;
			else f = 0;
		}
		else {
			f = atan((double)Y/X);
			if (X>0 && Y<0)
				f+= 2*PI;
			if (X<0)
				f+= PI;
		}
		f *= 180/PI;
		System.out.printf("Полярные координаты: r=%.3f f=%.1f\n", r, f);
	}
}