import static java.lang.Math.*;
public class lab4
{
	public static void main(String[] args)
	{
		{
			Point a = new Point();
			Point p = new Point(1, -1);
			Vector v = new Vector(3, 1);
		}
		System.out.println("Общее количество точек " + Point.Count());
		Triangle tr = new Triangle();
		Circle c = new Circle();
		System.out.println("Общее количество точек " + Point.Count());
		System.out.printf("%f\n", Point.PerevodToGradus(3*PI/4));


	}
}
