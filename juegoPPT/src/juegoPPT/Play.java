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
					winner =  2;
				} else {
					winner =  1;
				}
				break;
			case 2:
				if (cpuOption==1) {
					winner =  1;
				} else {
					winner =  2;
				}
				break;
				
			case 3:
				if (cpuOption==1) {
					winner =  2;
				} else {
					winner =  1;
				}
				break;
			}
			
		}
		
		return winner;
		
	}

}
