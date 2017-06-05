/* Una segnale è una squenza di campioni di numeri complessi con un
 * certo SNR in Db.
 * 
 * calcolo della potenza in una sequenza:
 * 		
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class Segnale {
	private List<Campione> campioni;
	private double SnrDb;
	
	// costruttori
	public Segnale(){
		this.campioni = new ArrayList<Campione>();
	}
	
	public Segnale(double SnrDb){
		this.campioni = new ArrayList<Campione>();
		this.SnrDb = SnrDb;
	}
	
	// metodi
	
	public void addCampione(Campione c){
		this.campioni.add(c);
	}
	
	public double calcolaPotenza(){
		double n = this.campioni.size();
		double sommaModuliQuadri=0.0;
		
		for(Campione c : this.campioni){
			sommaModuliQuadri += c.getModuloQuadro();
		}
		double potenza = (1.0/n)*sommaModuliQuadri;
		return potenza;
	}
	
	// metodo che mi calcola la potenza
	// getter - setter
	public List<Campione> getCampioni() {
		return this.campioni;
	}
	public void setCampioni(List<Campione> list) {
		this.campioni = list;
	}
	public double getSnrDb() {
		return this.SnrDb;
	}
	public void setSnrDb(double snrDb) {
		SnrDb = snrDb;
	}
	
}
