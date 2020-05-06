package figure;

import java.io.IOException;

public abstract  class AbstractFigure {
   public abstract String getName();
   public abstract double getSquare();
   public abstract double getPerimeter();
   public abstract void getInfoFigure() throws IOException;
}
