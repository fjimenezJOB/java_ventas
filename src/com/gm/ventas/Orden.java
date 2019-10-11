package com.gm.ventas;
public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        productos = new Producto[MAX_PRODUCTOS];
    }
    public void agregarProducto(Producto producto){
        // Si los nuevos productos agregados no superan el maximo de productos
        // agregamos el nuevo producto al arreglo.
        if(contadorProductos < MAX_PRODUCTOS){
            //agregamos el nuevo producto al arreglo
            //incrementamos el contador de productos
            productos[contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo de productos. El maximo es: "+MAX_PRODUCTOS);
        }
    }
    public double calcularTotal(){
        double total = 0;
        for(int i= 0; i < contadorProductos; i++){
            total += productos[i].getPrecio(); //total = total + precios de los productos
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("Orden #:" +idOrden);
        System.out.println("total de la orden: $"+calcularTotal());
        System.out.println("Productos en la orden:");
        for(int i =0; i < contadorProductos; i++){
            System.out.println(productos[i]);
        }
    }
}
