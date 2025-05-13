import java.util.Scanner;

public class Problema4_EjecutorParque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cuántos visitantes desea registrar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Problema4_Parque parque = new Problema4_Parque(cantidad);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nVisitante #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            System.out.print("Altura (en metros): ");
            double altura = sc.nextDouble();
            sc.nextLine();

            Problema4_Visitante visitante = new Problema4_Visitante(nombre, edad, altura);
            parque.registrarVisitante(visitante);
        }

        parque.mostrarResultados();

        sc.close();
    }
}