import java.util.Scanner;
import static java.lang.Math.*;

public class Parallelogram //класс параллелограмм
{
	private Vector a, b; //вектора, на которых построен параллелограмм
	
	Parallelogram() //конструктор без параметров
	{
		a = new Vector();
		b = new Vector();
	}
	
	Parallelogram(int x1, int y1, int x2, int y2) //конструктор с параметрами
	{
		a = new Vector(x1, y1);
		b = new Vector(x2, y2);
	}
	
	public void Init(int x1, int y1, int x2, int y2) //метод инициализации
	{
		a.Init(x1, y1);
		b.Init(x2, y2);
	}
	
	public void Read() //метод ввода с консоли
	{
		System.out.println("Первый из векторов, на которых построен параллелограмм:");
		a.Read();
		System.out.println("Второй из векторов, на которых построен параллелограмм:");
		b.Read();
	}
	
	public void Display() //метод вывода в консоль
	{
		System.out.println("Параллелограмм, построенный на векторах a и b:");
		a.Display();
		b.Display();
	}
	
	public double CalcSquare() //метод вычисления площади
	{
		double S, len_a, len_b, prod, cosinus, sinus;
		len_a = a.CalcVectLen();
		len_b = b.CalcVectLen();
		prod = a.CalcScalarProd(b);
		if(len_a == 0 || len_b == 0)
			cosinus = 0;
		else
			cosinus = prod / (len_a * len_b);
		sinus = sqrt(1 - cosinus * cosinus);
		S = len_a * len_b * sinus;
		return S;	
	}

	public void CalcSquare(Rezult rez) //метод вычисления площади c возвращением результата через вспомогательный класс
	{
		double len_a, len_b, prod, cosinus, sinus;
		len_a = a.CalcVectLen();
		len_b = b.CalcVectLen();
		prod = a.CalcScalarProd(b);
		if(len_a == 0 || len_b == 0)
			cosinus = 0;
		else
			cosinus = prod / (len_a * len_b);
		sinus = sqrt(1 - cosinus * cosinus);
		rez.param = len_a * len_b * sinus;
	}
}