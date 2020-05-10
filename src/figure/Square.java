
package figure;

import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Locale;

public class Square extends AbstractFigure  {
    private int sideLenght;

    public void setsideLenght(int sideLenght) {
        this.sideLenght = sideLenght;
    }


    public String getName() {
        return "Квадрат";
    }




    public double getSquare() {
        var s =  pow(sideLenght,2);
        return s;
    }

    public double getPerimeter() {
        var p = 4 *  sideLenght;
        return p;
    }

    public double getDiagonalLenght() {
        var diagonal = sideLenght * sqrt(2);
        return diagonal;
    }

    public void getInfoFigure() throws IOException {
        String fileName = Main.getFileName();
        if (fileName.equals(".txt")){
        System.out.println ("Название: " + getName());
        System.out.println ("Площадь: " + (int)getSquare());
        System.out.println ("Периметр: " + (int) getPerimeter());
        System.out.println ("Длина стороны : " + sideLenght);
        System.out.println ("Длина дигонали : " + String.format(Locale.US ,"%.2f", getDiagonalLenght()));
    }
        else {
       try (FileWriter nFile = new FileWriter(fileName)) {
       nFile.write("Название: " + getName() + "\n" +
                    "Площадь: " + (int)getSquare() + "\n" +
                    "Периметр: " + (int) getPerimeter() + "\n" +
                    "Длина стороны : " + sideLenght + "\n" +
                    "Длина дигонали : " + String.format(Locale.US ,"%.2f", getDiagonalLenght()));
       }

}
    }
}
