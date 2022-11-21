import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.*;
public class lab6
{
	public static void main(String[] args)
	{
		FigureArray arr = new FigureArray();
		arr.Add(new Circle(0,0,1,0));
		arr.Add(new Circle(2,1,2.3,3));
		arr.Add(new Triangle(-4,3,0,-2,3,5,1));
		arr.Add(new Parallelogram(5,4,1,-6,1));
		arr.Add(new Parallelogram(-3,5,1,-4,2));
		//ввод фигуры
		arr.Read();
		//вывод фигуры
		arr.Display();
		//сортировка по возрастанию площади
		System.out.println("сортировка по возрастанию площади");
		arr.SortByMaxSquare();
		arr.Display();
		System.out.println();
		//сортировка по убыванию площади
		System.out.println("сортировка по убыванию площади");
		arr.SortByMinSquare();
		arr.Display();
		System.out.println();
		//сортировка по возрастанию периметра
		System.out.println("сортировка по возрастанию периметра");
		arr.SortByMaxPerimeter();
		arr.Display();
		System.out.println();
		//сортировка по убыванию периметра
		System.out.println("сортировка по убыванию периметра");
		arr.SortByMinPerimeter();
		arr.Display();

	}
}
