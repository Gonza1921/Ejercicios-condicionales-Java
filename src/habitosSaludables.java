// Ejercicio 6: Evaluador de Hábitos Saludables

import java.util.Scanner;

public class habitosSaludables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double horasSueño;
        Double horasEjercicio;
        Integer comidasSaludables;

        System.out.println("Ingrese sus horas de sueño diaras; ");
        horasSueño = sc.nextDouble();

        System.out.println("Ingrese cuantas horas hacer ejercicio por dia: ");
        horasEjercicio = sc.nextDouble();

        System.out.println("Ingrese cuantas comidas saludables consume por dia: ");
        comidasSaludables = sc.nextInt();

        if (horasSueño >= 7 && horasSueño <= 9) {
            System.out.println("Tu cantidad de horas de sueño es óptima.");
        } else if (horasSueño < 7) {
            System.out.println("Duermes menos de lo recomendado, intenta dormir más. ");
        } else {
           System.out.println("Duermes más de lo recomendado, asegúrate de que sea sueño reparador. ");
        }

        // Evaluación del ejercicio
        String evalEjercicio;
        if (horasEjercicio >= 0.5) {
            evalEjercicio = "Estás cumpliendo con el ejercicio diario recomendado.";
        } else {
            evalEjercicio = "Sería beneficioso hacer más ejercicio para mantenerte saludable.";
        }

        // Evaluación de las comidas saludables
        String evalComidas;
        if (comidasSaludables >= 3 && comidasSaludables <= 5) {
            evalComidas = "Tienes una buena cantidad de comidas saludables diarias.";
        } else {
            evalComidas = "Intenta incluir más comidas saludables en tu día.";
        }





    }
}
