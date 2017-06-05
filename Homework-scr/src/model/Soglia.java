/* La soglia è un valore di potenza che varia a seconda della probabilità di falso
 * allarma (Pfa) e al rapporto segnale rumore in DB a cui è stato catturato il segnale (SnrDb)
 */
package model;

public class Soglia {
	
	private double Pfa;		// falso allarme
	private double SnrDb;	// rapport segnale rumore
	private double value;	// valore della soglia
	
	// costruttore
	public Soglia(){}
	
	public Soglia(double Pfa, double SnrDb, double value){
		this.Pfa = Pfa;
		this.SnrDb = SnrDb;
		this.value = value;
	}
	
	public double getPfa() {
		return Pfa;
	}
	public void setPfa(double pfa) {
		Pfa = pfa;
	}
	public double getSnrDb() {
		return SnrDb;
	}
	public void setSnrDb(double snrDb) {
		SnrDb = snrDb;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	// to String
	@Override
	public String toString(){
		return "Soglia -> SNR(db): "+this.getSnrDb()+" || Pfa: "+this.getPfa()+" || Valore: "+this.getValue();
	}
}
