/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebainicialdevops_nayaruiz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw2
 */
public class GestorTareas {
    
    List<Tarea> listaTareas;
    
    public void GestorTareas (){
        listaTareas = new ArrayList<>();
    }
    
    public void añadirTarea (String nombre, boolean completada){
        listaTareas.add(new Tarea(nombre, completada));
    }
    
    public void listado (){
        for (Tarea t : listaTareas){
            t.datos();
        }
    }
    
    public boolean eliminar (String nombre){
        boolean eliminado = false;
        for (Tarea t : listaTareas){
            if(t.getNombre().toLowerCase().trim().equals(nombre.toLowerCase().trim())){
                eliminado = true;
                listaTareas.remove(t);
            }
        }
        return eliminado;
    }
    
}
