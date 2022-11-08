import org.w3c.dom.ranges.RangeException;

public abstract class Figure {
    protected static String[] colors = {"не задан", "красный", "синий", "зеленый", "желтый"};
    protected int colorIndex;
    Figure()
    {
        colorIndex = 0;
    }

    public void SetColorIndex(int colorIndex)
    {
        if(colorIndex < 0 || colorIndex >= Figure.colors.length) throw new IllegalArgumentException("Индекс цвета вне диапазона");
        this.colorIndex = colorIndex;
    }

    public abstract double CalcSquare();
    public abstract double CalcPerimeter();

}
