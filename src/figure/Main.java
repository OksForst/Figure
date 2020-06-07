package figure;

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileNameIn = args[0];
        String fileNameOut = "";
        
        if (args.length > 1) {
            fileNameOut = args[1];
        }
    
        if (Files.exists(Paths.get(fileNameIn))) {
            Object figureFromFile = createObject(fileNameIn);
            if (figureFromFile == null) {
                System.out.println("Неизвестная фигура");
            } else {
                Shape.getInfoFigure(fileNameOut);
            }
        } else {
            System.out.println("Данный файл не найден!");
        }
        
    }
    //public static Class getFigureFromFile(String fileName) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
    //AbstractFigure figureOfFile = null;
    //Object obj = null;
    //List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
    //String figure = lines.get(0);
    //try {
    //Class figureFromFile = Class.forName(figure);
    //Object obj = figureFromFile.newInstance();
    //}
    //catch(ClassNotFoundException ex) {
    //System.out.println(ex.toString());
    // }
  
        /*
            switch (figure) {
            case "CIRCLE":
             figureOfFile = new Circle(Integer.parseInt(lines.get(1)));
            break;
             case "SQUARE":
             figureOfFile = new Square(Integer.parseInt(lines.get(1)));
             break;
            case "RECTANGLE":
             figureOfFile = new Rectangle(Integer.parseInt(lines.get(1)), Integer.parseInt(lines.get(2)));
             break;
            }
            */
    //return figureFromFile;
    //}
    
    public static Class createObject(String fileName) throws Exception {
        Class myClass = null;
        List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
        String className = lines.get(0);
        String classname1 = className.toLowerCase();
        String classname2 = classname1.substring(0, 1).toUpperCase() + classname1.substring(1);
        try {
            Class clazz = Class.forName("figure." + classname2);
            Class[] params = new Class[]{int.class};
            myClass = (Class) clazz.getConstructor().newInstance(Integer.parseInt(lines.get(1)));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    
        return myClass;
    }
}

