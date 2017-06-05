/* classe che genera un segnale di solo rumore in base ad un SNR(in Db) dato
 * e il numero di campioni che dovrà avere: i campioni generati avranno solo parte reale 
 * con parte immaginaria nulla
 * 
 * Formula utile:
 *  SNR(lineare) = Pu/Pn
 *  SNR(db) = 10*log(base 10) di SNR(lineare)
 */

package calc;

import java.util.LinkedList;
import java.util.Random;

import model.Campione;
import model.Segnale;


public class GeneratoreSegnaleRumoroso {
	
	private static double pu = 1.0; // potenza segnale utente

	public GeneratoreSegnaleRumoroso(){}
	
	
	public static Segnale generaSegnaleRumoroso(double snrDb, int nCampioni){	// nCampioni: lunghezza del segnale rumoroso		
		Segnale segnale = new Segnale(snrDb);
		
		// potenza a cui voglio il rumore, si calcola in base a SNR(db) e Pu
		double pn =  pu/(Math.pow(10.0, snrDb/10.0));		// che sarebbe la varianza
		
		// .nextGaussian() genera un campione da una gaussiana con m=0 e varianza=1 (Pn)
		Random random = new Random();	
		
		// ciclo che inizializza il segnale
		for(int i=0; i<nCampioni; i++){
			Campione c = new Campione();
			c.setRe((Math.sqrt(pn/2.0))*random.nextGaussian());
			c.setIm((Math.sqrt(pn/2.0))*random.nextGaussian());
			segnale.addCampione(c);			
		}
		return segnale;
	}
}
