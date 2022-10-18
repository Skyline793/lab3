public class lab4
{
	public static void main(String[] args)
	{
		Vector a = new Vector(2,3);
		Rezult b = new Rezult();
		System.out.println(b.param);
		a.CalcVectLen(b);
		System.out.println(b.param);
		Triangle tr = new Triangle(1,2, -3, -4, 5, 7);
		tr.CalcSquare(b);
		System.out.println(b.param);
		tr.CalcPerimeter(b);
		System.out.println(b.param);
	}
}
