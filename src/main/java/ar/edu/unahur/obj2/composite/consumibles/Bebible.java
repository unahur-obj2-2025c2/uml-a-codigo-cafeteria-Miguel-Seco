package ar.edu.unahur.obj2.composite.consumibles;

public abstract class Bebible extends Producto {
    protected Integer capacidadML;

    public Bebible(String nombre, Double precioBase, Integer capacidadML) {
        super(nombre, precioBase);
        this.capacidadML = capacidadML;
    }
    

    
    public Double costo(){
        return this.doCosto() * capacidadML;
    }
    
    protected abstract Double doCosto();

    

}
