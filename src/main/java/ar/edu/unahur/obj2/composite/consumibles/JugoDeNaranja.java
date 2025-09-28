package ar.edu.unahur.obj2.composite.consumibles;

public class JugoDeNaranja extends Bebible{

    public JugoDeNaranja(String nombre, Double precioBase, Integer capacidadML) {
        super(nombre, precioBase, capacidadML);
    }

    @Override
    protected Double doCosto() {
        return this.capacidadML / this.precioBase; 
    }
    

}
