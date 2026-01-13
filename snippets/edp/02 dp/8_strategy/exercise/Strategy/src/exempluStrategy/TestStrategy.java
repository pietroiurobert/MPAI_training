package exempluStrategy;

public class TestStrategy {
	
	public static void main(String[] args){
	
		ColectieDate colectie = new ColectieDate(10);
	
		EntitateSuma suma = new EntitateSuma();
		EntitateMedie medie = new EntitateMedie();
	
		//procesare suma
		colectie.setStrategie(suma);
		System.out.println(
				"Suma este "+colectie.proceseazaDate());
		
		//procesare medie
		colectie.setStrategie(medie);
		System.out.println(
				"Media este "+colectie.proceseazaDate());
	
	}
}
