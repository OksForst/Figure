package figure;

import java.io.IOException;


public abstract class AbstractFigure {
    protected String fileName;
    
    public abstract String getName();
    public abstract double getSquare();
    public abstract double getPerimeter();
    public abstract void getInfoFigure() throws IOException;

}
