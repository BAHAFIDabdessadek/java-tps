package ma.education.tp6.annotations;

import java.lang.annotation.Inherited;

public class TestReflectionAnnotation {
    public static void main(String[] args) {

             /*
         Class c= Calculatrice.class;
        Programmer programmer = (Programmer) c.getAnnotation(Programmer.class);
        System.out.println(programmer.id()+":"+programmer.name());
        */


        Class c= CalculatriceMath.class;
        Programmer programmer = (Programmer) c.getAnnotation(Programmer.class);
        System.out.println(programmer.id()+":"+programmer.name());


    }
}
