
import java.util.Scanner;

public class Problema3_EjecutorAutobus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes desea registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); 

        Problema3_Autobus[] estudiantes = new Problema3_Autobus[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEstudiante #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Grado: ");
            String grado = sc.nextLine();

            System.out.print("¿Tiene permiso? 1 = SI / 2 = NO: ");
            int opcionPermiso = sc.nextInt();
            sc.nextLine();

            estudiantes[i] = new Problema3_Autobus(nombre, grado, opcionPermiso);
        }

        int aceptados = 0;
        int rechazados = 0;

        System.out.println("\n--- Verificación de permiso ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(estudiantes[i].toString());

            if (estudiantes[i].tienePermiso()) {
                System.out.println("Permiso: Sí");
                System.out.println("Puede subir al bus\n");
                aceptados++;
            } else {
                System.out.println("Permiso: No");
                System.out.println("No puede subir al bus\n");
                rechazados++;
            }
        }

        System.out.println("--- Resumen del día ---");
        System.out.println("Permisos aceptados: " + aceptados);
        System.out.println("Permisos rechazados: " + rechazados);

        sc.close();
    }
}

