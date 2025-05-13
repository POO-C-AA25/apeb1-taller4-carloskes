class Problema5_Persona {
    public String nombre;
    public double peso;
    public int duracion;
    public int tipoEjercicio; 
    public double calorias;

    public Problema5_Persona(String nombre, double peso, int duracion, int tipoEjercicio) {
        this.nombre = nombre;
        this.peso = peso;
        this.duracion = duracion;
        this.tipoEjercicio = tipoEjercicio;
        this.calorias = 0;
    }

    public void calcularCalorias() {
        double factor = 0;
        if (tipoEjercicio == 1) {
            factor = 0.08; // Cardio
        } else if (tipoEjercicio == 2) {
            factor = 0.06; // Pesas
        } else if (tipoEjercicio == 3) {
            factor = 0.09; // Crossfit
        }
        calorias = peso * duracion * factor;
    }

    public double getCalorias() {
        return calorias;
    }

    public String toString() {
        String tipo = (tipoEjercicio == 1) ? "Cardio" :
                      (tipoEjercicio == 2) ? "Pesas" : "Crossfit";

        return "Nombre: " + nombre +
               "\nPeso: " + peso + " kg" +
               "\nDuración: " + duracion + " min" +
               "\nEjercicio: " + tipo +
               "\nCalorías quemadas: " + String.format("%.2f", calorias);
    }
}
