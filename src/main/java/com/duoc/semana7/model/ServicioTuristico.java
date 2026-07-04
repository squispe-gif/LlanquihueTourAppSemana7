package com.duoc.semana7.model;

/**
 * Clase superclase que representa un servicio turístico genérico
 * ofrecido por la agencia Llanquihue Tour.
 *
 * Contiene los atributos y comportamientos comunes a todos los
 * servicios turísticos, y define el método mostrarInformacion()
 * que será sobrescrito por cada subclase para entregar información
 * específica de cada tipo de servicio.
 */
public class ServicioTuristico {

    // Atributos comunes a todos los servicios turísticos
    protected String nombre;
    protected String destino;
    protected int duracionHoras;
    protected double precio;

    public ServicioTuristico(String nombre, String destino, int duracionHoras, double precio) {
        this.nombre = nombre;
        this.destino = destino;
        this.duracionHoras = duracionHoras;
        this.precio = precio;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Muestra la información base del servicio turístico.
     * Las subclases deben sobrescribir este método (@Override)
     * para agregar información específica de cada tipo de servicio.
     */
    public void mostrarInformacion() {
        System.out.println("=== Servicio Turístico ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Destino: " + destino);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Precio: $" + precio);
    }
}
