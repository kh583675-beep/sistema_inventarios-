public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto tv = new Electronico("Television 50 pulgadas", 8000, 10, 12);
        Producto laptop = new Electronico("Laptop Gamer", 15000, 5, 24);
        Producto leche = new Alimento("Leche Entera", 25, 50, "2026-12-01");
        Producto pan = new Alimento("Pan Integral", 40, 30, "2026-07-30");

        inventario.agregarProducto(tv);
        inventario.agregarProducto(laptop);
        inventario.agregarProducto(leche);
        inventario.agregarProducto(pan);

        inventario.mostrarInventario();
    }
}
