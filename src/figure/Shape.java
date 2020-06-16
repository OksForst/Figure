package figure;

import java.io.IOException;


public interface Shape {
    public abstract String getName();
    public abstract double getSquare();
    public abstract double getPerimeter();
    
    public abstract void getInfoFigure(String fileNameOut) throws IOException;
}
