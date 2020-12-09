package Injector;

import MyAnnotation.AutoInjectable;
import Settings.Settings;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Injector <T> {

    /**
     * Метод инициализирует все поля c аннотацией @AutoInjectable, объектами из app.properties
     * @param obj - является объектом передаваемого класса
     * @return - возвращает инициализированный объект передаваемого класса
     */
    public T inject(T obj) {
        Class cl = obj.getClass();

        for(Field fl : cl.getDeclaredFields()) {
            Annotation a = fl.getAnnotation(AutoInjectable.class);
            if(a != null) {
                fl.setAccessible(true);
                try {
                    String classObj = getNameClass(fl.getType().getName());
                    fl.set(obj, Class.forName(classObj).newInstance());
                } catch (IllegalAccessException | ClassNotFoundException | InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }
        return obj;
    }

    /**
     * Метод возвращает имя типа.
     * @param typeName - тип, который нужно сопоставить с типом из app.properties для инициализации поля.
     * @return - возвращает имя нужного типа.
     */

    private String getNameClass(String typeName) {
        Settings settings = new Settings();
        ClassLoader loader = Settings.class.getClassLoader();

        try(InputStream io = loader.getResourceAsStream("app.properties")) {
            settings.load(io);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return settings.getValue(typeName);
    }

}
