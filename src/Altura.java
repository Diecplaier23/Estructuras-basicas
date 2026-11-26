import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Altura {

    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m"; // Cian claro
    public static final String RS = "\u001B[0m";   // Reiniciar
    public static final String I = "\u001B[3m";    // Cursiva
    public static final String N = "\u001B[1m";    // Negrita

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> alturas = new ArrayList<>();

        System.out.print(V + "¿Cuántos alumnos tienes?" + RS + "\n");
        int alumnos = numeroAlumnos(sc);

        if (alumnos <= 0) {
            System.out.println(R + "Debe haber al menos un alumno." + RS);
            return;
        }
        System.out.println(V + "Introduce las alturas de los alumnos:" + RS);
        leerAlturas(sc, alumnos, alturas);
        double media = calcularMedia(alturas);
        int alumnosConAlturaInferior = cuantosalumnosmedidainferior(alturas, media);
        mostrarResultado(alturas, media, alumnosConAlturaInferior);

    }

    public static int numeroAlumnos(Scanner sc) {
        return sc.nextInt();
    }

    public static List<Double> leerAlturas(Scanner sc, int alumnos, ArrayList<Double> alturas) {

        for (int i = 0; i < alumnos; i++) {
            System.out.print("Altura del alumno " + (i + 1) + ": ");
            alturas.add(sc.nextDouble());
        }
        return alturas;
    }

    public static double calcularMedia(List<Double> alturas) {
        double suma = 0;
        for (double altura : alturas) {
            suma += altura;
        }
        return suma / alturas.size();
    }

    public static int cuantosalumnosmedidainferior(List<Double> alturas, double media) {

        int contador = 0;

        for (double altura : alturas) {
            if (altura < media) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultado(List<Double> alturas, double media, int alumnosConAlturaInferior) {
        System.out.println("\n" + CC + "----- RESULTADOS -----" + RS);
        System.out.println(V + "Alturas introducidas: " + alturas + RS);
        System.out.println(V + "Media de las alturas: " + media + RS);
        System.out.println(V + "Número de alumnos con altura inferior a la media: " + alumnosConAlturaInferior + RS);
    }
}