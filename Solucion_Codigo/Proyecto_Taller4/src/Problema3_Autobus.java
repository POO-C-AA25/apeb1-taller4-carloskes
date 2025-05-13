public class Problema3_Autobus {
    public String nombre;
    public String grado;
    public boolean permisoVigente;

    public Problema3_Autobus(String nombre, String grado, int permiso) {
        this.nombre = nombre;
        this.grado = grado;
        this.permisoVigente = (permiso == 1);
    }

    public boolean tienePermiso() {
        return permisoVigente;
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre +
               "\nGrado: " + grado;
    }
}