public class Main {
	
	public static void Main(String[] args) {
		
		Simulation.importData(args[1]); //importa totes les dades a les classes corresponents
		
		
		while (true) {
			//rebre input de l'usuari per llegir vacunes i confinaments
			
			Simulation.tick();
			
			Simulation.showInformation();
		}
		
	}
	
}
