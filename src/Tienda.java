public class Tienda {
    public static void main(String[] args) {
        Producto[] inventario = {
                new Electronico("Laptop", 15000, 5, 24),
                new Alimento("Leche", 20, 50, "15/04/2025"),
                new Ropa("Camiseta", 300, 10, "M")
        };

        for (Producto p : inventario) {
            p.mostrarInformacion();
            System.out.println();
        }
    }
}
