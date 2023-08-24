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
    
}
