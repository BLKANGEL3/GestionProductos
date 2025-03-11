public class Producto {
    protected String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El precio ha sido actualizado a: " + nuevoPrecio);
    }

    public void actualizarStock(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
        System.out.println("El stock ha sido actualizado a: " + nuevaCantidad);
    }

}
