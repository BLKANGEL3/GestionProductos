public class Ropa extends Producto implements Descuento {
    private String talla;

    public Ropa(String nombre, double precio, int cantidad, String talla) {
        super(nombre, precio, cantidad);
        this.talla = talla;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en stock: " + cantidad);
        System.out.println("Talla: " + talla);
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
}
