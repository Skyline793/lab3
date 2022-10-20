import java.util.Scanner;
import static java.lang.Math.*;

public class Vector extends Point //класс вектор, наследуемый от класса точка
{
	Vector() //конструктор без параметров
	{
		super(0,0);
	}
	
	Vector(int x, int y) //конструктор с параметрами
	{
		super(x, y);
	}

	@Override
	public void Read() //метод ввода с консоли
	{
		int x, y;
		Scanner inp = new Scanner(System.in);
		System.out.print("Введите координаты вектора (x,y): ");
		x = inp.nextInt();
		y = inp.nextInt();
		this.Init(x, y);
	}

	@Override
	public void Display() //метод вывода в консоль
	{
		System.out.printf("Вектор с координатами: (%d,%d)\n", X, Y);
	}
	
	public double CalcVectLen() //метод вычисления длины вектора
	{
		double length = sqrt(X * X + Y * Y);
		return length;
	}

	public void CalcVectLen(Rezult rez) //метод вычисления длины вектора
	{
		rez.param = sqrt(X * X + Y * Y);
	}
	
	public double CalcScalarProd(Vector v2) //метод вычисления скалярного произведения
	{
		int x1 = this.X;
		int y1 = this.Y;
		int x2 = v2.X;
		int y2 = v2.Y;
		double prod;
		prod = x1 * x2 + y1 * y2;
		return prod;
	}
}