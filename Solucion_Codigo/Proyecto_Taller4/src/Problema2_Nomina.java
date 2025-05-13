class Problema2_Nomina{
    public String nombre;
    public double salario;
    public int edad;

    public Problema2_Nomina(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public double obtenerSalario() {
        return salario;
    }

    public void aplicarAumento(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }
    
    public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Salario: $" + String.format("%.2f", salario));
}


    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nEdad: " + edad +
               "\nSalario: $" + String.format("%.2f", salario);
    }
}

