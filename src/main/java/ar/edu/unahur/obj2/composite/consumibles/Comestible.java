package ar.edu.unahur.obj2.composite.consumibles;

public abstract class Comestible extends Producto {
    protected Integer pesoGr;

    public Comestible(String nombre, Double precioBase, Integer pesoGr) {
        super(nombre, precioBase);
        this.pesoGr = pesoGr;
    }
    
    public Double costo(){
        return pesoGr * this.doCosto();
    }

    public abstract Double doCosto();

}
