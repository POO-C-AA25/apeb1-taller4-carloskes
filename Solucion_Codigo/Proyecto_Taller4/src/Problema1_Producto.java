class Producto {

    public double precioP;
    public int cantidadP;
    public double descuento;
    public double precioFinal;
    public double montoD;

    public Producto(double precioP, int cantidadP) {
        this.precioP = precioP;
        this.cantidadP = cantidadP;
    }

    public double calcularDescuento(double precioP, int cantidadP) {
        this.descuento = (this.precioP >= 1000 && this.cantidadP >= 10) ? (10) : (5);
        this.montoD = (this.cantidadP * this.precioP) * (this.descuento / 100);
        return this.montoD;
    }

    public double calcularPrecioFinal() {
        this.precioFinal = (this.cantidadP * this.precioP) - this.montoD;
        return this.precioFinal;
    }

    public String toString() {
        return "Precio unitario: " + precioP
                + "\nCantidad: " + cantidadP
                + "\nDescuento aplicado: " + descuento + "%"
                + "\nMonto de descuento: " + montoD
                + "\nPrecio final: " + precioFinal;
    }
}
