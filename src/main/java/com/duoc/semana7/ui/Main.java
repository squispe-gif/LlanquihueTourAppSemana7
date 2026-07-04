package com.duoc.semana7.ui;

import com.duoc.semana7.data.GestorServicios;

/**
 * Clase principal (punto de entrada) para probar el sistema de
 * gestión de servicios turísticos de Llanquihue Tour.
 *
 * Nota: este paso es opcional según la pauta de la Semana 7,
 * pero se incluye para verificar que el comportamiento polimórfico
 * funcione correctamente desde un punto de entrada central.
 */
public class Main {
    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();

        System.out.println("========================================");
        System.out.println(" LLANQUIHUE TOUR - Servicios Turísticos");
        System.out.println("========================================\n");

        gestor.mostrarTodosLosServicios();

        System.out.println("\nTotal de servicios registrados: " + gestor.getServicios().size());
    }
}
