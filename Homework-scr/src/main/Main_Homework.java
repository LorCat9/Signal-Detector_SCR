/* Assegnate 3 sequenze di 10^6 campioni complessi
 *  osservate a 4 diversi SNR (-13, -8, -3, +2 dB) */
package main;



import java.io.IOException;
import java.util.HashMap;

import calc.CalcolatoreSoglia;
import detection.Detector;
import model.Soglia;

public class Main_Homework {

	public static void main(String[] args) throws IOException{

		// calcoliamo le soglie
		HashMap<Double, Soglia> soglie = new HashMap<>();		// la chiave della soglia è l'Snr(Db). La Pfa è fissa per tutte.
		soglie.put(2.0, CalcolatoreSoglia.calcolaSoglia(2.0));
		soglie.put(-3.0, CalcolatoreSoglia.calcolaSoglia(-3.0));
		soglie.put(-8.0, CalcolatoreSoglia.calcolaSoglia(-8.0));
		soglie.put(-13.0, CalcolatoreSoglia.calcolaSoglia(-13.0));

		// Stampa delle soglie
		System.out.println(soglie.get(-13.0).toString());
		System.out.println(soglie.get(-8.0).toString());
		System.out.println(soglie.get(-3.0).toString());
		System.out.println(soglie.get(2.0).toString()); 

		System.out.println();
		System.out.println("primo segnale:");
		// Rilevazione primo segnale
		Detector.rilevaUtentePrimario("sequenze/s1/output_1.dat", -3.0, soglie);
		Detector.rilevaUtentePrimario("sequenze/s1/output_2.dat", 2.0, soglie);
		Detector.rilevaUtentePrimario("sequenze/s1/output_3.dat", -8.0, soglie);
		Detector.rilevaUtentePrimario("sequenze/s1/output_4.dat", -13.0, soglie); 

		System.out.println();

		System.out.println("secondo segnale:");
		// Rilevazione secondo segnale
		Detector.rilevaUtentePrimario("sequenze/s2/output_1.dat", -3.0, soglie);
		Detector.rilevaUtentePrimario("sequenze/s2/output_2.dat", 2.0, soglie);
		Detector.rilevaUtentePrimario("sequenze/s2/output_3.dat", -8.0, soglie);
		Detector.rilevaUtentePrimario("sequenze/s2/output_4.dat", -13.0, soglie);

		System.out.println();

		System.out.println("terzo segnale:");
		// Rilevazione terzo segnale
		Detector.rilevaUtentePrimario("sequenze/s3/output_1.dat", -3.0, soglie);
		Detector.rilevaUtentePrimario("sequenze/s3/output_2.dat", 2.0, soglie);
		Detector.rilevaUtentePrimario("sequenze/s3/output_3.dat", -8.0, soglie);
		Detector.rilevaUtentePrimario("sequenze/s3/output_4.dat", -13.0, soglie); 

	}
}
