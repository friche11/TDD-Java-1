package com.example;

import java.sql.Date;
import java.time.Duration;
import java.time.LocalTime;

public class Relogio {

	private int horas;
    private int minutos;
    private int segundos;
    private LocalTime tempoInicioCronometro;
    private LocalTime tempoFimCronometro;
	private boolean formatoAMPM;

    public Relogio() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
        this.formatoAMPM = false;
    }
    
    public String getHorario() {
    	
    	String ampm;
    	int hora12;
    	
    if(formatoAMPM) {
    	if (horas >= 12) {
    	    ampm = "PM";
    	    if (horas > 12) {
    	        hora12 = horas - 12;
    	    } else {
    	        hora12 = 12;
    	    }
    	} else {
    	    ampm = "AM";
    	    if (horas == 0) {
    	        hora12 = 12;
    	    } else {
    	        hora12 = horas;
    	    }
    	}
    	return String.format("%02d:%02d:%02d %s", hora12, minutos, segundos, ampm);
    }
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
		 tempoInicioCronometro = LocalTime.of(horas, minutos, segundos);
	    }

	 public void marcarFimCronometro(int horas, int minutos, int segundos) {
		 tempoFimCronometro = LocalTime.of(horas, minutos, segundos);
	    }
	 
	 public String getTempoDecorridoCronometro() {
		 if (tempoInicioCronometro == null || tempoFimCronometro == null) {
	            return "Tempo não marcado";
	        }
		 
		 	Duration duracao = Duration.between(tempoInicioCronometro, tempoFimCronometro);

	        long horas = duracao.toHours();
	        long minutos = duracao.toMinutesPart();
	        long segundos = duracao.toSecondsPart();

	        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
	 }

	public void setFormatoAMPM(boolean formatoAMPM) {
		 this.formatoAMPM = formatoAMPM;
		
	}
	
	public void atualizarHorario() {
        // Obtenha a hora atual do sistema
        java.util.Date agora = new java.util.Date();
        
        // Atualiza as horas, minutos e segundos do relógio com a hora do sistema
        this.horas = agora.getHours();
        this.minutos = agora.getMinutes();
        this.segundos = agora.getSeconds();
        
    }
    
	
}
