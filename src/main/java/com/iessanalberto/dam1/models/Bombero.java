package com.iessanalberto.dam1.models;

public class Bombero {
    private int idBombero;
    private String nombre;
    private String apellidos;
    private String telefono;
    private boolean isDisponible;
    private Ubicacion ubicacion;
    private static int numBomberos = 0;
    // Constructores
    public Bombero(String nombre, String apellidos, String telefono, Ubicacion ubicacion) {
        numBomberos++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.isDisponible = true;
        this.idBombero = numBomberos;
    }
    // Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }
}
