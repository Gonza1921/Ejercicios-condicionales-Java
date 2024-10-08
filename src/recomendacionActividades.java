// Ejercicio 7: Sistema de Recomendación de Actividades

import java.util.Scanner;

public class recomendacionActividades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String estadoAnimo;

        System.out.println("Ingrese su estado de animo:\n " +
                "1.feliz\n" +
                "2.triste\n" +
                "3.energetico\n" +
                "4.relajado\n");
        estadoAnimo = sc.next();

        if (estadoAnimo.equals("feliz")){
            System.out.println("Salir de fiesta");
        }
        if (estadoAnimo.equals("triste")){
            System.out.println("Leer un libro");
        }
        if (estadoAnimo.equals("energetico")){
            System.out.println("Hacer deporte");
        }
        if (estadoAnimo.equals("relajado")){
            System.out.println("Tomar mates en el parque");
        }



    }
}
