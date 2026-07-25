public class Alimento extends Producto implements Vendible {
    private String fechaCaducidad;

    public Alimento(String nombre, double precio, int stock, String fechaCaducidad) {
        super(nombre, precio, stock);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 0.95; // 5% descuento
    }

    @Override
    public String obtenerCategoria() {
        return "ALIMENTO";
    }

    @Override
    public String toString() {
        return "ALIMENTO: " + nombre + " | Precio final: $" + calcularPrecioFinal() + " | Caduca: " + fechaCaducidad;
    }
}
