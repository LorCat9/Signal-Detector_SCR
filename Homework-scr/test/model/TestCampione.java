package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCampione {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGetModulo() {
		Campione campione = new Campione();
		campione.setRe(2);
		campione.setIm(3);
	}

}
