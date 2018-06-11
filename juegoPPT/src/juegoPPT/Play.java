package juegoPPT;


public class Play {
	
	/**
	 * 
	 * @param option
	 * @param cpuOption
	 * @return 0 si se ha empatado, 1 si gana usuario y 2 si gana CPU
	 * 
	 */
	
	public static int getWinner(int option, int cpuOption, int diff) {
		int winner=0;
		
		if (!(option==cpuOption)) {
			switch (option) {
			case 1:
				if (cpuOption==2) {
					System.out.println("CPU WINS...\n");
					winner =  2;
				} else {
					System.out.println("YOU WIN!\n");
					winner =  1;
				}
				break;
			case 2:
				if (cpuOption==1) {
					System.out.println("YOU WIN!\n");
					winner =  1;
				} else {
					System.out.println("CPU WINS...\n");
					winner =  2;
				}
				break;
				
			case 3:
				if (cpuOption==1) {
					System.out.println("CPU WINS...\n");
					winner =  2;
				} else {
					System.out.println("YOU WIN!\n");
					winner =  1;
				}
				break;
			}
			
		} else {
			System.out.println("EMPATE!\n");
		}		
		
		return winner;
		
	}

}
