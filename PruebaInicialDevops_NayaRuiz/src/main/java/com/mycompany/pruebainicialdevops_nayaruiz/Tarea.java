/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebainicialdevops_nayaruiz;

/**
 *
 * @author daw2
 */
public class Tarea {

    String nombre;
    boolean completada;

    public Tarea() {

    }

    public Tarea(String nombre, boolean completada) {
        this.nombre = nombre;
        this.completada = completada;
    }

    public void datos() {
        System.out.println(nombre + (completada ? " : completada" : " : no completada"));
    }

}
