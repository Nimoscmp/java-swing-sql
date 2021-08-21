/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.course.model.vo;

/**
 *
 * @author nicolas
 */
public class Requerimiento_1 {
    private String constructora;
    private String ciudad;
    private String banco;
    private Double porcentaje;
    private String clasificacion;
    private String fecha;


    public Requerimiento_1() {
    }

    public Requerimiento_1(String constructora, String ciudad, String banco, Double porcentaje, String clasificacion, String fecha) {
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.banco = banco;
        this.porcentaje = porcentaje;
        this.clasificacion = clasificacion;
        this.fecha = fecha;
    }

    public String getConstructora() {
        return this.constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBanco() {
        return this.banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Double getPorcentaje() {
        return this.porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getClasificacion() {
        return this.clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
