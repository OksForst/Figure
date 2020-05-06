package figure;

import static java.lang.Math.pow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.io.FileWriter;

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


   public void getInfoFigure() throws IOException {



        //System.out.println ("Название: " + getName());
        //System.out.println ("Площадь: " + String.format(Locale.US ,"%.2f",getSquare()));
        //System.out.println ("Периметр: " + String.format(Locale.US ,"%.2f", getPerimeter()));
        //System.out.println ("Радиус: " + radius);
       // System.out.println ("Диаметр: " + getDiameter());
       System.out.println("Введите название файла");
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

       String fileName = in.readLine() + ".txt";
       try (FileWriter nFile = new FileWriter(in)) {

           nFile.write("Название: " + getName() +
                   "Площадь: " + String.format(Locale.US, "%.2f", getSquare()) +
                   "Периметр: " + String.format(Locale.US, "%.2f", getPerimeter()) + "Радиус: " + radius + "Диаметр: " + getDiameter());

           nFile.close();
       }


   }

}
