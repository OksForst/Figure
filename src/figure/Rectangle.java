package figure;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Locale;

/**
 *
 * @author 032KolesnikovaOS
 */
public class Rectangle extends AbstractFigure {
  int sideLenght1 = 3;
  int sideLenght2 = 3;

    public String getName() {
         return "Прямоугольник";
    }

    public double getSquare() {
        var s =  sideLenght1 * sideLenght2 ;
        return s;
    }


    public double getPerimeter() {
       var p = 2 * (sideLenght1 + sideLenght2);
      return p; 
    }

public double getDiagonalLenght() {
       var diagonal = sqrt(pow(sideLenght1,2)+pow(sideLenght2,2));
      return diagonal;      
    }


    public void getInfoFigure() {
        System.out.println ("Название: " + getName());
        System.out.println ("Площадь: " + (int)getSquare());
        System.out.println ("Периметр: " + (int) getPerimeter());
        if (sideLenght1!=sideLenght1){
        System.out.println ("Длина (размер длинной стороны): " + Math.max(sideLenght1,sideLenght2));
        System.out.println ("Ширина (размер короткой стороны): " +Math.min(sideLenght1,sideLenght2)); }
        else {
        System.out.println ("Фигура является квадратом. Длина стороны : " + sideLenght1);   
        }
        
        System.out.println ("Длина дигонали : " + String.format(Locale.US ,"%.2f", getDiagonalLenght()));
    }
    
}
