// Ejercicio 3: Sistema de Recomendación de Libros

import java.util.Optional;
import java.util.Scanner;

public class recomendacionLibros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String librosFav;

        System.out.println("Ingrese su genero de libro favorito:\n" +
                "1.fantasia\n" +
                "2.misterio\n" +
                "3.romance\n" +
                "4.ciencia ficcion\n");
        librosFav = sc.next();

        if (librosFav.equals("fantasia")) {
            System.out.println("Mi recomendacion para el genero FANTASIA es el libro llamado: Fuego y Sangre");
        } else if (librosFav.equals("misterio")) {
            System.out.println("Mi recomendacion para el genero MISTERIO es el libro llamado: catedrales");
        } else if (librosFav.equals("romance")) {
            System.out.println("Mi recomendacion para el genero ROMANCE es el libro llamado: Quedara en el amor");
        } else if (librosFav.equals("ciencia ficcion")) {
            System.out.println("Mi recomendacion para el genero CIENCIA FICCION es el libro llamado: DUNE");
        } else {
            System.out.println("No tengo libros para ese genero :( ");
        }
    }
}