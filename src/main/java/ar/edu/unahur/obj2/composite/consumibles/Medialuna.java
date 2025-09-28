package ar.edu.unahur.obj2.composite.consumibles;

public class Medialuna extends Comestible{
  private TipoMedialuna medialuna;
  
  public Medialuna(String nombre, Double precioBase, Integer pesoGr,TipoMedialuna medialuna) {
  super(nombre, precioBase, pesoGr);
  this.medialuna = medialuna;
  }

   @Override
    public Double doCosto() {
      return switch (medialuna) {
        case TipoMedialuna.DE_MANTECA -> 550.0;
        case TipoMedialuna.DE_GRASA -> 250.0;
        case TipoMedialuna.CON_DULCE_DE_LECHE -> 500.0;
        default -> 0.0;
      };
    }
    

}
