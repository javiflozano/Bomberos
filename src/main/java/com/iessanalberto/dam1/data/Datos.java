package com.iessanalberto.dam1.data;

import com.iessanalberto.dam1.models.Bombero;
import com.iessanalberto.dam1.models.Ubicacion;

import java.util.ArrayList;
import java.util.Arrays;

public class Datos {
    public static ArrayList<Bombero> cargarBomberos(){
        ArrayList<Bombero> listaBomberos = new ArrayList<Bombero>();
        listaBomberos.addAll(Arrays.asList(
                new Bombero("Juan", "Pérez", "600123456", new Ubicacion(40.4168f, -3.7038f)), // Madrid
                new Bombero("Ana", "González", "600654321", new Ubicacion(41.3784f, 2.1912f)), // Barcelona
                new Bombero("Luis", "Martínez", "601234567", new Ubicacion(39.4688f, -0.3763f)), // Valencia
                new Bombero("Carlos", "Hernández", "601876543", new Ubicacion(40.4168f, -3.7038f)), // Madrid
                new Bombero("Laura", "Lopez", "602345678", new Ubicacion(41.3784f, 2.1912f)), // Barcelona
                new Bombero("Pedro", "García", "603456789", new Ubicacion(39.4688f, -0.3763f)), // Valencia
                new Bombero("Sofía", "Rodríguez", "604567890", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Raúl", "Fernández", "605678901", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Marta", "Sánchez", "606789012", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("David", "Díaz", "607890123", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Elena", "Martín", "608901234", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Javier", "Jiménez", "609012345", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("Susana", "Moreno", "610123456", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Antonio", "Álvarez", "611234567", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Isabel", "Muñoz", "612345678", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("José", "Romero", "613456789", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Raquel", "Gómez", "614567890", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Fernando", "Ruiz", "615678901", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("Patricia", "Vázquez", "616789012", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("María", "Hernández", "617890123", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Francisco", "Jiménez", "618901234", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("Inés", "Serrano", "619012345", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Carmen", "Hernández", "620123456", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Raul", "Hernández", "621234567", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("Andrés", "González", "622345678", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Alicia", "Pérez", "623456789", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Nicolás", "Ramírez", "624567890", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("Sandra", "Torres", "625678901", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Manuel", "Vargas", "626789012", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Julio", "López", "627890123", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("Rosa", "Morales", "628901234", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Felipe", "Paredes", "629012345", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Ángel", "Santos", "630123456", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("Montserrat", "Bravo", "631234567", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Isidro", "López", "632345678", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Pedro", "Pérez", "633456789", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("Margarita", "García", "634567890", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Ricardo", "Blanco", "635678901", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Eva", "Gómez", "636789012", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("Gerardo", "Vázquez", "637890123", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Andrea", "López", "638901234", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Víctor", "Pérez", "639012345", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("Cristina", "Jiménez", "640123456", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Carlos", "Vega", "641234567", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Jorge", "Hernández", "642345678", new Ubicacion(39.4688f, -0.3763f)),
                new Bombero("Mónica", "Sánchez", "643456789", new Ubicacion(40.4168f, -3.7038f)),
                new Bombero("Berta", "Martínez", "644567890", new Ubicacion(41.3784f, 2.1912f)),
                new Bombero("Luis", "Serrano", "645678901", new Ubicacion(39.4688f, -0.3763f))
        ));
        return listaBomberos;
    }
}
