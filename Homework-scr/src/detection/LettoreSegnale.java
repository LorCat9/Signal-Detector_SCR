/* legge un file di un segnale ad un dato Snr(Db) e ne inizializza l'implementazione
 * */
package detection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Campione;
import model.Segnale;

public class LettoreSegnale {
	
	public LettoreSegnale(){}
	
	// metodo statico
	public static Segnale leggi(String path, double SnrDb) throws FileNotFoundException{
		
		Segnale segnale = new Segnale(SnrDb);
		File file = new File(path);
		Scanner scan = new Scanner(file);
		
		while(scan.hasNext()){
			Campione c = new Campione();
			c.setRe(Double.parseDouble(scan.next()));
			c.setIm(Double.parseDouble(scan.next()));
			segnale.addCampione(c);
		}
		scan.close();
		
		return segnale;
		
	}
}
