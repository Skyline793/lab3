import static java.lang.Math.*;
public class lab4
{
	public static void main(String[] args)
	{
		//тест статических методов
		System.out.println("тест статических методов");
		double grad = 90, rad = 2*PI/3;
		System.out.printf("1) Градусы: %.2f радианы: %.2f\n2) Радианы: %.2f градусы: %.2f\n", grad, Point.PerevodToRadian(grad), rad, Point.PerevodToGradus(rad));

		//Тест возврата значения с помощью вспомогательного класса
		System.out.println("\nТест возврата значения с помощью вспомогательного класса");
		Vector v = new Vector();
		Triangle tr = new Triangle();
		Rezult rez = new Rezult();
		v.Read();
		v.Display();
		v.CalcVectLen(rez);
		System.out.printf("Длина вектора |v|=%.2f\n", rez.param);
		tr.Read();
		tr.Display();
		tr.CalcSquare(rez);
		System.out.printf("Площадь треугольника S=%.2f\n", rez.param);
		tr.CalcPerimeter(rez);
		System.out.printf("Периметр треугольника P=%.2f\n", rez.param);

		//тест работы со строками
		System.out.println("\nтест работы со строками\nТочки:");
		Point p1 = new Point();
		p1.Display();
		System.out.println();
		Point p2 = new Point(1, 2);
		p2.Display();
		System.out.println();
		Point p3 = new Point(3, 4, "C");
		p3.Display();
		System.out.println();
		p1.Read();
		p1.Display();
		System.out.println();
		p2.Read();
		p2.Display();
		System.out.println();

		//Тест работы с массивом объектов
		System.out.println("\nТест работы с массивом объектов");
		final int N = 5;
		Circle[] circles = new Circle[N];
		for(int i = 0; i < N; i++){
			circles[i] = new Circle();
		}
		for (Circle c: circles) {
			c.Read();
		}
		circles[0].Init(2, 3, 2.4);
		for(int i = 0; i < N; i++) {
			circles[i].Display();
			circles[i].PrintEquation();
		}

		//тест статического поля счетчика
		System.out.printf("\nОбщее количество точек: %d", Point.GetCount());
	}
}
