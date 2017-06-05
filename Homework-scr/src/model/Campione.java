/* Implementazione Java di Un Campione: che poi sarebbe un numero 
 * complesso con parte reale e parte immaginaria
 * 
 *  */
package model;

public class Campione {
	private double re;
	private double im;
	
	
	public Campione(){}
	
	// costruttore
	public Campione(double re, double im){
		this.re = re;
		this.im = im;
	}

	// ritorna il modulo
	public double getModulo(){
		double parziale = Math.pow(this.re, 2) + Math.pow(this.re, 2);
		return (Math.sqrt(parziale));
	}
	
	// ritorna il modulo quadro
	public double getModuloQuadro(){
		return (Math.pow(this.getModulo(), 2));
	}
	
	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}

	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}

	@Override
	public String toString() {
		return "Campione [Re: "+this.re+" Im: "+this.im+"j";
	}
	
	
}
