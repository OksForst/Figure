package figure;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Figure {

    public static void main(String[] args) throws IOException {
        String fileName = getFileName()+ ".txt";
        List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
        for (String x:lines){
            String figure = lines.get(0);
            int parametr = Integer.parseInt(lines.get(1));

            if (figure.equals("CIRCLE") ){
                Circle Circle =  new Circle();
                Circle.setRadius(parametr);
                Circle.getInfoFigure();
            }

            if (figure.equals("SQUARE") ){
                Square Square =  new Square();
                Square.setsideLenght(parametr);
                Square.getInfoFigure();
            }

            if (figure.equals("RECTANGLE") ){
                int parametr1 = Integer.parseInt(lines.get(2));
                Rectangle Rectangle =  new Rectangle();
                Rectangle.setsideLenght1(parametr, parametr1);
                Rectangle.getInfoFigure();
            }

        }
    }
    public static String getFileName() throws IOException{
        System.out.println("Введите название файла");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fileName = in.readLine();
        return fileName;
    }
}