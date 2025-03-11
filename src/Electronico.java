public class Electronico extends Producto {
    private int garantia; // En meses

    public Electronico(String nombre, double precio, int cantidad, int garantia) {
        super(nombre, precio, cantidad);
        this.garantia = garantia;
    }

    public void extenderGarantia(int meses) {
        this.garantia += meses;
        System.out.println("Garantía extendida a " + garantia + " meses.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Garantía: " + garantia + " meses");
    }
}
