import static java.lang.Math.*;
import java.util.Scanner;

public class Point //класс точка
{
	private static int counter = 0; //статический счетчик количества точек
	private String metka = ""; //идентификатор точки
	protected int X, Y; //координаты точки

	Point() //конструктор без параметров
	{
		X = 0;
		Y = 0;
		counter++;
	}

	Point(int X, int Y) //конструктор с параметрами
	{
		this.X = X;
		this.Y = Y;
		counter++;
	}

	Point(int X, int Y, String metka) //конструктор с параметрами
	{
		this.X = X;
		this.Y = Y;
		this.metka = metka;
		counter++;
	}

	protected void finalize() //"деструктор"
	{
		counter--;
	}
	public void Init(int X, int Y) //метод инициализации
	{
		this.X = X;
		this.Y = Y;
	}

	public void Init(int X, int Y, String metka){ //метод инициализации с идентификатором
		this.X = X;
		this.Y = Y;
		this.metka = metka;
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
		if(metka.isEmpty())
			System.out.printf("(%d,%d)", X, Y);
		else {
			System.out.print(metka);
			System.out.printf("(%d,%d)", X, Y);
		}
	}

	public void Read() //метод ввода с консоли
	{
		int x, y;
		String metka;
		Scanner inp = new Scanner(System.in);
		System.out.print("Введите координаты (x,y): ");
		x = inp.nextInt();
		y = inp.nextInt();
		System.out.print("Введите идентификатор точки (Enter, чтобы не создавать идентификатор): ");
		inp.skip("\\R");
		metka = inp.nextLine();
		this.Init(x, y, metka);
	}

	public void PolarCoords() //метод перевода в полярные координаты
	{
		double r, f;
		r = sqrt(X * X + Y * Y);
		if (X == 0) {
			if (Y > 0)
				f = PerevodToGradus(PI / 2);
			if (Y < 0)
				f = PerevodToGradus(3 * PI / 2);
			else f = 0;
		} else {
			f = atan((double) Y / X);
			if (X > 0 && Y < 0)
				f += 2 * PI;
			if (X < 0)
				f += PI;
			f = PerevodToGradus(f);
		}
		System.out.printf("Полярные координаты: r=%.3f f=%.1f\n", r, f);
	}

	public static double PerevodToGradus(double rad) //статический метод перевода радиан в градусы
	{
		double grad = rad * 180 / PI;
		return grad;
	}

	public static double PerevodToRadian(double grad) //статический метод перевода градусов в радианы
	{
		double rad = grad * PI / 180;
		return rad;
	}

	public static int GetCount() //статический метод получения счетчика
	{
		return counter;
	}
}