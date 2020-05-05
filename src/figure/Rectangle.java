package figure;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Locale;

/**
 *
 * @author 032KolesnikovaOS
 */
public class Rectangle extends AbstractFigure {
    private int sideLenght1;
    private int sideLenght2;

    public void setsideLenght1(int sideLenght1, int sideLenght2) {
        this.sideLenght1 = sideLenght1;
        this.sideLenght2 = sideLenght2;
    }


    public String getName() {
        return "Прямоугольник";
    }

    public double getSquare() {
        var s = sideLenght1 * sideLenght2;
        return s;
    }


    public double getPerimeter() {
        var p = 2 * (sideLenght1 + sideLenght2);
        return p;
    }

    public double getDiagonalLenght() {
        var diagonal = sqrt(pow(sideLenght1, 2) + pow(sideLenght2, 2));
        return diagonal;
    }


    public void getInfoFigure() {
        System.out.println("Название: " + getName());
        System.out.println("Площадь: " + (int) getSquare());
        System.out.println("Периметр: " + (int) getPerimeter());
        if (sideLenght1 != sideLenght2) {
            System.out.println("Длина (размер длинной стороны): " + Math.max(sideLenght1, sideLenght2));
            System.out.println("Ширина (размер короткой стороны): " + Math.min(sideLenght1, sideLenght2));
        } else {
            System.out.println("Фигура является квадратом. Длина стороны : " + sideLenght1);
        }

        System.out.println("Длина дигонали : " + String.format(Locale.US, "%.2f", getDiagonalLenght()));
    }

}
