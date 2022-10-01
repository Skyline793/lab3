import java.util.Scanner;
import static java.lang.Math.*;

public class Vector extends Point
{
	Vector()
	{
		super(0,0);
	}
	Vector(int x, int y)
	{
		super(x, y);
	}
	@Override
	public void Display()
	{
		System.out.printf("координаты вектора: (%d,%d)\n", X, Y);
	}
	
	public double CalcVectLen()
	{
		double length = sqrt(X * X + Y * Y);
		return length;
	}
	
	public double CalcScalarProd(Vector v2)
	{
		int x1 = this.X;
		int y1 = this.Y;
		int x2 = v2.Y;
		int y2 = v2.Y;
		double prod;
		prod = x1 * x2 + y1 * y2;
		return prod;
	}
}