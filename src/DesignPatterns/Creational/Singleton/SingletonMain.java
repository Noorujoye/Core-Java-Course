package DesignPatterns.Creational.Singleton;

import java.lang.reflect.InvocationTargetException;

public class SingletonMain {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {


        Single single = Single.getInstance();
        single.show();
        Single single1 = Single.getInstance();
        single1.show();
        System.out.println("is Object same : " + (single == single1)); // hashcode is written but hidden
/* this will fail if we alreay call the getInstance method ,so once the getInstacne method called , reflextion will not work
        Constructor<Single> c = Single.class.getDeclaredConstructor();
        c.setAccessible(true);
        Single obj = c.newInstance();
        Single obj1 = c.newInstance();
        System.out.println(obj1 == obj);

        System.out.println("is Object same : " + (obj1 == obj)); // hashcode is written but hidden
 */
    }
}
/*
Singleton is a Creational Design Pattern
that ensures only one instance of a class
exists throughout the application and
provides a global access point to that instance.
 */