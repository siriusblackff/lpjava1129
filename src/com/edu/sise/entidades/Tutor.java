/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.sise.entidades;

import java.time.LocalDate;

/**
 *
 * @author marco
 */
public class Tutor {

    private Integer id_tutor;
    private String dni;
    private String nombre;
    private String papellidos;
    private String sapellidos;
    private LocalDate fnacimiento;
    private String telefono;
    private Integer id_prov;

    public Tutor(Integer id_tutor, String dni, String nombre, String papellidos, String sapellidos, LocalDate fnacimiento, String telefono, Integer id_prov) {
        this.id_tutor = id_tutor;
        this.dni = dni;
        this.nombre = nombre;
        this.papellidos = papellidos;
        this.sapellidos = sapellidos;
        this.fnacimiento = fnacimiento;
        this.telefono = telefono;
        this.id_prov = id_prov;
    }

    public Integer getId_tutor() {
        return id_tutor;
    }

    public void setId_tutor(Integer id_tutor) {
        this.id_tutor = id_tutor;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPapellidos() {
        return papellidos;
    }

    public void setPapellidos(String papellidos) {
        this.papellidos = papellidos;
    }

    public String getSapellidos() {
        return sapellidos;
    }

    public void setSapellidos(String sapellidos) {
        this.sapellidos = sapellidos;
    }

    public LocalDate getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(LocalDate fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getId_prov() {
        return id_prov;
    }

    public void setId_prov(Integer id_prov) {
        this.id_prov = id_prov;
    }
    
     @Override
    public String toString(){
        return id_prov + " - " + nombre;
}
}
