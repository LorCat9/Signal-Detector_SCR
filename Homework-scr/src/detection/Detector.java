/* PER IPOTESI IL NUMERO DI CAMPIONI PER SEGNALE SONO 1 000 000 */

package detection;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;

import model.Campione;
import model.Segnale;
import model.Soglia;

public class Detector {
	
	public Detector(){}

	
	// Perl'Homework: Analizza il segnale dividendolo in 1000 blocchi da 1000 campioni campioni
	public static double getPercentualePresenza(Segnale segnale, HashMap<Double, Soglia> soglie){
		
		double trovati=0.0;
		List<Campione> campioniSegnale = segnale.getCampioni();
		Segnale blocco = new Segnale(segnale.getSnrDb());
		
		int index=0;
		
		for(int i=0; i<1000; i++){	// i: i-esimo blocco
			blocco.setCampioni(campioniSegnale.subList(index, index+1000));
			if(hasSegnaleUtente(blocco, soglie))
				trovati++;
			index+= 1000;
		}
		return trovati*0.1;
	}
	
	// ritorna la percentuale 
	public static boolean hasSegnaleUtente(Segnale segnale, HashMap<Double, Soglia> soglie){

		double potenza = segnale.calcolaPotenza();
		Soglia s = soglie.get(segnale.getSnrDb());
		
		if(potenza>s.getValue())
			return true;
		return false;		
	}
	
	public static void rilevaUtentePrimario(String path, double SnrDb, HashMap<Double, Soglia> soglie) throws FileNotFoundException{
		Segnale segnale = LettoreSegnale.leggi(path, SnrDb);
		double percentuale = getPercentualePresenza(segnale, soglie);
		System.out.println("SNR: "+segnale.getSnrDb()+" || Percentuale presenza utente primario: "+percentuale+"%");	
	}
}
