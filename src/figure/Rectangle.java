package figure;

import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Locale;


public class Rectangle implements Shape {
    private int sideLenght1;
    private int sideLenght2;

    public Rectangle(int ... parameters) {
        sideLenght1 = parameters[0];
        sideLenght2 = parameters[1];
    }
    
    public String getName() {
        return "Прямоугольник";
    }

    public double getSquare() {
        double s = sideLenght1 * sideLenght2;
        return s;
    }
    
    public double getPerimeter() {
        double p = 2 * (sideLenght1 + sideLenght2);
        return p;
    }

    public double getDiagonalLenght() {
        double diagonal = sqrt(pow(sideLenght1, 2) + pow(sideLenght2, 2));
        return diagonal;
    }
    
    public void getInfoFigure(String fileName) throws IOException{
        if (fileName.length()==0){
            System.out.println("Название: " + getName());
            System.out.println("Площадь: " + (int) getSquare());
            System.out.println("Периметр: " + (int) getPerimeter());
            System.out.println("Длина (размер длинной стороны): "
                    + Math.max(sideLenght1, sideLenght2));
            System.out.println("Ширина (размер короткой стороны): "
                    + Math.min(sideLenght1, sideLenght2));
            System.out.println("Длина дигонали : "
                    + String.format(Locale.US, "%.2f", getDiagonalLenght()));
        } else {
            try (FileWriter nFile = new FileWriter(fileName)) {
                nFile.write("Название: " + getName() + "\n" + "Площадь: "
                        + (int) getSquare() + "\n" + "Периметр: "
                        + (int) getPerimeter() + "\n"
                        + "Длина (размер длинной стороны): "
                        + Math.max(sideLenght1, sideLenght2) + "\n"
                        + "Ширина (размер короткой стороны): "
                        + Math.min(sideLenght1, sideLenght2) + "\n"
                        + "Длина дигонали : "
                        + String.format(Locale.US, "%.2f", getDiagonalLenght()));
            }
        }
    }
}

