/*
 * - Devo creare K sequenze rumorose di lunghezza N.
 * - Di ogni sequenza calcolo la potenza, e le metto in una lista ordinata. 
 * - In base al Pfa(Probabilità falso allarme) sceglierò la potenza per cui saranno sopra soglia
 * 		le ultime tot potenze. (es: Pfa= 0.1, su mille sequenza scarto le ultime 10)
 * 
 * La creazione di una soglia dipende da i valori di Pfa e SNR che gli passo per il calcolo
 **/ 

package calc;

import java.util.ArrayList;
import java.util.Collections;

import model.Segnale;
import model.Soglia;

public class CalcolatoreSoglia {

	/* Per il calcolo della soglia dell'HomeWork utilizzo una pobabilità di falso 
	 * allarme PFa = 0.01 e SNR(db) Parametrico.
	 * Con questo PFa dovrò generare 1000 sequenze */
	
	private static double Pfa = 0.01;
	private static int k = 1000;		// numero sequenze rumorose da generare
	// costruttore vuoto	
	public CalcolatoreSoglia(){
		
	}
	
	public static Soglia calcolaSoglia(double snrDb){
		
		ArrayList<Double> potenze = new ArrayList<Double>();		// potenze di ogni sequenza rumorosa create
		
		for(int i=0; i<k; i++){
			Segnale segnaleRumoroso = GeneratoreSegnaleRumoroso.generaSegnaleRumoroso(snrDb, 1000);
			potenze.add(segnaleRumoroso.calcolaPotenza());
		}
		
		Collections.sort(potenze);		// ordina la sequenza di potenze
		double nSopraSoglia = (Pfa*k);  // numero elementi che saranno sopra soglia

		double valore = potenze.get(potenze.size()-(int)nSopraSoglia-1); 
		Soglia soglia = new Soglia(Pfa, snrDb, valore);
		return soglia;
	}
	
	/* Osservazione: Posso far calcolare la soglia per un dato SNR n volte e poi prenderne 
	 * la media per aumentare il grado di precisione
	 */
}
