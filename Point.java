import static java.lang.Math.*;
import java.util.Scanner;

public class Point //класс точка
{
	protected int X, Y; //координаты точки
	
	Point() //конструктор без параметров
	{
		X = 0;
		Y = 0;
	}
	
	Point(int x, int y) //конструктор с параметрами
	{
		X = x;
		Y = y;
	}
	
	public void Init(int x, int y) //метод инициализации
	{
		X = x;
		Y = y;
	}
	
	public int GetX() //метод получения координаты X
	{
		return X;
	}
	
	public int GetY() //метод получения координаты Y
	{
		return Y;
	}
	
	public void Display() //метод вывода в консоль
	{
		System.out.printf("(%d,%d)", X, Y);
	}
	
	public void Read() //метод ввода с консоли
	{
		int x, y;
		Scanner inp = new Scanner(System.in);
		System.out.print("Введите координаты (x,y): ");
		x = inp.nextInt();
		y = inp.nextInt();
		this.Init(x, y);
	}
	
	public void PolarCoords() //метод перевода в полярные координаты
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