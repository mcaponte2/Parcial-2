package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class ParcialTest {
	private Parcial parcial;
	
	@BeforeEach
	public void SetUp() {
		this.parcial= new Parcial();
	}
	
	@Test
	public void raicesTest() throws Exception{
		ArrayList<Double> raices=this.parcial.calcularRaices(1, 4, 3);
		assertEquals(2, raices.size());
		assertTrue(raices.contains(-1.0));
		assertTrue(raices.contains(-3.0));
	}
	
	@Test
	public void coeficienteATest() throws Exception{
		assertThrows(Exception.class, ()-> this.parcial.calcularRaices(0, 2, 1));
	}
	
	@Test
	public void discriminanteNegativoTest() throws Exception{
		assertThrows(Exception.class, ()-> this.parcial.calcularRaices(1, 4, 8));
	}
}
