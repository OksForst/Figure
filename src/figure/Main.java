package figure;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Field;


public class Main {

    public static void main(String[] args) throws Exception {
        String fileNameIn = args[0];
        String fileNameOut = "";

        if (args.length > 1) {
            fileNameOut = args[1];
        }

        if (Files.exists(Paths.get(fileNameIn))) {
            String className = getFigureFromFile(fileNameIn);
            if ((className.equals("Circle"))||(className.equals("Square"))||(className.equals("Rectangle"))){
                int param [] = getParametersFromFile(fileNameIn);
                Shape figureFromFile = getClassInstance(className,param);
                figureFromFile.getInfoFigure(fileNameOut);
            } else {
                System.out.println("Неизвестная фигура");
            } 
        }
            else {
            System.out.println("Данный файл не найден");
        }
    }
 
    public static String getFigureFromFile(String fileName) throws IOException, Exception {
        List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
        String className = lines.get(0).toLowerCase();
        className = className.substring(0, 1).toUpperCase() + className.substring(1);
        return className;    
    } 
    
    public static int[] getParametersFromFile(String fileName) throws IOException, Exception {
        List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());       
        int[] params = new int[lines.size() - 1];
        for (int i = 0; i < lines.size() - 1; i++) {
            params[i] = Integer.parseInt(lines.get(i + 1));
        }
        return params;
    }
    
    private static Shape getClassInstance(String className, int... parameters) throws Exception, ClassNotFoundException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        Shape shape = null;
        try {
            Class clazz = Class.forName("figure." + className);
            shape = (Shape) clazz.getDeclaredConstructor().newInstance();
            Field[] privateField = clazz.getDeclaredFields();
            for (int paramId = 0; paramId < privateField.length; paramId++){
                Field field = privateField[paramId];
                field.setAccessible(true);
                field.set(shape, parameters[paramId]);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException e) {
            System.exit(1);
        }
        return shape;
    }
}

