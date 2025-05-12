class Problema3_Autobus {
    public String nombre;
    public String grado;
    public int permiso;

    public Problema3_Autobus(String nombre, String grado, int permiso) {
        this.nombre = nombre;
        this.grado = grado;
        this.permiso = permiso;
    }

    public int tienePermiso() {
        return permiso;
    }

    @Override
    public String toString() {
        String textoPermiso;
        if (permiso == 1) {
            textoPermiso = "Sí";
        } else {
            textoPermiso = "No";
        }

        return "Estudiante: "      + nombre +
               "\nGrado: "         + grado +
               "\nPermiso vigente: " + textoPermiso;
    }
}