public class Electronico extends Producto implements Descuento {
    private int garantia;

    public Electronico(String nombre, double precio, int cantidad, int garantia) {
        super(nombre, precio, cantidad);
        this.garantia = garantia;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en stock: " + cantidad);
        System.out.println("Garantía: " + garantia + " meses");
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
}
