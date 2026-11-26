import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<>();
        mapa1.put("España", "Madrid");
        mapa1.put("Francia", "Paris");
        mapa1.put("Inglaterra", "Londres");
        mapa1.put("Alemania", "Berlín");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del pais y te dire su capital");
        String pais = sc.nextLine();
        if (mapa1.containsKey(pais)) {
            System.out.println("La capital de " + pais + " es: " + mapa1.get(pais));
        } else {
            System.out.println("No se encuentra el pais " + pais);
        }

    }

}
