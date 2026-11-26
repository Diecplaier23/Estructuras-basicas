import java.util.HashMap;
import java.util.Scanner;
public class Telefonos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> contactos = new HashMap<>();
        contactos.put("Diego", "612345678");
        contactos.put("Juan", "623456789");
        contactos.put("Maria", "634567890");
        contactos.put("Pedro", "645678901");
        System.out.print("Introduce el nombre del contacto: ");
        String nombre = sc.nextLine();
        mostrarTelefono(contactos, nombre);
        sc.close();
    }

    public static void mostrarTelefono(HashMap<String, String> contactos, String nombre) {
        if (contactos.containsKey(nombre)) {
            System.out.println("Telefono: " + contactos.get(nombre));
        } else {
            System.out.println("El contacto no existe.");
        }
    }
}
