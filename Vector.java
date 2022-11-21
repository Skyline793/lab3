import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.*;

public class Vector extends Point implements Readable//класс вектор, наследуемый от класса точка
{
	Vector() //конструктор без параметров
	{
		super(0,0);
	}
	
	Vector(int x, int y) //конструктор с параметрами
	{
		super(x, y);
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
				System.out.print("Введите координаты вектора (x,y): ");
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
		this.SetX(x);
		this.SetY(y);
	}

	@Override
	public String toString() //метод вывода в консоль
	{
		return "Вектор с координатами: (" + X + "," + Y + ")";
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