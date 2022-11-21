import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.*;
public class lab6
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(1,2, 3), c2 = new Circle(0,0, 2), c3 = new Circle(1,1, 4);

		FigureArray r = new FigureArray();
		r.Add(new Circle(1,2,5));
		r.Add(c2);
		r.Add(c3);
		r.Insert(c3, 0);
		r.Display();
		System.out.println();
		r.SortByMaxSquare();
		r.Display();
		System.out.println();
		r.SortByMinSquare();
		r.Display();
		System.out.println();
		r.SortByMaxPerimeter();
		r.Display();
		System.out.println();
		r.SortByMinPerimeter();
		r.Display();

	}
}
