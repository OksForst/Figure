package figure;

import java.io.IOException;

public abstract  class AbstractFigure {
   protected String fileName;

   public void setFileName(String fileName) {
      this.fileName = fileName;
   }

   public abstract String getName();
   public abstract double getSquare();
   public abstract double getPerimeter();
   public abstract void getInfoFigure() throws IOException;
}
