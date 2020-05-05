package figure;

import static java.lang.Math.pow;
import java.util.Locale;

public class Circle extends AbstractFigure {
    private int radius;
    double PI = 3.14;

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String getName() {
        return "Круг";
    }
    public double getSquare() {
        var s = PI * pow(radius,2);
        return s;
    }


    public int getDiameter() {
        var d = 2 * radius;
        return d;
    }
    public double getPerimeter() {
        var p = 2 * PI * radius;
        return p;
    }


    public void getInfoFigure() {
        System.out.println ("Название: " + getName());
        System.out.println ("Площадь: " + String.format(Locale.US ,"%.2f",getSquare()));
        System.out.println ("Периметр: " + String.format(Locale.US ,"%.2f", getPerimeter()));
        System.out.println ("Радиус: " + radius);
        System.out.println ("Диаметр: " + getDiameter());


    }

}
