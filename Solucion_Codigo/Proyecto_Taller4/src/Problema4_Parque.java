class Problema4_Parque {
    public Problema4_Visitante[] visitantes;
    public int contador;

    public Problema4_Parque(int capacidad) {
        visitantes = new Problema4_Visitante[capacidad];
        contador = 0;
    }

    public void registrarVisitante(Problema4_Visitante visitante) {
        if (contador < visitantes.length) {
            visitante.verificarAcceso();
            visitantes[contador] = visitante;
            contador++;
        }
    }

    public void mostrarResultados() {
        int permitidos = 0;
        int rechazados = 0;

        System.out.println("\n--- RESULTADOS ---");
        for (int i = 0; i < contador; i++) {
            System.out.println(visitantes[i].toString() + "\n");
            if (visitantes[i].tieneAcceso()) {
                permitidos++;
            } else {
                rechazados++;
            }
        }

        System.out.println("--- RESUMEN DEL PARQUE ---");
        System.out.println("Total permitidos: " + permitidos);
        System.out.println("Total rechazados: " + rechazados);
    }
}
