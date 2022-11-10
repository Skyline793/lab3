import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.*;

public class Triangle extends Figure implements Readable//класс треугольник
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

	Triangle(int x1, int y1, int x2, int y2, int x3, int y3, int colorIndex) //конструктор с параметрами
	{
		if(colorIndex < 0 || colorIndex >= Figure.colors.length) throw new IllegalArgumentException("Индекс цвета вне диапазона!");
		A = new Point(x1, y1);
		B = new Point(x2, y2);
		C = new Point(x3, y3);
		this.colorIndex = colorIndex;
	}

	public void Read() //метод ввода с консоли
	{
		boolean correct = false;
		int index = 0;
		System.out.println("Первая вершина треугольника: ");
		A.Read();
		System.out.println("Вторая вершина треугольника: ");
		B.Read();
		System.out.println("Третья вершина треугольника: ");
		C.Read();
		Scanner inp = new Scanner(System.in);
		System.out.println("Центр окружности:");
		while(correct == false) {
			System.out.println("Выберите цвет фигуры:");
			Figure.ShowColors();
			try {
				index = inp.nextInt();
				SetColorIndex(index);
				correct = true;
			}
			catch (InputMismatchException e){
				inp.nextLine();
				System.out.println("Некорректное значение. Повторите ввод:");
				correct = false;
			}
			catch (IllegalArgumentException e){
				inp.nextLine();
				System.out.println(e.getMessage());
				correct = false;
			}
		}
	}
	
	public String toString() //метод вывода в консоль
	{
		return "Треугольник с вершинами " + A + ", " + B + ", " + C + ". Цвет фигуры: " + Figure.colors[colorIndex];
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