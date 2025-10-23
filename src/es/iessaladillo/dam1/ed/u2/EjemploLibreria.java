package es.iessaladillo.dam1.ed.u2;

import org.joda.time.LocalDate;   // importamos clase de la librería externa

public class EjemploLibreria {
    public static void main(String[] args) {
        LocalDate hoy = new LocalDate();        // Fecha actual
        LocalDate futuro = hoy.plusDays(10);    // Fecha dentro de 10 días

        //Escribe tú las dos próximas líneas de código:
        //Muestra el mensaje en consola "Hoy es: XXX", donde XXX es el valor de la variable hoy.
        System.out.println("Hoy es: " + hoy);
        //Muestra el mensaje en consola "Dentro de 10 días será: XXX", donde XXX es el valor de la variable futuro.
        System.out.println("Dentro de 10 días será: " + futuro);
    }
}