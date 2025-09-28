package ar.edu.unahur.obj2.composite.consumibles;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Consumible {
    private String nombre;
    private Double precio;
    private List<Consumible> productos;

    

    public Combo(String nombre, Double precio, List<Consumible> productos) {
        this.nombre = nombre;
        this.precio = precio;
        this.productos = productos;
    }



    public Combo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.productos = new ArrayList<Consumible>();
    }

    public void agregarProducto(Consumible producto){
        productos.add(producto);
    }

    public void eliminarProducto(Consumible producto){
        productos.remove(producto);
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }



    @Override
    public Double costo() {
        return Double.min(this.precio, this.costoDeConsumibles());
    }

    public Double costoDeConsumibles(){
        return productos.stream().mapToDouble(p -> p.costo()).sum();
    }

}
