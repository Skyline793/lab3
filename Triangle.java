import java.util.Scanner;
import static java.lang.Math.*;

public class Triangle //класс треугольник
{
	private Point A, B, C; //вершины треугольника
	
	Triangle() //конструктор без параметров
	{
		A = new Point();
		B = new Point();
		C = new Point();
	}
	
	Triangle(int x1, int y1, int x2, int y2, int x3, int y3) //конструктор с параметрами
	{
		A = new Point(x1, y1);
		B = new Point(x2, y2);
		C = new Point(x3, y3);
	}
	
	public void Init(int x1, int y1, int x2, int y2, int x3, int y3) //метод инициализации
	{
		A.Init(x1, y1);
		B.Init(x2, y2);
		C.Init(x3, y3);
	}
	
	public void Read() //метод ввода с консоли
	{
		System.out.println("Первая вершина треугольника: ");
		A.Read();
		System.out.print("Вторая вершина треугольника: ");
		B.Read();
		System.out.print("Третья вершина треугольника: ");
		C.Read();
	}
	
	public void Display() //метод вывода в консоль
	{
		System.out.print("Треугольник с вершинами ");
		A.Display();
		System.out.print(", ");
		B.Display();
		System.out.print(", ");
		C.Display();
		System.out.println();
	}
	
	public double CalcSquare() //метод вычисления площади 
	{
		int x1 = A.GetX(), y1 = A.GetY();
		int x2 = B.GetX(), y2 = B.GetY();
		int x3 = C.GetX(), y3 = C.GetY();
		double S;
		S = 0.5 * abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
		return S;
	}

	public void CalcSquare(Rezult rez) //метод вычисления площади c возвращением результата через вспомогательный класс
	{
		int x1 = A.GetX(), y1 = A.GetY();
		int x2 = B.GetX(), y2 = B.GetY();
		int x3 = C.GetX(), y3 = C.GetY();
		rez.param = 0.5 * abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
	}
	
	public double CalcPerimeter() //метод вычисления периметра
	{
		int x1 = A.GetX(), y1 = A.GetY();
		int x2 = B.GetX(), y2 = B.GetY();
		int x3 = C.GetX(), y3 = C.GetY();
		double AB = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double AC = sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
		double BC = sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		double P = AB + AC + BC;
		return P;
	}

	public void CalcPerimeter(Rezult rez) //метод вычисления периметра c возвращением результата через вспомогательный класс
	{
		int x1 = A.GetX(), y1 = A.GetY();
		int x2 = B.GetX(), y2 = B.GetY();
		int x3 = C.GetX(), y3 = C.GetY();
		double AB = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double AC = sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
		double BC = sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		rez.param = AB + AC + BC;
	}
}