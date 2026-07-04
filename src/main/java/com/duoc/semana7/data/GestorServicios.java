package com.duoc.semana7.data;

import com.duoc.semana7.model.ServicioTuristico;
import com.duoc.semana7.model.RutaGastronomica;
import com.duoc.semana7.model.PaseoLacustre;
import com.duoc.semana7.model.ExcursionCultural;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar la colección polimórfica de servicios
 * turísticos de la agencia Llanquihue Tour.
 *
 * Almacena distintos tipos de servicios (RutaGastronomica, PaseoLacustre,
 * ExcursionCultural) en una misma lista de tipo List<ServicioTuristico>,
 * permitiendo recorrerlos y mostrarlos de forma polimórfica.
 */
public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {
        this.servicios = new ArrayList<>();
        cargarServicios();
    }

    /**
     * Carga en la lista al menos cinco objetos, combinando instancias
     * de las distintas subclases de ServicioTuristico.
     */
    private void cargarServicios() {
        servicios.add(new RutaGastronomica(
                "Ruta del Curanto", "Puerto Varas", 4, 25000, "Comida típica chilota"));

        servicios.add(new PaseoLacustre(
                "Navegación al Amanecer", "Lago Llanquihue", 3, 30000, "Lago Llanquihue", true));

        servicios.add(new ExcursionCultural(
                "Historia de los Colonos", "Frutillar", 5, 20000, "Museo Colonial Alemán", true));

        servicios.add(new RutaGastronomica(
                "Sabores del Sur", "Osorno", 3, 18000, "Cocina alemana-chilena"));

        servicios.add(new PaseoLacustre(
                "Kayak en el Lago", "Lago Todos los Santos", 2, 22000, "Lago Todos los Santos", false));

        servicios.add(new ExcursionCultural(
                "Ruta de los Volcanes", "Puerto Octay", 6, 35000, "Volcán Osorno", false));
    }

    /**
     * Retorna la colección completa de servicios turísticos.
     */
    public List<ServicioTuristico> getServicios() {
        return servicios;
    }

    /**
     * Recorre la colección y muestra la información de cada servicio
     * de forma polimórfica, invocando mostrarInformacion() desde la
     * referencia de tipo ServicioTuristico.
     */
    public void mostrarTodosLosServicios() {
        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }
}
