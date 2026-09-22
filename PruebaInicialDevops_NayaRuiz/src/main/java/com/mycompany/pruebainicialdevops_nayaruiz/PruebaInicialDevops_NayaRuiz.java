/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebainicialdevops_nayaruiz;

import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class PruebaInicialDevops_NayaRuiz {

    public static void main(String[] args) {
        GestorTareas t = new GestorTareas();
        Scanner teclado = new Scanner(System.in);
        int menu = 0;
        do {
            menu();
            menu = Integer.parseInt(teclado.nextLine());
            acciones(menu, t, teclado);
        } while (menu != 5);
    }

    public static void menu() {
        System.out.println("""
                           1.- Introducir tarea
                           2.- Cambiar estado
                           3.- Ver listado de tareas
                           4.- Eliminar tarea
                           5.- Salir
                           """);
    }

    public static void acciones(int n, GestorTareas g, Scanner teclado) {
        switch (n) {
            case 1 -> {
                System.out.println("Introduzca el nombre de la tarea");
                String tarea = teclado.nextLine();
                String estado = "";
                do {
                    System.out.println("Introduzca el estado de la tarea (pendiente o terminada)");
                    estado = teclado.nextLine().toLowerCase().trim();
                } while (!estado.equals("pendiente") || !estado.equals("terminada"));
                if (estado.equals("pendiente")) {
                    g.añadirTarea(tarea, false);
                } else {
                    g.añadirTarea(tarea, true);
                }
            }
            case 2 -> {
                System.out.println("Introduzca el nombre de la tarea");
                String tarea = teclado.nextLine();
                System.out.println(g.cambiarEstado(tarea) ? "Estado cambiado correctamente" : "No se ha encontrado la tarea");
                
            }
            case 3 ->
                g.listado();
            case 4 -> {
                System.out.println("Introduzca el nombre de la tarea que desea eliminar");
                String nombre = teclado.nextLine();
                boolean eliminado = g.eliminar(nombre, teclado);
                System.out.println(eliminado ? "Se ha eliminado correctamente" : "No se ha eliminado la tarea");
            }
            default ->
                System.out.println("Introduzca un numero correcto");
        }
    }

}
