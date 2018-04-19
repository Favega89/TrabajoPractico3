package Percistencia;

import Model.ResultModel;
import com.mysql.jdbc.PreparedStatement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.SQLException;


/**
 * Created by Yo on 16/4/2018.
 */
public class Writer implements IResultWriter {

    private DBConection miConeccion = DBConection.getInstance(); // DATABASE CONECCION INSTANCE.
    private final String sAdd = "INSERT INTO RESULTADOS(nombre_ganador,puntaje) VALUES (?,?)";

    public void add(ResultModel r) {
        try {
            miConeccion.Conect();
            PreparedStatement p = (PreparedStatement) miConeccion.getMyConection().prepareStatement(sAdd);

            p.setString(1, r.getName());
            p.setInt(2, r.getPuntaje());
            p.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                miConeccion.Disconect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
