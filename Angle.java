import static java.lang.Math.PI;

public class Angle {
    public static double PerevodToGradus(double rad) //статический метод перевода радиан в градусы
    {
        double grad = rad * 180 / PI;
        return grad;
    }

    public static double PerevodToRadian(double grad) //статический метод перевода градусов в радианы
    {
        double rad = grad * PI / 180;
        return rad;
    }
}
