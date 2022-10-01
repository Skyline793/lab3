public class lab3
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle(3, 1, 0, 5, -4, 3);
		t.Display();
		System.out.printf("S=%.3f, P=%.3f\n", t.CalcSquare(), t.CalcPerimeter());
		t.Init(1, 2, -3, -4, 5, -6);
		t.Display();
		System.out.printf("S=%.3f, P=%.3f\n", t.CalcSquare(), t.CalcPerimeter());
		t.Read();
		t.Display();
		System.out.printf("S=%.3f, P=%.3f\n", t.CalcSquare(), t.CalcPerimeter());
	}
}
