package figure;

import java.io.File;
import static java.lang.Math.pow;
import java.io.IOException;
import java.util.Locale;
import java.io.FileWriter;

public class Circle implements Shape {

    private int radius;
   
    public Circle() {
    }

    public String getName() {
        return "Круг";
    }

    public double getSquare() {
        return (Math.PI * pow(radius, 2));
    }

    public int getDiameter() {
        return (2 * radius);
    }

    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    public void getInfoFigure(String fileName) throws IOException {
        if (fileName.length() == 0) {

            System.out.println("Название: " + getName());
            System.out.println("Площадь: "
                    + String.format(Locale.US, "%.2f", getSquare()));
            System.out.println("Периметр: "
                    + String.format(Locale.US, "%.2f", getPerimeter()));
            System.out.println("Радиус: " + radius);
            System.out.println("Диаметр: " + getDiameter());
        } else {
            try ( FileWriter nFile = new FileWriter(fileName)) {
                nFile.write("Название: " + getName() + "\n"
                        + "Площадь: "
                        + String.format(Locale.US, "%.2f", getSquare()) + "\n"
                        + "Периметр: "
                        + String.format(Locale.US, "%.2f", getPerimeter())
                        + "\n"
                        + "Радиус: " + radius + "\n"
                        + "Диаметр: " + getDiameter());
            }
        }
    }
}
