package figure;

import java.io.FileWriter;
import java.io.IOException;
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

    public void setsideLenght(int sideLenght1, int sideLenght2) {
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


    public void getInfoFigure() throws IOException{
        String fileName = Main.getFileName();
        if (fileName.equals(".txt")){
        System.out.println("Название: " + getName());
        System.out.println("Площадь: " + (int) getSquare());
        System.out.println("Периметр: " + (int) getPerimeter());
        System.out.println("Длина (размер длинной стороны): " + Math.max(sideLenght1, sideLenght2));
        System.out.println("Ширина (размер короткой стороны): " + Math.min(sideLenght1, sideLenght2));
        System.out.println("Длина дигонали : " + String.format(Locale.US, "%.2f", getDiagonalLenght()));
    }
        else {
       try (FileWriter nFile = new FileWriter(fileName)) {
       nFile.write("Название: " + getName() + "\n" +
                   "Площадь: " + (int) getSquare() + "\n" +
                   "Периметр: " + (int) getPerimeter() + "\n" +
                   "Длина (размер длинной стороны): " + Math.max(sideLenght1, sideLenght2) + "\n" +
                   "Ширина (размер короткой стороны): " + Math.min(sideLenght1, sideLenght2) + "\n" +
                   "Длина дигонали : " + String.format(Locale.US, "%.2f", getDiagonalLenght()));

}
        }
    }
}
