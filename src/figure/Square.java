
package figure;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Locale;

public class Square extends AbstractFigure  {
    int sideLenght = 3;
   
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
     
    public void getInfoFigure() {
        System.out.println ("Название: " + getName());
        System.out.println ("Площадь: " + (int)getSquare());
        System.out.println ("Периметр: " + (int) getPerimeter());
        System.out.println ("Длина стороны : " + sideLenght);
        System.out.println ("Длина дигонали : " + String.format(Locale.US ,"%.2f", getDiagonalLenght()));
    }
    
}
