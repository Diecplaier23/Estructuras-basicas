import java.util.ArrayList;
import java.util.Scanner;

public class Regalos {
    public static final String V = "\u001B[32m";  // Verde
    public static final String RS = "\u001B[0m";  // Reiniciar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> portales = new ArrayList<>();
        System.out.print(V + "Introduce el portal donde aterriza Papa Noel: " + RS);
        int posicion = sc.nextInt();
        sc.nextLine();
        System.out.print(V + "Introduce los portales que debe visitar separados por espacios: " + RS);
        String linea = sc.nextLine();
        Scanner datos = new Scanner(linea);
        while (datos.hasNextInt()) {
            portales.add(datos.nextInt());
        }
        System.out.print(V + "Orden de visita: " + RS);
        repartirRegalos(posicion, portales);
    }
    public static void repartirRegalos(int posicion, ArrayList<Integer> portales) {
        while (!portales.isEmpty()) {
            int cercano = portales.get(0);
            for (int portal : portales) {
                if (Math.abs(portal - posicion) < Math.abs(cercano - posicion) || (Math.abs(portal - posicion) == Math.abs(cercano - posicion) && portal > cercano)) {
                    cercano = portal;
                }
            }
            System.out.print(cercano + " ");
            posicion = cercano;
            portales.remove(Integer.valueOf(cercano));
        }
    }
}