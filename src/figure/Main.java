package figure;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.lang.Class;


public class Main {
    //private static ErrorManager LOG;
    
    public static void main(String[] args) throws Exception {
        String fileNameIn = args[0];
        String fileNameOut = "";
        
        if (args.length > 1) {
            fileNameOut = args[1];
        }
    
        if (Files.exists(Paths.get(fileNameIn))) {
            String nameClass = getFigureFromFile(fileNameIn);
            Class figureFromFile = getClassInstance(nameClass);
            if (figureFromFile == null) {
                System.out.println("Неизвестная фигура");
            } else {
                Shape.getInfoFigure(fileNameOut);
            }
        } else System.out.println("Данный файл не найден!");
        
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
    
    public static String getFigureFromFile(String fileName) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
        String className = lines.get(0);
        String classname1 = className.toLowerCase();
        String classname2 = classname1.substring(0, 1).toUpperCase() + classname1.substring(1);
        
        return classname2;
    }
    
    
    public static Class getClassInstance(String className) throws Exception {
        Class myClass = null;
        try {
            Class clazz = Class.forName(className);
            myClass = (Class) clazz.getDeclaredConstructor().newInstance();
    
        } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException e) {
                //LOG.error(e);
                System.exit(1);
            }
       
        return myClass;
        }
    }


