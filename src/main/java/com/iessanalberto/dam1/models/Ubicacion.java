package com.iessanalberto.dam1.models;

public class Ubicacion {
    private float coordenadaX;
    private float coordenadaY;
    // Constructor
    public Ubicacion(float coordenadaX, float coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    public Ubicacion (){
        this.coordenadaX = (float) (Math.random()* 100);
        this.coordenadaY = (float) (Math.random()* 100);
    }
    // Métodos de clase

    public double calcularDistancia(Ubicacion ubicacion){
        return Math.sqrt(Math.pow(coordenadaX - ubicacion.coordenadaX,2) + Math.pow(coordenadaY - ubicacion.coordenadaY,2));
    }

}
