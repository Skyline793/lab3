public class lab3
{
	public static void main(String[] args)
	{
		Parallelogram p = new Parallelogram();
		p.Display();
		System.out.printf("S=%.3f\n", p.CalcSquare());
		Parallelogram c = new Parallelogram(2, 3, 4, -1);
		c.Display();
		System.out.printf("S=%.3f\n", c.CalcSquare());
		p.Init(1, 3, 0, 4);
		p.Display();
		System.out.printf("S=%.3f\n", p.CalcSquare());
		p.Read();
		p.Display();
		System.out.printf("S=%.3f\n", p.CalcSquare());
		
	}
}
