package com.duoc.semana7.model;

/**
 * Subclase que representa un servicio de ruta gastronómica.
 * Extiende ServicioTuristico y sobrescribe mostrarInformacion()
 * agregando información específica del tipo de cocina ofrecida.
 */
public class RutaGastronomica extends ServicioTuristico {

    private String tipoCocina;

    public RutaGastronomica(String nombre, String destino, int duracionHoras, double precio, String tipoCocina) {
        super(nombre, destino, duracionHoras, precio);
        this.tipoCocina = tipoCocina;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de servicio: Ruta Gastronómica");
        System.out.println("Tipo de cocina: " + tipoCocina);
        System.out.println("---------------------------------");
    }
}
