class Problema4_Visitante {
    public String nombre;
    public int edad;
    public double altura;
    public boolean accesoPermitido;

    public Problema4_Visitante(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.accesoPermitido = false; // se verifica después
    }

    public void verificarAcceso() {
        if (edad >= 12 && altura >= 1.4) {
            accesoPermitido = true;
        }
    }

    public boolean tieneAcceso() {
        return accesoPermitido;
    }

    public String toString() {
        String estado = accesoPermitido ? "ACCESO PERMITIDO" : "ACCESO DENEGADO";
        return "Nombre: " + nombre +
               "\nEdad: " + edad +
               "\nAltura: " + altura + " m" +
               "\nEstado: " + estado;
    }
}