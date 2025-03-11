public class Tienda {
    public static void main(String[] args) {
        Electronico laptop = new Electronico("Laptop", 12000.50, 5, 12);
        Alimento pan = new Alimento("Pan Bimbo", 45.99, 20, "01/03/2025");

        // Mostrar información de productos
        laptop.mostrarInformacion();
        laptop.extenderGarantia(6);

        System.out.println();

        pan.mostrarInformacion();
        pan.verificarCaducidad();

    }
}
