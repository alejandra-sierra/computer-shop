package org.factoriaf5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TiendaTest {
@Test
    public void testAgregarComputador() {
        Tienda tienda = new Tienda("TechStore", "Juan Pérez", "123456789");
        Computador pc = new Computador("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        
        tienda.agregarComputador(pc);
        assertEquals(1, tienda.listarComputadores().size());
    }

    @Test
    public void testEliminarComputador() {
        Tienda tienda = new Tienda("TechStore", "Juan Pérez", "123456789");
        Computador pc = new Computador("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        
        tienda.agregarComputador(pc);
        tienda.eliminarComputador("Dell");
        assertEquals(0, tienda.listarComputadores().size());
    }

    @Test
    public void testBuscarComputador() {
        Tienda tienda = new Tienda("TechStore", "Juan Pérez", "123456789");
        Computador pc = new Computador("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        
        tienda.agregarComputador(pc);
        Computador buscado = tienda.buscarComputador("Dell");
        assertNotNull(buscado);
        assertEquals("Dell", buscado.getMarca());
    }
}

