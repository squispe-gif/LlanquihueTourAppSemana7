package com.duoc.semana7.model;

/**
 * Subclase que representa un servicio de paseo lacustre.
 * Extiende ServicioTuristico y sobrescribe mostrarInformacion()
 * agregando información específica del lago y el equipamiento incluido.
 */
public class PaseoLacustre extends ServicioTuristico {

    private String nombreLago;
    private boolean incluyeEquipo;

    public PaseoLacustre(String nombre, String destino, int duracionHoras, double precio,
                          String nombreLago, boolean incluyeEquipo) {
        super(nombre, destino, duracionHoras, precio);
        this.nombreLago = nombreLago;
        this.incluyeEquipo = incluyeEquipo;
    }

    public String getNombreLago() {
        return nombreLago;
    }

    public void setNombreLago(String nombreLago) {
        this.nombreLago = nombreLago;
    }

    public boolean isIncluyeEquipo() {
        return incluyeEquipo;
    }

    public void setIncluyeEquipo(boolean incluyeEquipo) {
        this.incluyeEquipo = incluyeEquipo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de servicio: Paseo Lacustre");
        System.out.println("Lago: " + nombreLago);
        System.out.println("Incluye equipo: " + (incluyeEquipo ? "Sí" : "No"));
        System.out.println("---------------------------------");
    }
}
