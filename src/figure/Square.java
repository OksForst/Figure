package figure;

import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Locale;

public class Square implements Shape {

    private int sideLenght;

    public Square(int... parameters) {
        sideLenght = parameters[0];
    }

    public Square() {
    }

    public String getName() {
        return "Квадрат";
    }

    public double getSquare() {
        double s = pow(sideLenght, 2);
        return s;
    }

    public double getPerimeter() {
        double p = 4 * sideLenght;
        return p;
    }

    public double getDiagonalLenght() {
        double diagonal = sideLenght * sqrt(2);
        return diagonal;
    }

    public void getInfoFigure(String fileName) throws IOException {
        if (fileName.length() == 0) {
            System.out.println("Название: " + getName());
            System.out.println("Площадь: " + (int) getSquare());
            System.out.println("Периметр: " + (int) getPerimeter());
            System.out.println("Длина стороны : " + sideLenght);
            System.out.println("Длина дигонали : "
                    + String.format(Locale.US, "%.2f", getDiagonalLenght()));
        } else {
            try ( FileWriter nFile = new FileWriter(fileName)) {
                nFile.write("Название: " + getName() + "\n"
                        + "Площадь: " + (int) getSquare() + "\n"
                        + "Периметр: " + (int) getPerimeter() + "\n"
                        + "Длина стороны : " + sideLenght + "\n"
                        + "Длина дигонали : " + String.format(Locale.US, "%.2f", getDiagonalLenght()));
            }
        }
    }
}
