import java.util.Scanner;

public class peliculaFav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer peliculaFav;

        System.out.println("Ingrese su genero de pelicula favorito\n " +
                "1.Accion\n" +
                "2.Comedia\n" +
                "3.Drama\n" +
                "4.Ciencia ficcion\n");
        peliculaFav = sc.nextInt();

        if (peliculaFav == 1) {
            System.out.println("Mi recomendacion para peliculas del genero accion es: Batman");
        } else if (peliculaFav == 2) {
            System.out.println("Mi recomendacion para peliculas del genero comedia es: Supercool ");
        } else if (peliculaFav == 3) {
            System.out.println("Mi recomendacion para peliculas del genero drama es: La vida es bella");
        } else if (peliculaFav == 4) {
            System.out.println("Mi recomendacion para peliculas del genero ciencia ficcion es: Matrix");
        } else {
            System.out.println("No tengo recomendaciones para ese genero de peliculas. ");
        }
    }
}
