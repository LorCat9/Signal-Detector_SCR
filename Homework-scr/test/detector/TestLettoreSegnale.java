package detector;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import detection.LettoreSegnale;
import model.Campione;
import model.Segnale;

public class TestLettoreSegnale {

	private String pathTest = "test/detecto/test.dat";
	private Segnale testSignal;
	
	@Before
	public void setUp() throws Exception {
		this.testSignal = LettoreSegnale.leggi(pathTest, 0);
	}

	@Test
	public void test() {
		for (Campione c : this.testSignal.getCampioni()) {
			
			
		}
	}

}
