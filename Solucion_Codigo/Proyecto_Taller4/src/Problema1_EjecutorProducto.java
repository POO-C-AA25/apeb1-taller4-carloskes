
public class Problema1_EjecutorProducto {
    Producto producto1= new Producto(1000,10);
    producto1.calcularDescuento(producto1.precioP, producto1.cantidadP);
}

class Producto {

    public double precioP;
    public int cantidadP;
    public double descuento;
    public double precioFinal;
    public double montoD;
    public Producto() {

    }

    public Producto(double precioP, int cantidadP) {
        this.precioP = precioP;
        this.cantidadP = cantidadP;
    }

    public double calcularDescuento(double precioP, int cantidadP) {
        this.descuento=(this.precioP>=1000&& this.cantidadP >=10)?(10):(5);
        this.montoD=(this.cantidadP*this.precioP) *(this.descuento/100);
        return this.montoD;
    }
    public double calcularPrecioFinal{
    this.precioFinal= (this.precioP)
    return this.PrecioFinal;
}
}
