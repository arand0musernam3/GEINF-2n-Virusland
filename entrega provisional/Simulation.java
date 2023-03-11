public static class Simulation {
	
	//calcula cada tick i gestiona les operacions que s'han de fer a nivell de simulació
	public static void tick() {
		
        //eliminarà les vacunes que no tenen efecte, les vacunes s'aplicaran directament amb la funció addVaccine()
		updateVaccines();
    
        // els confinaments s'aplicaran directament amb les funcions setLockdown() i setHarshLockdown()
		
		returnInhabitants();
		
		migrateInhabitants();
		
		propagateViruses();
        
        calculateMutations();
        
        
        // els resultats es podràn veure des del main tick a tick amb la funció pública showInformation()
		
		//des del main es llegeixen les vacunes i confinaments a aplicar al següent tick
		
	}
    
    //mostra la informació del tick per pantalla
    public static void showInformation();

	//afegeix una vacuna a una regió determinada
    public static void addVaccine(Vaccine v, Region r);

	//estableix l'estat del confinament entre dues regions
    public static void setLockdown(Region region1, Region region2, Boolean state);

	//estableix l'estat del confinament meś restrictiu d'una regió
    public static void setHarshLockdown(Region region, Boolean state, float new_rate);
    
    //llegeix les dades inicials del fitxer i crea els objectes necessaris
    public static void inputData(String file_name);

    //comprova si les vacunes han acabat el període d'efecte i les elimina
    private static void updateVaccines();

	//calcula les mutacions dels virus per a cada regió
    private static void calculateMutations();
    
    //torna els habitants que estaven a una altra regió
    private static void returnInhabitants();
    
	//migra habitants cap a altres regions temporalment (1 tick)
	private static void migrateInhabitants();
	
} 
