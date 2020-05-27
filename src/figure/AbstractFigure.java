package figure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public abstract class AbstractFigure {
    protected String fileName;
    
    public abstract String getName();
    public abstract double getSquare();
    public abstract double getPerimeter();
    public abstract void getInfoFigure(String fileNameOut) throws IOException;
    
    public static String getFileName() throws IOException {
        System.out.println("Введите название файла:");
        Reader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        String fileName = in.readLine() + ".txt";
        return fileName;
    }
}
