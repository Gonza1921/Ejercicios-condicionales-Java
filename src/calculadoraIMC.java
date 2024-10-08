// Ejercicio 4: Calculadora de IMC con Recomendaciones

import java.util.Optional;
import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso;
        double altura;
        double masaCorporal;

        System.out.println("Ingreese su peso en kg: ");
        peso = sc.nextDouble();

        System.out.println("Ingrese su altura en metros cuadrados ");
        altura = sc.nextDouble();

        masaCorporal = (peso / Math.pow(altura,2));
        System.out.println(masaCorporal);

        if (masaCorporal >= 30.0){
            System.out.println("Su obecidad de IMC corresponde a: Obesidad ");
        }
        else if (masaCorporal >= 25 && masaCorporal <= 29.9){
            System.out.println("Su indice de IMC corresponde a: Sobrepeso ");
        }
        else if (masaCorporal >= 18.5 && masaCorporal<=24.9){
            System.out.println("Su indice de IMC corresponde a: Peso normal");
        }
        else if (masaCorporal <= 18.5){
            System.out.println("Su indice de IMC corresponde a: Peso bajo");
        }




    }
}
