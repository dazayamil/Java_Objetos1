package Extra.Anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


public class Anotacion {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface TestAnotacionLogin{
        String descripcion() default "Prueba";
    }

    @TestAnotacionLogin(descripcion = "Prueba 01 de Funcionalidad Login")
    public void pruebaLogin(){
        System.out.println("Prueba 01 - Login, finalizado con exito");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Anotacion anotacion = new Anotacion();
        //Obtener el metodo "prubaLogin" usando reflect > Method
        Method metodo = anotacion.getClass().getMethod("pruebaLogin");

        //Obtener la Anotacion (tambien se puede verificar con un IF)
        TestAnotacionLogin anotacionTest = metodo.getAnnotation(TestAnotacionLogin.class);
        //Obtener el valor del elemento de la anotacion dentro de la variable "valorElementoAnotacion"
        String valorElementoAnotacion = anotacionTest.descripcion();
        System.out.println(valorElementoAnotacion);

        System.out.println();
        anotacion.pruebaLogin();
    }

}
