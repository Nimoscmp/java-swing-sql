/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.course.controller;

import com.java.course.model.dao.Requerimiento_1Dao;
import com.java.course.model.dao.Requerimiento_2Dao;
import com.java.course.model.dao.Requerimiento_3Dao;
import com.java.course.model.vo.Requerimiento_1;
import com.java.course.model.vo.Requerimiento_2;
import com.java.course.model.vo.Requerimiento_3;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nicolas
 */
public class Controlador {
    private final Requerimiento_1Dao requerimiento1Dao;
    private final Requerimiento_2Dao requerimiento2Dao;
    private final Requerimiento_3Dao requerimiento3Dao;

    public Controlador() {
        this.requerimiento1Dao = new Requerimiento_1Dao();
        this.requerimiento2Dao = new Requerimiento_2Dao();
        this.requerimiento3Dao = new Requerimiento_3Dao();

    }

    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        
        ArrayList<Requerimiento_1> list_1 = this.requerimiento1Dao.requerimiento1();

        return list_1;
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        
        ArrayList<Requerimiento_2> list_2 = this.requerimiento2Dao.requerimiento2();

        return list_2;
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        
        ArrayList<Requerimiento_3> list_3 = this.requerimiento3Dao.requerimiento3();

        return list_3;
    }
}
