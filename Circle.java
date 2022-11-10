import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.*;

public class Circle extends Figure implements Cloneable, Readable//класс круг
{
	private Point center; //центр круга
	private double R; //радиус круга
	
	Circle() //конструктор без параметров
	{
		center = new Point();
		R = 0;
	}
	
	Circle(int x, int y, double R) //конструктор с параметрами
	{
		if(R < 0) throw new IllegalArgumentException("Радиус должен быть положительным!");
		center = new Point(x,y);
		this.R = R;
	}

	Circle(int x, int y, double R, int colorIndex) //конструктор с параметрами
	{
		if(R < 0) throw new IllegalArgumentException("Радиус должен быть положительным!");
		if(colorIndex < 0 || colorIndex >= Figure.colors.length) throw new IllegalArgumentException("Индекс цвета вне диапазона!");
		center = new Point(x,y);
		this.R = R;
		this.colorIndex = colorIndex;
	}

	public void SetR(double R) //метод установки радиуса
	{
		if(R <= 0) throw new IllegalArgumentException("Радиус должен быть положительным!");
		this.R = R;
	}

	public void Read() //метод ввода с консоли
	{
		boolean correct = false;
		double r = 0;
		int index = 0;
		Scanner inp = new Scanner(System.in);
		System.out.println("Центр окружности:");
		center.Read();
		while(correct == false) {
			System.out.print("Введите радиус круга R: ");
			try {
				r = inp.nextDouble();
				SetR(r);
				correct = true;
			}
			catch (InputMismatchException e){
				inp.nextLine();
				System.out.println("Некорректное значение. Повторите ввод:");
				correct = false;
			}
			catch (IllegalArgumentException e){
				inp.nextLine();
				System.out.println(e.getMessage() + " Повторите ввод:");
				correct = false;
			}
		}
		correct = false;
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
		return String.format("Круг с центром в точке " + center + " и радиусом R=%.2f. Цвет фигуры: %s", R, Figure.colors[colorIndex]);
	}
	
	public void PrintEquation() //метод вывода уравнения окружности
	{
		int x = center.GetX();
		int y = center.GetY();
		double r = R;
		System.out.println("Уравнение окружности:");
		if (x > 0) 
		{
			if (y > 0)
				System.out.printf("(x-%d)^2+(y-%d)^2=%.3f\n", x, y, r * r);
			if (y < 0)
				System.out.printf("(x-%d)^2+(y+%d)^2=%.3f\n", x, -y, r * r);
			if (y == 0)
				System.out.printf("(x-%d)^2+y^2=%.3f\n", x, r * r);
		}
		if (x < 0)
		{
			if (y > 0)
				System.out.printf("(x+%d)^2+(y-%d)^2=%.3f\n", -x, y, r * r);
			if (y < 0)
				System.out.printf("(x+%d)^2+(y+%d)^2=%.3f\n", -x, -y, r * r);
			if (y == 0)
				System.out.printf("(x+%d)^2+y^2=%.3f\n", -x, r * r);
		}
		if (x == 0)
		{
			if (y > 0)
				System.out.printf("x^2+(y-%d)^2=%.3f\n", y, r * r);
			if (y < 0)
				System.out.printf("x^2+(y+%d)^2=%.3f\n", -y, r * r);
			if (y == 0)
				System.out.printf("x^2+y^2=%.3f\n", r * r);
		}
	}	
	
	public double CalcSquare() //метод вычисления площади круга
	{
		double S;
		S = PI * R * R;
		return S;
	}

	public void CalcSquare(Rezult rez) //метод вычисления площади c возвращением результата через вспомогательный класс
	{
		rez.param = PI * R * R;
	}

	public double CalcPerimeter() //метод вычисления периметра круга
	{
		double P;
		P = 2 * PI * R;
		return P;
	}

	public void CalcPerimeter(Rezult rez) //метод вычисления площади c возвращением результата через вспомогательный класс
	{
		rez.param = 2 * PI * R;
	}

	public Circle clone() //метод клонирования
	{
		try
		{
			Circle Clone = (Circle)super.clone();
			Clone.center = (Point)center.clone();
			return Clone;
		}
		catch(CloneNotSupportedException e) {
		}
		return this;
	}
}

