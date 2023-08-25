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
	
	@Test
	public void testTempoDecorrido() {
		relogio.marcarInicioCronometro(10, 30, 45);
		relogio.marcarFimCronometro(11, 46, 15);
		String tempoDecorrido = relogio.getTempoDecorridoCronometro();
		assertEquals("01:15:30", tempoDecorrido);
	}
	
	@Test
    public void testFormato24Horas() {
        relogio.programarHorario(15, 45, 59);
        assertEquals("15:45:59", relogio.getHorario());
    }
    
    @Test
    public void testFormatoAMPM() {
        relogio.programarHorario(20, 0, 10);
        relogio.setFormatoAMPM(true);
        assertEquals("08:00:10 PM", relogio.getHorario());
    }
    
    @Test
    public void testAtualizarHorario() {
    	 java.util.Date agora = new java.util.Date();
    	 int horas = agora.getHours();
         int minutos = agora.getMinutes();
         int segundos = agora.getSeconds();
         
         // Obtenha a representação esperada da hora atual em formato de String
         String horaAtualEsperada = String.format("%02d:%02d:%02d", horas, minutos, segundos);

         // Obtenha o horário atual do relógio como uma String
         relogio.programarHorario(horas,minutos,segundos);
         String horarioAtual = relogio.getHorario();

         // Verifique se o horário atual do relógio é igual ao esperado
         assertEquals(horaAtualEsperada, horarioAtual);
    }
    
}
