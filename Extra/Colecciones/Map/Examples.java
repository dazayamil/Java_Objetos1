package Extra.Colecciones.Map;

import java.util.HashMap;
import java.util.Map;

public class Examples {
    public static void main(String[] args) {
        //CONTADOR DE FRECUENCIAS
        Map<String, Integer> frecuencias = new HashMap<>();

        // Contar ocurrencias de palabras
        String texto = "hola mundo hola java mundo java java";
        for (String palabra : texto.split(" ")) {
            frecuencias.merge(palabra, 1, Integer::sum);
        }
        // Resultado: {hola=2, mundo=2, java=3}


        //DICCIONARIO DE CONFIGURACION
        Map<String, String> config = new HashMap<>();
        config.put("db.url", "jdbc:mysql://localhost:3306/db");
        config.put("db.user", "admin");
        config.put("app.name", "MiAplicacion");

        // Obtener configuración con valor por defecto
        String puerto = config.getOrDefault("app.port", "8080");
    }
}
