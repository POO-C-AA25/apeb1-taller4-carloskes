
public class Problema1_EjecutorProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1000, 10);
        
        producto1.calcularDescuento(producto1.precioP, producto1.cantidadP);
        producto1.calcularPrecioFinal();
        
        System.out.println(producto1.toString());
    }
}
