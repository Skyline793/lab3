import java.util.Scanner;
import static java.lang.Math.*;

public class Parallelogram
{
	private Vector a, b;
	
	Parallelogram()
	{
		a = new Vector();
		b = new Vector();
	}
	
	Parallelogram(int x1, int y1, int x2, int y2)
	{
		a = new Vector(x1, y1);
		b = new Vector(x2, y2);
	}
	
	public void Init(int x1, int y1, int x2, int y2)
	{
		a.Init(x1, y1);
		b.Init(x2, y2);
	}
	
	public void Read()
	{
		int x1, y1, x2, y2;
		Scanner inp = new Scanner(System.in);
		System.out.print("Введите координаты первого из векторов, на которых построен параллелограмм (x1, y1): ");
		x1 =inp.nextInt();
		y1 =inp.nextInt();
		System.out.print("Введите координаты второго из векторов, на которых построен параллелограмм (x2, y2): ");
		x2 =inp.nextInt();
		y2 =inp.nextInt();
		a.Init(x1, y1);
		b.Init(x2, y2);
	}
	
	public void Display()
	{
		System.out.println("Параллелограмм, построенный на векторах a и b:");
		a.Display();
		b.Display();
	}
	
	public double CalcSquare()
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
		System.out.printf("%f %f %f %f %f\n", len_a, len_b, prod, cosinus, sinus);
		S = len_a * len_b * sinus;
		return S;	
	}
}