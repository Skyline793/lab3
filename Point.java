import static java.lang.Math.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Point //класс точка
{
	private static int counter = 0; //статический счетчик количества точек
	protected String metka = ""; //идентификатор точки
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

	public void SetX(int X) //метод установки значения X
	{
		this.X = X;
	}

	public void SetY(int Y) //метод установки значения Y
	{
		this.Y = Y;
	}

	public void SetMetka(String metka) //метод установки значения идентификатора
	{
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

	public String GetMetka() //метод получения идентификатора
	{
		return metka;
	}

	public String toString() //метод вывода в консоль
	{
		return metka + "(" + X + "," + Y + ")";
	}

	public void Read() //метод ввода с консоли
	{
		boolean correct = false;
		int x = 0, y = 0;
		String metka;
		Scanner inp = new Scanner(System.in);
		while(correct == false)
		{
		try {
			System.out.print("Введите координаты точки (x,y): ");
			x = inp.nextInt();
			y = inp.nextInt();
			correct = true;
		}
		catch(InputMismatchException e) {
			inp.nextLine();
			correct = false;
			System.out.println("Некорректное значение. Повторите ввод: ");
		}
	}
		System.out.print("Введите идентификатор точки (Enter, чтобы не создавать идентификатор): ");
		inp.skip("\\R");
		metka = inp.nextLine();
		this.SetX(x);
		this.SetY(y);
		this.SetMetka(metka);
	}

	public void PolarCoords() //метод перевода в полярные координаты
	{
		double r, f = 0;
		r = sqrt(X * X + Y * Y);
		try {
			f = atan((double)Y / X);
			if (X > 0 && Y < 0)
				f += 2 * PI;
			if (X < 0)
				f += PI;
			f = Angle.PerevodToGradus(f);
		}
		catch (ArithmeticException e) {
			if (Y > 0)
				f = Angle.PerevodToGradus(PI / 2);
			if (Y < 0)
				f = Angle.PerevodToGradus(3 * PI / 2);
			if (Y == 0)
				f = 0;
		}
		System.out.printf("Полярные координаты: r=%.3f f=%.1f\n", r, f);
	}

	public static int GetCount() //статический метод получения счетчика
	{
		return counter;
	}
}