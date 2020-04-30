package figure;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Figure {

    public static void main(String[] args) throws IOException {
        
      //AbstractFigure Circle =  new Circle();
      //AbstractFigure Square =  new Square();
      //AbstractFigure Rectangle = new Rectangle();
      //Rectangle.getInfoFigure();
      List<String> lines = Files.readAllLines(Paths.get("1.txt"), Charset.defaultCharset());
      for (String x:lines){
          System.out.println(x);
      }
      String figure = lines.get(0);
      int parametr = Integer.parseInt(lines.get(1));
      if (figure.equals("CIRCLE") ){
          Circle Circle =  new Circle();
          Circle.setRadius(parametr);
          Circle.getInfoFigure();
      }
      }
      }
    
    

