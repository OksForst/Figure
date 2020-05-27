package figure;

import static java.lang.Math.pow;
import java.io.IOException;
import java.util.Locale;
import java.io.FileWriter;


public class Circle extends AbstractFigure {
    private int radius;
    
    public Circle(int ... parameters) {
        radius = parameters[0];
    }
    
    public String getName() {
        return "Круг";
    }
    
    public double getSquare() {
        double s = Math.PI * pow(radius, 2);
        return s;
    }
    
    public int getDiameter() {
        int d = 2 * radius;
        return d;
    }
    
    public double getPerimeter() {
        double p = 2 * Math.PI * radius;
        return p;
    }
    
    public void getInfoFigure(String fileNameOut) throws IOException {
        //fileName = Main.getFileName();
        String fileName = AbstractFigure.getFileName();
        if (fileName.equals(".txt")) {
            System.out.println("Название: " + getName());
            System.out.println("Площадь: "
                    + String.format(Locale.US, "%.2f", getSquare()));
            System.out.println("Периметр: "
                    + String.format(Locale.US, "%.2f", getPerimeter()));
            System.out.println("Радиус: " + radius);
            System.out.println("Диаметр: " + getDiameter());
        } else {
            try (FileWriter nFile = new FileWriter(fileName)) {
                nFile.write("Название: " + getName() + "\n" +
                        "Площадь: "
                        + String.format(Locale.US, "%.2f", getSquare()) + "\n"
                        + "Периметр: "
                        + String.format(Locale.US, "%.2f", getPerimeter())
                        + "\n"
                        + "Радиус: " + radius + "\n" +
                        "Диаметр: " + getDiameter());
            }
        }
    }
}