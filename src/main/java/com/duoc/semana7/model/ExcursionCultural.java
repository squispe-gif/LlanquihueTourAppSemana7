package com.duoc.semana7.model;

/**
 * Subclase que representa un servicio de excursión cultural.
 * Extiende ServicioTuristico y sobrescribe mostrarInformacion()
 * agregando información específica del sitio histórico visitado.
 */
public class ExcursionCultural extends ServicioTuristico {

    private String sitioHistorico;
    private boolean incluyeGuiaBilingue;

    public ExcursionCultural(String nombre, String destino, int duracionHoras, double precio,
                              String sitioHistorico, boolean incluyeGuiaBilingue) {
        super(nombre, destino, duracionHoras, precio);
        this.sitioHistorico = sitioHistorico;
        this.incluyeGuiaBilingue = incluyeGuiaBilingue;
    }

    public String getSitioHistorico() {
        return sitioHistorico;
    }

    public void setSitioHistorico(String sitioHistorico) {
        this.sitioHistorico = sitioHistorico;
    }

    public boolean isIncluyeGuiaBilingue() {
        return incluyeGuiaBilingue;
    }

    public void setIncluyeGuiaBilingue(boolean incluyeGuiaBilingue) {
        this.incluyeGuiaBilingue = incluyeGuiaBilingue;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de servicio: Excursión Cultural");
        System.out.println("Sitio histórico: " + sitioHistorico);
        System.out.println("Incluye guía bilingüe: " + (incluyeGuiaBilingue ? "Sí" : "No"));
        System.out.println("---------------------------------");
    }
}
