package juegoPPT;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random randomNum = new Random();
		int option, cpuOption, playerWs = 0, cpuWs=0, winner;
		int playerGs = 0, cpuGs = 0, counter, difficulty = 1;
		List<String> games = new ArrayList<String>();
		
		System.out.println("Introduce tu nombre:");
		String player = sc.nextLine();

		System.out.println("\nHOLA " + player.toUpperCase());

		do {
			System.out.println("\nELIGE UNA OPCIÓN\n");
			System.out.println("1 - Jugar");
			System.out.println("2 - Historial de partidas");
			System.out.println("3 - Configuración");
			System.out.println("4 - Salir");

			option = sc.nextInt();

			switch (option) {
			case 1:
				do {
					System.out.println("\nMARCADOR\n--------\n"+player.toUpperCase()+": "+playerWs+" CPU:"+cpuWs+"\n\n");
					
					do {
						System.out.println("Haz tu elección:\n\n1 - PIEDRA   2 - PAPEL   3 - TIJERAS");
						option = sc.nextInt();
						cpuOption = randomNum.nextInt(3)+1;
						
						if(option<1 || option>3) {
							System.out.println("\nOPCIÓN NO VÁLIDA\n");
						}
					} while(option<1 || option>3);
					
					System.out.println("TU ELECCIÓN\tCPU\n-----------\t---");
					
					getOptionName(option);
					
					getOptionName(cpuOption);
					
					winner = Play.getWinner(option, cpuOption, difficulty);
					
					if (winner==1) {
						System.out.println("YOU WIN!\n");
						playerWs++;
					} else if (winner==2){
						System.out.println("CPU WINS...\n");
						cpuWs++;
					} else {
						System.out.println("EMPATE!\n");
					}
					
				} while (playerWs!=5 && cpuWs!=5);
				
				if(playerWs==5) {
					games.add("YOU WIN "+playerWs+" - "+cpuWs+"!!!");
					System.out.println("\n"+games.get(games.size()-1));
					System.out.println("---------------------------------------------------------------\n");
					playerGs++;
					playerWs=0;
					cpuWs=0;
				} else {
					games.add("CPU WINS "+cpuWs+" - "+playerWs+"...");
					System.out.println("\n"+games.get(games.size()-1));
					System.out.println("---------------------------------------------------------------\n");
					cpuGs++;
					playerWs=0;
					cpuWs=0;
				}
				break;
			case 2:
				counter=1;
				System.out.println("\nHISTORIAL DE PARTIDAS\n---------------------\n");
				System.out.println("TU CONTADOR\tCPU\n-----------\t---");
				System.out.println(playerGs+"\t\t"+cpuGs+"\n");
				
				if(!games.isEmpty()) {
					
					for (String game : games) {
						
						System.out.println("Partida "+counter+": "+game);
						counter++;
					}
					
				} else {
					System.out.println("Todavía no has jugado ninguna partida\n");
				}
				
				

				break;
			case 3:
				
				do {
					
					System.out.println("ELIGE LA DIFICULTAD\n-------------------\n");
					System.out.println("1 - NORMAL  2- DIFICIL  3 - EXPERTO");
					
					difficulty = sc.nextInt();
					
				} while (difficulty<1 || difficulty>3);
				
				break;
			case 4:
				System.out.println("\nHASTA LUEGO!");
				break;
			default:
				System.out.println("\nOPCION NO VÁLIDA\n");
				break;
			}

		} while (option < 1 || option > 4 || option != 4);

		sc.close();
	}

	private static void getOptionName(int option) {
		switch(option) {
		case 1:
			System.out.print("PIEDRA\t\t");
			break;
		case 2:
			System.out.print("PAPEL\t\t");
			break;
		case 3:
			System.out.print("TIJERAS\t\t");
			break;
		}
	}

}
