public static class Simulation {
	
	public static void tick(float delta_time) {
		
		applyVaccines();
		
		for (Region r : _regions) {
			r.moveInhabitants();
		}
		
		
		
	}
	
}
