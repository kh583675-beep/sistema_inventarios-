import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void mostrarInventario() {
        System.out.println("\n--- INVENTARIO COMPLETO ---");
        for (Producto p : productos) {
            System.out.println(p.toString() + " | Categoria: " + p.obtenerCategoria());
        }
    }
}
