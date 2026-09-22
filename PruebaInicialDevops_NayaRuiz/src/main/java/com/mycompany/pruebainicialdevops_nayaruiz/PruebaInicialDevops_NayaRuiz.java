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
        } while (menu != 4);
    }

    public static void menu() {
        System.out.println("""
                           1.- Introducir tarea
                           2.- Ver listado de tareas
                           3.- Eliminar tarea
                           4.- Salir
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
            case 2 ->
                g.listado();
        }
    }

}
