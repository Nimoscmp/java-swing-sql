/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.course.model.dao;

import com.java.course.model.vo.Requerimiento_2;
import com.java.course.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author nicolas
 */
public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {

        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String query = "SELECT c.Proveedor, p.Constructora, c.Pagado FROM Compra c INNER JOIN Proyecto p WHERE c.ID_Proyecto = p.ID_Proyecto AND c.Proveedor in ('Homecenter', 'JUMBO') AND c.Pagado = 'Si' AND p.Constructora LIKE '%S.A.' ORDER BY c.Proveedor;";
            Statement statement = conexion.createStatement();
            ResultSet response = statement.executeQuery(query);
            
            while (response.next()) {
                Requerimiento_2 req_2 = new Requerimiento_2();
                req_2.setProveedor(response.getString("Proveedor"));
                req_2.setConstructora(response.getString("Constructora"));
                req_2.setPagado(response.getString("Pagado"));
                respuesta.add(req_2);
            }

            statement.close();
            response.close();

        } catch(SQLException e) {
            System.out.println("Error en el segundo requerimiento");
        } finally {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }

        return respuesta;
    }
}
