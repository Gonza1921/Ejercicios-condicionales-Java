// Ejercicio 2: Calculadora de Descuentos

import java.util.Optional;
import java.util.Scanner;

public class calculadoraDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precioProducto;
        String categoriaCliente;
        Double descuentoEst;
        double descuentoJub;
        double descuentoAdu;


        System.out.println("Ingrese la categoria del cliente, si es:\n " +
                "1.Estudiante\n" +
                "2.Adulto\n)" +
                "3.Jubilado\n");
        categoriaCliente = sc.next();

        System.out.println("Ingrese el precio del producto: ");
        precioProducto = sc.nextDouble();

        descuentoEst = precioProducto * 0.10;
        descuentoAdu = precioProducto * 0.05;
        descuentoJub = precioProducto * 0.15;

        if (categoriaCliente.equals("Estudiante")) {
            System.out.println("Se le aplica un descuento del 10% a los estudiantes, El precio del producto es:" + (precioProducto - descuentoEst));
        } else if (categoriaCliente.equals("Adulto")) {
            System.out.println("Se le aplica un descuento del 5% a los adultos, El precio del producto es:" + (precioProducto - descuentoAdu));
        } else if (categoriaCliente.equals("Jubilado")) {
            System.out.println("Se le aplica un descuento del 15% a los jubilados, El precio del producto es:" + (precioProducto - descuentoJub));
        } else {
            System.out.println("No hay descuento para ese tipo de cliente. ");
        }
    }


}