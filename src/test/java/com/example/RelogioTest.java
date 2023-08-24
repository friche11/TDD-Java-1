package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RelogioTest {
	
private Relogio relogio;
	    
	@BeforeEach
	public void setUp() {
	    relogio = new Relogio();
	}

	@Test
	public void testHorarioPadraoConstrutor() {
		assertEquals("00:00:00", relogio.getHorario());
	}

	@Test
    public void testProgramarHorario() {
        relogio.programarHorario(5, 24, 8);
        assertEquals("05:24:08", relogio.getHorario());
    }
	
	@Test
    public void testReiniciarParaMeiaNoite() {
        relogio.programarHorario(24, 12, 0);
        relogio.reiniciarParaMeiaNoite();
        assertEquals("00:00:00", relogio.getHorario());
    }
}
