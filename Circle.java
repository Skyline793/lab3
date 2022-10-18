import java.util.Scanner;
import static java.lang.Math.*;

public class Circle //класс круг
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
		center = new Point(x,y);
		this.R = R;
	}
	
	public void Init(int x, int y, double R) //метод инициализации
	{
		center.Init(x, y);
		this.R = R;
	}
	
	public void Read() //метод ввода с консоли
	{
		int x, y;
		double r;
		Scanner inp = new Scanner(System.in);
		System.out.print("Введите координаты центра круга (x,y): ");
		x = inp.nextInt();
		y = inp.nextInt();
		System.out.print("Введите радиус круга R: ");
		r = inp.nextDouble();
		this.Init(x, y, r);
	}
	
	public void Display() //метод вывода в консоль
	{
		System.out.print("Круг с центром в точке О");
		center.Display();
		System.out.printf(" и радиусом R=%.3f\n", R);
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

	public void CalcSquare(Rezult rez) //метод вычисления площади круга с помощью вспомогательного класса
	{
		rez.param = PI * R * R;
	}
}
