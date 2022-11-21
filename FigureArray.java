import java.util.*;

public class FigureArray //класс массива фигур
{
    private ArrayList<Figure> arr; //список фигур
    public FigureArray() //констуктор
    {
        arr = new ArrayList<Figure>();
    }
    public void Add(Figure f) //метод добавления фигуры в массив
    {
        arr.add(f);
    }
    public void Read() //метод добавления фигуры в список с вводом через консоль
    {
       Scanner inp = new Scanner(System.in);
       int type = 0;
       do {
           System.out.println("Выберите тип фигуры, которую хотите добавить:\n1. Круг\n2. Треугольник\n3. Параллелограмм");
           if(inp.hasNext())
               type = inp.nextInt();
       } while(type<=0 || type>3);
       switch (type)
       {
           case 1:
               Circle c = new Circle();
               c.Read();
               arr.add(c);
               break;
           case 2:
               Triangle tr = new Triangle();
               tr.Read();
               arr.add(tr);
               break;
           case 3:
               Parallelogram pr = new Parallelogram();
               pr.Read();
               arr.add(pr);
               break;
       }
    }

    public void Insert(Figure f, int ind) //метод вставки фигуры в список по индексу
    {
        arr.add(ind, f);
    }

    public void Delete(int ind) //метод удаления фигуры из списка
    {
        arr.remove(ind);
    }
    public void Display() //метод вывода списка фигур
    {
        Iterator<Figure> ir = arr.iterator();
        while(ir.hasNext())
        {
            System.out.println(ir.next());
        }
    }

    public void SortByMaxSquare() //метод сортировки по возрастанию площади
    {
        Collections.sort(arr, new Comparator<Figure>() {
            @Override
            public int compare(Figure o1, Figure o2) {
                if(o1.CalcSquare() < o2.CalcSquare())
                    return -1;
                else return 1;
            }
        });
    }

    public void SortByMinSquare() //метод сортировки по убыванию площади
    {
        Collections.sort(arr, new Comparator<Figure>() {
            @Override
            public int compare(Figure o1, Figure o2) {
                if(o1.CalcSquare() > o2.CalcSquare())
                    return -1;
                else return 1;
            }
        });
    }

    public void SortByMaxPerimeter() //метод сортировки по возрастанию периметра
    {
        Collections.sort(arr, new Comparator<Figure>() {
            @Override
            public int compare(Figure o1, Figure o2) {
                if(o1.CalcPerimeter() < o2.CalcPerimeter())
                    return -1;
                else return 1;
            }
        });
    }

    public void SortByMinPerimeter() //метод сортировки по убыванию периметра
    {
        Collections.sort(arr, new Comparator<Figure>() {
            @Override
            public int compare(Figure o1, Figure o2) {
                if(o1.CalcPerimeter() > o2.CalcPerimeter())
                    return -1;
                else return 1;
            }
        });
    }
}

