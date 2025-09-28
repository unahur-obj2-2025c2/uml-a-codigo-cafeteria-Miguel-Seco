package ar.edu.unahur.obj2.composite.consumibles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsumibleTest {
    
    Producto mediaManteca = new Medialuna("medialuna de manteca", 100.0, 50,TipoMedialuna.DE_MANTECA );
    Producto mediaGrasa = new Medialuna("medialuna de grasa", 150.0, 40,TipoMedialuna.DE_GRASA );
    Producto mediaDDL = new Medialuna("medialuna dulce de leche",200.0, 70,TipoMedialuna.CON_DULCE_DE_LECHE );
    Producto tostadojyq = new Tostado("tostado jyq", 1000.0, 300, TipoDeTostado.JAMON_Y_QUESO);
    Producto tostadosyq = new Tostado("tostado syq", 1200.0, 350, TipoDeTostado.SALAME_Y_QUESO);
    Producto cafeComun = new Cafe("cafe negro", 800.0, 500, false);
    Producto cafeConLeche = new Cafe("cafe con leche", 1000.0, 500, true);
    Producto jugo = new JugoDeNaranja("jugo naranja", 500.0, 600);
    Combo combo1 = new Combo("combo desayuno cafe 1", 2000.0);
    Combo combo2 = new Combo("combo desayuno cafe 2", 2000.0);
    Combo combo3 = new Combo("combo desayuno tostado 1", 2200.0);
    Combo combo4 = new Combo("combo desayuno tostado 2", 2200.0);
    Combo comboCompleto1 = new Combo("combo desayuno completo 1", 4000.0);
    Combo comboCompleto2 = new Combo("combo desayuno completo 2", 4000.0);
    List<Consumible> productosb = List.of(cafeComun,cafeConLeche,jugo);
    List<Consumible> productosc = List.of(mediaDDL,mediaGrasa,mediaManteca,tostadojyq,tostadosyq);
    Combo combo5 = new Combo("producto", 10000.0);


    @BeforeEach
    void inicio(){
        combo1.agregarProducto(cafeComun);
        combo1.agregarProducto(mediaManteca);
        combo2.agregarProducto(cafeConLeche);
        combo2.agregarProducto(mediaGrasa);
        combo3.agregarProducto(jugo);
        combo3.agregarProducto(tostadojyq);
        combo4.agregarProducto(jugo);
        combo4.agregarProducto(tostadosyq);
        comboCompleto1.agregarProducto(combo1);
        comboCompleto1.agregarProducto(combo3);
        comboCompleto1.agregarProducto(mediaDDL);
        comboCompleto2.agregarProducto(combo2);
        comboCompleto2.agregarProducto(combo4);
        comboCompleto2.agregarProducto(mediaDDL);

    }

    @Test
    public void obtenerNombreDeLasMedialunas(){
        assertEquals("medialuna de manteca", mediaManteca.getNombre());
        assertEquals("medialuna de grasa", mediaGrasa.getNombre());
        assertEquals("medialuna dulce de leche", mediaDDL.getNombre());
    }
    @Test
    public void obtenerNombreDeLosCafe(){
        assertEquals("cafe negro", cafeComun.getNombre());
        assertEquals("cafe con leche", cafeConLeche.getNombre());
    }

    @Test
    public void obtenerNombreDeLostostados(){
        assertEquals("tostado jyq", tostadojyq.getNombre());
        assertEquals("tostado syq", tostadosyq.getNombre());
    }

    @Test
    public void obtenerNombreDelJugoDeNaranja(){
        assertEquals("jugo naranja", jugo.getNombre());
    }

    @Test
    public void obtenerNombreDelosCombos(){
        assertEquals("combo desayuno cafe 1", combo1.getNombre());
        assertEquals("combo desayuno cafe 2", combo2.getNombre());
        assertEquals("combo desayuno tostado 1", combo3.getNombre());
        assertEquals("combo desayuno tostado 2", combo4.getNombre());
        assertEquals("combo desayuno completo 1", comboCompleto1.getNombre());
        assertEquals("combo desayuno completo 2", comboCompleto2.getNombre());
    }

    @Test
    public void calcular(){
        assertEquals("jugo naranja", jugo.getNombre());
    }

    



}
