import java.util.Scanner;
import static java.lang.Math.*;

public class Circle
{
	private Point center;
	private double R;
	
	Circle()
	{
		center = new Point();
		R = 0;
	}
	
	Circle(int x, int y, double r)
	{
		center = new Point(x,y);
		R = r;
	}
	public void Init(int x, int y, double r)
	{
		center.Init(x, y);
		R = r;
	}
	
	public void Read()
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
	
	public void Display()
	{
		System.out.print("Круг с центром в точке О");
		center.Display();
		System.out.printf(" и радиусом R=%.3f\n", R);
	}
	
	public void PrintEquation()
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
	
	public double CalcSquare()
	{
		double S;
		S = PI * R * R;
		return S;
	}
}
