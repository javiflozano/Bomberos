package com.iessanalberto.dam1;

import com.iessanalberto.dam1.data.Datos;
import com.iessanalberto.dam1.models.Alarma;
import com.iessanalberto.dam1.models.Bombero;
import com.iessanalberto.dam1.models.Ubicacion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Declaraciones
        ArrayList<Bombero> listaBomberos = Datos.cargarBomberos();

        // PRUEBAS

        Alarma alarmaSabi = new Alarma("Incendio en el IES San Alberto",new Ubicacion(42.5192400f, -0.3660700f),6,"Fuego en el aula 105");
        alarmaSabi.asignarBomberos(listaBomberos);
        System.out.println(alarmaSabi);
    }
}