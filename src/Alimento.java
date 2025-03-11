public class Alimento extends Producto {
    private String fechaCaducidad;

    public Alimento(String nombre, double precio, int cantidad, String fechaCaducidad) {
        super(nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }

    public void verificarCaducidad() {
        System.out.println("La fecha de caducidad del producto " + nombre + " es: " + fechaCaducidad);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
    }
}
