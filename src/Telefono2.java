import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Telefono2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<String>> contactos = new HashMap<>();
        ArrayList<String> telefonosDiego = new ArrayList<>();
        telefonosDiego.add("612345678");
        telefonosDiego.add("623456789");
        ArrayList<String> telefonosJuan = new ArrayList<>();
        telefonosJuan.add("634567890");
        telefonosJuan.add("645678901");
        contactos.put("Diego", telefonosDiego);
        contactos.put("Juan", telefonosJuan);
        System.out.print("Introduce el nombre del contacto: ");
        String nombre = sc.nextLine();
        mostrarTelefonos(contactos, nombre);
        sc.close();
    }
    public static void mostrarTelefonos(HashMap<String, ArrayList<String>> contactos, String nombre) {
        if (contactos.containsKey(nombre)) {
            System.out.println("Telefonos de " + nombre + ":");
            for (String telefono : contactos.get(nombre)) {
                System.out.println(telefono);
            }
        } else {
            System.out.println("El contacto no existe.");
        }
    }
}
