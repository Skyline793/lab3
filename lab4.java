import static java.lang.Math.*;
public class lab4
{
	public static void main(String[] args)
	{
		final int N = 2;
		System.out.println("Выделение памяти и ввод элементов массива точек");
		Point[] pts = new Point[N];
		for(int i=0; i<N; i++) {
			pts[i] = new Point();
			pts[i].Read();
		}
		System.out.println("Вывод элементов массива точек и запись координат в полярной системе");
		for(int i=0; i<N; i++) {
			pts[i].Display();
			System.out.println();
			pts[i].PolarCoords();
		}
		Circle[][] cs = new Circle[N][N];
		System.out.println("Выделение памяти и ввод элементов двумерного массива кругов");
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++)
			{
				cs[i][j] = new Circle();
				cs[i][j].Read();
			}
		System.out.println("Вывод элементов двумерного массива кругов");
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++)
				cs[i][j].Display();
		System.out.println("Запись уравнений элементов двумерного массива кругов");
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++)
				cs[i][j].PrintEquation();
	}
}
