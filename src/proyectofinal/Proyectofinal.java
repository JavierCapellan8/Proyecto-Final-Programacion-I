
package proyectofinal;
import db.conexion;
import java.sql.*;

/**
 *
 * @author Javier
 */
public class Proyectofinal {

    public static void main(String[] args) {
        conexion prueba = new conexion();
        //prueba.provar_centencia("INSERT INTO personas(id,nombre,apellido,tel,correo,nom_usuario,contra,contra_2)"+
              //  "VALUES (null,'saul','martinez',8094024562,'blabla.com','unloco','jjj4','jjj4')"); 
        try {
            ResultSet pregunta = prueba.consulta("SELECT * FROM personas");
            while (pregunta.next()) {
                System.out.println(pregunta.getString("nombre"));
                
            }
        } catch (Exception e) {
        }
}
}