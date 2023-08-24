package com.example;

import java.sql.Date;

public class Relogio {

	private int horas;
    private int minutos;
    private int segundos;
    private Date tempoInicioCronometro;
    private Date tempoFimCronometro;

    public Relogio() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
        
    }
    
    public String getHorario() {
    	 return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

	public void programarHorario(int horas, int minutos, int segundos) {
		 this.horas = horas;
	     this.minutos = minutos;
	     this.segundos = segundos;
		
	}

	public void reiniciarParaMeiaNoite() {
		this.horas = 0;
	    this.minutos = 0;
	    this.segundos = 0;
		
	}
	
	 public void marcarInicioCronometro(int horas, int minutos, int segundos) {
		 
	     
	    }

	 public void marcarFimCronometro(int horas, int minutos, int segundos) {
	    
	    }
	 
	 public String getTempoDecorridoCronometro() {
		 
	 }
    
}
