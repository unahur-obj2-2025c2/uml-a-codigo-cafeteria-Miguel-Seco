package ar.edu.unahur.obj2.composite.consumibles;

public class Cafe extends Bebible {
    private Boolean conLeche;

    public Cafe(String nombre, Double precioBase, Integer capacidadML, Boolean conLeche) {
        super(nombre, precioBase, capacidadML);
        this.conLeche = conLeche;
    }

    @Override
    protected Double doCosto() {
        return conLeche ? 5.0 : 0.0;
    }

    

}
