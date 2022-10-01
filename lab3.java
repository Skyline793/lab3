public class lab3
{
	public static void main(String[] args)
	{
		System.out.println("Тест класса точка");
		Point[] p = new Point[3];
		for(int i = 0; i < 3; i++)
		{
			p[i] =new Point(i-1, i+1);
			System.out.print("Точка: ");
			p[i].Display();
			System.out.println();
			p[i].PolarCoords();
		}
		
		System.out.println("\nТест класса вектор");
		Vector v1 = new Vector();
		Vector v2 = new Vector(2, 4);
		v1.Display();
		v2.Display();
		v1.Read();
		double l1 = v1.CalcVectLen();
		double l2 = v2.CalcVectLen();
		System.out.printf("|v1|=%.2f\n|v2|=%.2f\n", l1, l2);
		System.out.println("Скалярное произведение (v1,v2)=" + v1.CalcScalarProd(v2));
		
		System.out.println("\nТест класса круг");
		Circle c = new Circle();
		c.Display();
		c.Init(1, -1, 3.5);
		c.Display();
		c.Read();
		c.Display();
		c.PrintEquation();
		System.out.printf("Площадь круга S=%.2f", c.CalcSquare());
		
		System.out.println("\nТест класса треугольник");
		Triangle t = new Triangle(3, 1, 0, 5, -4, 3);
		t.Display();
		System.out.printf("Площадь треугольника S=%.3f, периметр треугольника P=%.3f\n", t.CalcSquare(), t.CalcPerimeter());
		t.Init(0, 5, 0, 0, 4, 1);
		t.Display();
		System.out.printf("Площадь треугольника S=%.3f, периметр треугольника P=%.3f\n", t.CalcSquare(), t.CalcPerimeter());
		t.Read();
		t.Display();
		System.out.printf("Площадь треугольника S=%.3f, периметр треугольника P=%.3f\n", t.CalcSquare(), t.CalcPerimeter());
		
		System.out.println("\nТест класса параллелограмм");
		Parallelogram pr1 = new Parallelogram();
		pr1.Display();
		System.out.printf("S=%.3f\n", pr1.CalcSquare());
		Parallelogram pr2 = new Parallelogram(2, 3, 4, -1);
		pr2.Display();
		System.out.printf("Площадь параллелограмма S=%.3f\n", c.CalcSquare());
		pr1.Init(1, 3, 0, 4);
		pr1.Display();
		System.out.printf("Площадь параллелограмма S=%.3f\n", pr1.CalcSquare());
		pr1.Read();
		pr1.Display();
		System.out.printf("Площадь параллелограмма S=%.3f\n", pr1.CalcSquare());	
	}
}
