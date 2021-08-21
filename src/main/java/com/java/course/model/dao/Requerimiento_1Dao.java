/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.course.model.dao;

import com.java.course.model.vo.Requerimiento_1;
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
public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String query = "SELECT p.Constructora, p.Ciudad, p.Banco_Vinculado, p.Porcentaje_Cuota_Inicial, p.Clasificacion, p.Fecha_Inicio FROM Proyecto p WHERE Ciudad = 'Pereira';";
            Statement statement = conexion.createStatement();
            ResultSet response = statement.executeQuery(query);

            while (response.next()) {
                Requerimiento_1 req_1 = new Requerimiento_1();
                req_1.setConstructora(response.getString("Constructora"));
                req_1.setCiudad(response.getString("Ciudad"));
                req_1.setBanco(response.getString("Banco_vinculado"));
                req_1.setPorcentaje(response.getDouble("Porcentaje_Cuota_Inicial"));
                req_1.setClasificacion(response.getString("Clasificacion"));
                req_1.setFecha(response.getString("Fecha_Inicio"));

                respuesta.add(req_1);
            }

            statement.close();
            response.close();

        } catch(SQLException e) {
            System.out.println("Error en el primer requerimiento");
        } finally {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
        return respuesta;
    }
}
