class Problema5_Gimnasio {
    public Problema5_Persona[] personas;
    public int contador;

    public Problema5_Gimnasio(int capacidad) {
        personas = new Problema5_Persona[capacidad];
        contador = 0;
    }

    public void registrarPersona(Problema5_Persona persona) {
        if (contador < personas.length) {
            persona.calcularCalorias();
            personas[contador] = persona;
            contador++;
        }
    }

    public void mostrarResultados() {
        double total = 0;
        System.out.println("\n--- Resultados individuales ---");
        for (int i = 0; i < contador; i++) {
            System.out.println(personas[i].toString() + "\n");
            total += personas[i].getCalorias();
        }

        System.out.println("--- Resumen total ---");
        System.out.println("Calorías totales quemadas por todos: " + String.format("%.2f", total));
    }
}
