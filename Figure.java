public abstract class Figure {
    protected static String[] colors = {"не задан", "красный", "синий", "зеленый", "желтый"};
    protected int colorIndex;
    Figure()
    {
        colorIndex = 0;
    }

    public abstract double CalcSquare();
    public abstract double CalcPerimeter();

}
