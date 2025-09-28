package ar.edu.unahur.obj2.composite.consumibles;

public class Tostado extends Comestible{
    private TipoDeTostado tostado;

    public Tostado(String nombre, Double precioBase, Integer pesoGr, TipoDeTostado tostado) {
        super(nombre, precioBase, pesoGr);
        this.tostado = tostado;
    }

    @Override
    public Double doCosto() {
      return switch (tostado) {
        case TipoDeTostado.JAMON_Y_QUESO -> 400.0;
        case TipoDeTostado.SALAME_Y_QUESO -> 600.0;
        default -> 0.0;
      };
    }

    

}
