import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.*;

public class Parallelogram extends Figure implements Cloneable, Readable//класс параллелограмм
{
	private Vector a, b; //вектора, на которых построен параллелограмм
	
	Parallelogram() //конструктор без параметров
	{
		a = new Vector();
		b = new Vector();
	}
	
	Parallelogram(int x1, int y1, int x2, int y2) //конструктор с параметрами
	{
		a = new Vector(x1, y1);
		b = new Vector(x2, y2);
	}

	Parallelogram(int x1, int y1, int x2, int y2, int colorIndex) //конструктор с параметрами
	{
		if(colorIndex < 0 || colorIndex >= Figure.colors.length) throw new IllegalArgumentException("Индекс цвета вне диапазона!");
		a = new Vector(x1, y1);
		b = new Vector(x2, y2);
		this.colorIndex = colorIndex;
	}

	public void Read() //метод ввода с консоли
	{
		boolean correct = false;
		int index = 0;
		System.out.println("Первый из векторов, на которых построен параллелограмм:");
		a.Read();
		System.out.println("Второй из векторов, на которых построен параллелограмм:");
		b.Read();
		Scanner inp = new Scanner(System.in);
		System.out.println("Центр окружности:");
		while(correct == false) {
			System.out.println("Выберите цвет фигуры:");
			Figure.ShowColors();
			try {
				index = inp.nextInt();
				SetColorIndex(index);
				correct = true;
			}
			catch (InputMismatchException e){
				inp.nextLine();
				System.out.println("Некорректное значение. Повторите ввод:");
				correct = false;
			}
			catch (IllegalArgumentException e){
				inp.nextLine();
				System.out.println(e.getMessage());
				correct = false;
			}
		}
	}
	
	public String toString() //метод вывода в консоль
	{
		return "Параллелограмм, построенный на векторах a и b:\n" + a + "\n" + b + "\nЦвет фигуры: " + Figure.colors[colorIndex];
	}
	
	public double CalcSquare() //метод вычисления площади
	{
		double S, len_a, len_b, prod, cosinus, sinus;
		len_a = a.CalcVectLen();
		len_b = b.CalcVectLen();
		if(len_a * len_b == 0)
			return 0;
		prod = a.CalcScalarProd(b);
		cosinus = prod / (len_a * len_b);
		sinus = sqrt(1 - cosinus * cosinus);
		S = len_a * len_b * sinus;
		return S;	
	}

	public void CalcSquare(Rezult rez) //метод вычисления площади c возвращением результата через вспомогательный класс
	{
		double len_a, len_b, prod, cosinus, sinus;
		len_a = a.CalcVectLen();
		len_b = b.CalcVectLen();
		prod = a.CalcScalarProd(b);
		try {
			if (len_a * len_b == 0) throw new ArithmeticException();
			cosinus = prod / (len_a * len_b);
		}
		catch (ArithmeticException e) {
			cosinus = 0;
		}
		sinus = sqrt(1 - cosinus * cosinus);
		rez.param = len_a * len_b * sinus;
	}

	public double CalcPerimeter() //метод вычисления площади
	{
		double P, len_a, len_b;
		len_a = a.CalcVectLen();
		len_b = b.CalcVectLen();
		P = 2 * (len_a + len_b);
		return P;
	}

	public void CalcPerimeter(Rezult rez) //метод вычисления площади
	{
		double len_a, len_b;
		len_a = a.CalcVectLen();
		len_b = b.CalcVectLen();
		rez.param = 2 * (len_a + len_b);
	}

	public Parallelogram clone() //метод клонирования
	{
		try {
			return (Parallelogram)super.clone();
		}
		catch(CloneNotSupportedException e) {
			return this;
		}
	}
}