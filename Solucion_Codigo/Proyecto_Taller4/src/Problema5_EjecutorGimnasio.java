import java.util.Scanner;

public class Problema5_EjecutorGimnasio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas personas desea registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Problema5_Gimnasio gimnasio = new Problema5_Gimnasio(cantidad);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nPersona #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();

            System.out.print("Duración de ejercicio (min): ");
            int duracion = sc.nextInt();

            System.out.print("Tipo de ejercicio (1 = Cardio, 2 = Pesas, 3 = Crossfit): ");
            int tipo = sc.nextInt();
            sc.nextLine();

            Problema5_Persona persona = new Problema5_Persona(nombre, peso, duracion, tipo);
            gimnasio.registrarPersona(persona);
        }

        gimnasio.mostrarResultados();

        sc.close();
    }
}
