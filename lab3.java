public class lab3
{
	public static void main(String[] args)
	{
		Vector v1 = new Vector();
		v1.Init(3,5);
		v1.Display();
		Vector v2 = new Vector(3, 4);
		v2.Display();
		v1.Read();
		v1.Display();
		v2.Read();
		v2.Display();
		double l1 = v1.CalcVectLen();
		double l2 = v2.CalcVectLen();
		System.out.printf("|v1|=%.2f\n|v2|=%.2f\n", l1, l2);
		System.out.println("Скалярное произведение (v1,v2)=" + v1.CalcScalarProd(v2));
	}
}
