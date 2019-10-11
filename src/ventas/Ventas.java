package ventas;
import com.gm.ventas.*;
public class Ventas {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Camiseta", 30);
        Producto producto3 = new Producto("Guantes", 60);
        Producto producto4 = new Producto("Calzones", 20);
        Producto producto5 = new Producto("Chaqueta", 300);
        Producto producto6 = new Producto("Calcetines", 60);
        Producto producto7 = new Producto("Bufanda", 10);
        Producto producto8 = new Producto("Collar", 25);
        Producto producto9 = new Producto("Pulsera", 0.5);
        Producto producto10 = new Producto("Anillo", 3);
        Producto producto11 = new Producto("Corbata", 60);
        Producto producto12 = new Producto("Corbatin", 80);
        Producto producto13 = new Producto("Corbatina", 100);

        Orden orden1 = new Orden();

        //Agregamos los productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);
        orden1.agregarProducto(producto10);
        orden1.agregarProducto(producto11);
        orden1.agregarProducto(producto12);
        orden1.agregarProducto(producto13);


        //Imprimir
        orden1.mostrarOrden();
    }
}
