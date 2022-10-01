public class lab3
{
	public static void main(String[] args)
	{
		Circle c = new Circle(1, 1, 1.2);
		c.Display();
		c.PrintEquation();
		System.out.printf("S=%.3f", c.CalcSquare());

		c.Read();
		c.Display();
		c.PrintEquation();
		System.out.printf("S=%.3f", c.CalcSquare());
	}
}
