/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.course.model.dao;


import com.java.course.model.vo.Requerimiento_3;
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
public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String query = "SELECT l.Cargo, MAX(l.Salario) FROM Lider l GROUP BY l.Cargo HAVING MAX(l.Salario)>700000;";
            Statement statement = conexion.createStatement();
            ResultSet response = statement.executeQuery(query);
            // Recorrer los registros en los VO específicos
            while (response.next()) {
                Requerimiento_3 req_3 = new Requerimiento_3();
                req_3.setCargo(response.getString("Cargo"));
                req_3.setMaxSalario(response.getInt("MAX(l.Salario)"));

                respuesta.add(req_3);
            }

            statement.close();
            response.close();

        } catch(SQLException e) {
            System.out.println("Error en el tercer requerimiento");
        } finally {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }

        // Retornar la colección de vo's
        return respuesta;

    }
}
