import static java.lang.Math.*;
public class lab6
{
	public static void main(String[] args)
	{
		//Тест глубокого копирования
		Circle c1,c2;
		c1 = new Circle(1,1, 4.5, 2);
		c2 = new Circle();
		System.out.println(c1);
		System.out.println(c2);
		c2 = c1.clone();
		System.out.println(c1);
		System.out.println(c2);
		c1.Read();
		System.out.println(c1);
		System.out.println(c2);
		//тест мелкого копирования
		Parallelogram pr1, pr2;
		pr1 = new Parallelogram(2,1, 3, 4, 1);
		pr2 = new Parallelogram(5, 3, -3, 5, 4);
		System.out.println(pr1);
		System.out.println(pr2);
		pr2 = pr1.clone();
		System.out.println(pr1);
		System.out.println(pr2);
		pr1.Read();
		System.out.println(pr1);
		System.out.println(pr2);

		System.out.println("тест шаблона класса");
		Comparison<Circle> comp1 = new Comparison<Circle>();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("Большая площадь: " + comp1.CompareSquare(c1, c2));
		Comparison<Parallelogram> comp2 = new Comparison<Parallelogram>();
		pr2 = new Parallelogram(3, 5, 0, -4, 1);
		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println("Больший периметр: " + comp2.CompareSquare(pr1, pr2));



	}
}
