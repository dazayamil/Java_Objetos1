package Extra.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ExampleReflection {
    public static void main(String[] args) {
        try {
            //En esta linea obtenemos la clase Persona
            Class<?> cls = Class.forName("Extra.Reflection.Persona");
            //Aca obtenemos el constructor con el parametro de tipo String
            Constructor<?> constructor = cls.getDeclaredConstructor(String.class);

            //Instanciamos la clase, pasando el valor del parametro
            Object newInstance = constructor.newInstance("Java");

            //Obtenemos el nombre de todos los metodos de la clase Persona
            System.out.println("Metodos de la clase");
            for (Method method: cls.getDeclaredMethods()) {
                System.out.println(method.getName());
            }

            //Obtenemos el Metodo privado
            Method privateMethod = cls.getDeclaredMethod("mostrarMensajePrivado");
            //Lo hacemos accesible y luego lo invocamos
            privateMethod.setAccessible(true);
            privateMethod.invoke(newInstance);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
