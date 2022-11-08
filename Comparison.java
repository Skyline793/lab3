public class Comparison<Type extends Figure> { //шаблон класса для сравнения параметров объектов наследников класса фигуры
    public Type CompareSquare(Type a, Type b) //метод сравнения площади
    {
        if (a.CalcSquare() > b.CalcSquare())
            return a;
        else
            return b;
    }
    public Type ComparePerimeter(Type a, Type b) //метод сравнения периметра
    {
        if (a.CalcPerimeter() > b.CalcPerimeter())
            return a;
        else
            return b;
    }
}
