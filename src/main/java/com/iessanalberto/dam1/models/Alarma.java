package com.iessanalberto.dam1.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Alarma {
    private int idAlarma;
    private String nombre;
    private Ubicacion ubicacion;
    private int numBomberos;
    private boolean isActiva = true;
    private String observaciones;
    private static int numAlarmas = 0;
    private ArrayList<Bombero> bomberos = new ArrayList<>();
    // Constructor
    public Alarma(String nombre, Ubicacion ubicacion, int numBomberos, String observaciones) {
        numAlarmas++;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.numBomberos = numBomberos;
        this.observaciones = observaciones;
        this.idAlarma = numAlarmas;
    }

    public Alarma(String nombre, Ubicacion ubicacion, int numBomberos) {
        numAlarmas++;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.numBomberos = numBomberos;
        this.idAlarma = numAlarmas;

    }
    // Getter y setter

    public boolean isActiva() {
        return isActiva;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public int getNumBomberos() {
        return numBomberos;
    }

    public void setActiva(boolean activa) {
        isActiva = activa;
    }

    @Override
    public String toString() {

        String respuesta =  "Información de la alarma: \n" +
                nombre + "\n" +
                "Bomberos requeridos: " + numBomberos + "\n" +
                "Bomberos designados: \n";

        for (Bombero bombero: bomberos){
            respuesta += bombero.getNombre() + " " + bombero.getApellidos() + "\n";
        }
        return respuesta;
    }

    // Métodos
    public void asignarBomberos(ArrayList<Bombero> listaBomberos){
        // Creo un mapa con los bomberos disponibles y las distancias
        Map<Bombero,Double> mapaDistancias = new HashMap<>();
        for (Bombero bombero:listaBomberos){
            if (bombero.isDisponible()){
                mapaDistancias.put(bombero,bombero.getUbicacion().calcularDistancia(ubicacion));
            }
        }
        // Ordenamos el mapa por distancia de menor a mayor
        Map<Bombero,Double> mapaOrdenado = mapaDistancias.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e1,
                        LinkedHashMap::new));
        // Asignar los bomberos necesarios a la alarma
        for (Map.Entry<Bombero,Double> entry: mapaOrdenado.entrySet()){
            if (bomberos.size() < numBomberos){
                bomberos.add(entry.getKey());
                entry.getKey().setDisponible(false);
            }
        }
    }
}
