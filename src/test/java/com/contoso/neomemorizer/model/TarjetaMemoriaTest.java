package com.contoso.neomemorizer.model;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


public class TarjetaMemoriaTest {

    @Test
    public void testTarjetaModel() {
        TarjetaMemoria tarjeta = new TarjetaMemoria();
        tarjeta.setId(123);
        tarjeta.setNumero(1);
        tarjeta.setPalabra("Te");
        tarjeta.setImagen("uno.jpg");
        assertEquals("Te", tarjeta.getPalabra());
        assertEquals(1, tarjeta.getNumero());
        assertEquals("uno.jpg", tarjeta.getImagen());
        assertEquals(123, tarjeta.getId());

    }
    

}