import org.w3c.dom.ranges.RangeException;

import java.util.Comparator;

public abstract class Figure { //абстрактный класс фигура
    protected static String[] colors = {"не задан", "красный", "синий", "зеленый", "желтый"}; //массив цветов фигуры
    protected int colorIndex; //выбранный индекс цвета
    Figure()
    {
        colorIndex = 0;
    } //конструктор

    public void SetColorIndex(int colorIndex) //метод установки индекса цвета
    {
        if(colorIndex < 0 || colorIndex >= Figure.colors.length) throw new IllegalArgumentException("Индекс цвета вне диапазона");
        this.colorIndex = colorIndex;
    }

    public static void ShowColors() //метод вывода списка цветов
    {
        for(int i = 0; i< colors.length; i++)
            System.out.println(i + " - " + colors[i]);
    }
    public abstract double CalcSquare(); //абстрактный метод вычислеия площади
    public abstract double CalcPerimeter(); //абстрактный метод вычисления периметра

}
