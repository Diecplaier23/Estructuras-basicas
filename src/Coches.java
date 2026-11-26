
import java.util.ArrayList;
import java.util.Scanner;

public class Coches {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m"; // Cian claro
    public static final String RS = "\u001B[0m";  // Reiniciar
    public static final String I = "\u001B[3m";   // Cursiva
    public static final String N = "\u001B[1m";   // Negrita

    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.print(V + "Introduce los coches que quieras, cuando termines escribe una línea vacía:" + RS + "\n");
        do {
            n = sc.nextLine();
            if (!n.isEmpty()) {
                coches.add(n);
            }
            System.out.print(V + coches + RS + "\n");
        } while (!n.isEmpty());
        System.out.println(A + "Lista final: " + coches + RS);
    }
}
