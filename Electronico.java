public class Electronico extends Producto implements Vendible {
    private int garantiaMeses;

    public Electronico(String nombre, double precio, int stock, int garantiaMeses) {
        super(nombre, precio, stock);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 0.85; // 15% descuento
    }

    @Override
    public String obtenerCategoria() {
        return "ELECTRONICO";
    }

    @Override
    public String toString() {
        return "ELECTRONICO: " + nombre + " | Precio final: $" + calcularPrecioFinal() + " | Garantia: " + garantiaMeses + " meses";
    }
}
