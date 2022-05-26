/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.sise.logic;

import com.edu.sise.dao.DAOManager;
import com.edu.sise.dao.ProfesorDao;
import com.edu.sise.entidades.Profesor;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marco
 */
public class ProfesorLogic {
    
    List<Profesor> lista;
    ProfesorDao dao = DAOManager.getInstancia().getProfesorDao();
   
    public DefaultTableModel getModelo(){
    //cargarLista();
    //lista = new ProfesorDao().getAll();
    
    lista = dao.getAll();
    DefaultTableModel modelo = new DefaultTableModel();
    //crear mis columnas
    modelo.addColumn("ID");
    modelo.addColumn("DNI");
    modelo.addColumn("NOMBRE");
    modelo.addColumn("PAPELLIDO");
    modelo.addColumn("SAPELLIDO");   
    modelo.addColumn("FNACIMIENTO");
    modelo.addColumn("TELEFONO");
    modelo.addColumn("ID_CARRERA");
    modelo.addColumn("ID_PROV");
    for(Profesor obj : lista){
        Object data[] = {
            obj.getId_profe(),
            obj.getDni(),
            obj.getNombre(),
            obj.getPapellidos(),
            obj.getSapellidos(),           
            obj.getFnacimiento(),
            obj.getTelefono(),
            obj.getId_carrera(),
            obj.getId_prov()
        };
        
        modelo.addRow(data);
    }
    return modelo;
            }
    
      public DefaultTableModel getModelo(String nombre){
    //cargarLista();
    lista = dao.getSearch(nombre);
    DefaultTableModel modelo = new DefaultTableModel();
    //crear mis columnas
    modelo.addColumn("ID");
    modelo.addColumn("DNI");
    modelo.addColumn("NOMBRE");
    modelo.addColumn("PAPELLIDO");
    modelo.addColumn("SAPELLIDO");   
    modelo.addColumn("FNACIMIENTO");
    modelo.addColumn("TELEFONO");
    modelo.addColumn("ID_CARRERA");
    modelo.addColumn("ID_PROV");
    for(Profesor obj : lista){
        Object data[] = {
            obj.getId_profe(),
            obj.getDni(),
            obj.getNombre(),
            obj.getPapellidos(),
            obj.getSapellidos(),           
            obj.getFnacimiento(),
            obj.getTelefono(),
            obj.getId_carrera(),
            obj.getId_prov()
        };
        
      
   
            
        
        modelo.addRow(data);
    }
    return modelo;
}
public void imprimir(JTable tabla, String nombre){
        tabla.setModel(getModelo(nombre));
}
public void imprimir(JTable tabla){
    tabla.setModel(getModelo());
}


//metodo para agregar un registro en base de datos
    public boolean agregarProfesor(Profesor o){
        return dao.agregarProfesor(o);
        
    }
    
    public boolean modificarProfesor(Profesor o){
        return dao.modificarProfesor(o);
    }
    
    public boolean eliminarProfesor(Integer id){
        return dao.eliminarProfesor(id);
    }
    //metodo para carga masiva
    public int cargaMasiva(String rutaArchivo){
        
        int registros_afectados = 0;
        
        try {
            FileInputStream archivo = new FileInputStream(rutaArchivo);
            DataInputStream entrada = new DataInputStream(archivo);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String linea;
            
            List<Profesor> listaCargaMasica = new ArrayList<>();
            while((linea=buffer.readLine())!=null){
                System.out.println(linea);
                String [] campos = linea.split("\\|");
                listaCargaMasica.add(new Profesor(
                        -1,
                        campos[0],//DNI
                        campos[1],//NOMBRE
                        campos[2],//P APELLIDO
                        campos[3],//S APELLIDO                        
                        LocalDate.parse(campos[4]),//fnacimiento
                        campos[5],//TELEFONO
                        Integer.parseInt(campos[6]),//id_carrera
                        Integer.parseInt(campos[7])//id_prov
                        
               
                ));
                
            
            }
            entrada.close();
            
            int[] resultados = dao.cargaMasiva(listaCargaMasica);
            
            for(int i=0; i<resultados.length;i++)
                registros_afectados +=  resultados[i];
            //agregar la logica para interactuar con base de datos
            
        } catch (Exception ex) {
            System.out.println("Error Carga Masiva: "+ ex.getMessage());
        }
        return registros_afectados;
    }

}
