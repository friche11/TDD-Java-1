package com.example;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Relogio relogio = new Relogio();
		Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Programar Horário");
            System.out.println("2. Reiniciar horário para meia noite");
            System.out.println("3. Marcar intervalo de tempo");
            System.out.println("4. Obter Horário Atual");
            System.out.println("5. Transformar horário para formato AM PM");
            System.out.println("6. Transformar horário para formato 24 horas");
            System.out.println("7. Atualizar horário de acordo com o Sistema Operacional");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe as horas: ");
                    int horas = scanner.nextInt();
                    System.out.print("Informe os minutos: ");
                    int minutos = scanner.nextInt();
                    System.out.print("Informe os segundos: ");
                    int segundos = scanner.nextInt();
                    relogio.programarHorario(horas, minutos, segundos);
                    System.out.println("Horário programado com sucesso.");
                    break;
                case 2:
                    relogio.reiniciarParaMeiaNoite();
                    System.out.println("Horário resetado para meia-noite(00:00:00).");
                    break;
                case 3:
                	System.out.println("Digite o horário de início.");
                	System.out.println("Informe as horas de início");
                	int horas2 = scanner.nextInt();
                    System.out.print("Informe os minutos de início: ");
                    int minutos2 = scanner.nextInt();
                    System.out.print("Informe os segundos de início: ");
                    int segundos2 = scanner.nextInt();
                	relogio.marcarInicioCronometro(horas2, minutos2, segundos2);
                	System.out.println("Digite o horário de término.");
                	System.out.println("Informe as horas de término");
                	int horas3 = scanner.nextInt();
                    System.out.print("Informe os minutos de término: ");
                    int minutos3 = scanner.nextInt();
                    System.out.print("Informe os segundos de término: ");
                    int segundos3 = scanner.nextInt();
                    relogio.marcarFimCronometro(horas3, minutos3, segundos3);
                	System.out.println("Tempo decorrido entre os horários é:");
                	relogio.getTempoDecorridoCronometro();
                    break;
                case 4:
                    String horarioAtual = relogio.getHorario();
                    System.out.println("Horário atual: " + horarioAtual);
                    break;
                case 5:
                	relogio.setFormatoAMPM(true);
                	System.out.println("Horário agora é " +relogio.getHorario());
                	break;
                case 6:
                	relogio.setFormatoAMPM(false);
                	System.out.println("Horário agora é " +relogio.getHorario());
                	break;
                case 7:
                	relogio.atualizarHorario();
                	relogio.getHorario();
                	break;
                case 8:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

	}


