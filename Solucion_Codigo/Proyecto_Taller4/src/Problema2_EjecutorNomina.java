import java.util.Scanner;

public class Problema2_EjecutorNomina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Capacidad máxima de empleados? ");
        int capacidad = sc.nextInt();
        sc.nextLine();

        Problema2_Nomina[] empleados = new Problema2_Nomina[capacidad];
        int contador = 0;

        int opcion;
        do {

            System.out.println("\n--- Menú Nómina ---");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Calcular y aplicar aumento");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (contador >= capacidad) {
                        System.out.println("Capacidad llena, no se puede agregar más.");
                    } else {
  
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Salario: ");
                        double salario = sc.nextDouble();
                        System.out.print("Edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine();
                        empleados[contador++] = new Problema2_Nomina(nombre, salario, edad);
                        System.out.println("Empleado agregado (total: " + contador + ").");
                    }
                    break;

                case 2:

                    if (contador == 0) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        System.out.println("\n--- Empleados Registrados ---");
                        for (int i = 0; i < contador; i++) {
                            System.out.println(empleados[i] + "\n");
                        }
                    }
                    break;

                case 3:

                    if (contador == 0) {
                        System.out.println("Debe agregar al menos un empleado primero.");
                    } else {
                        double suma = 0;
                        for (int i = 0; i < contador; i++) {
                            suma += empleados[i].obtenerSalario();
                        }
                        double promedio = suma / contador;
                        System.out.printf("Salario promedio actual: $%.2f%n", promedio);

                        System.out.print("Porcentaje de aumento para salarios: ");
                        double pct = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("\nAplicando aumentos...");
                        for (int i = 0; i < contador; i++) {
                            if (empleados[i].obtenerSalario() < promedio) {
                                empleados[i].aplicarAumento(pct);
                                System.out.println("→ " + empleados[i].toString() + "\n");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }
}