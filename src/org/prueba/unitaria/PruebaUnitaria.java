package org.prueba.unitaria;


import org.junit.jupiter.api.Test;
import org.servicio.junit.ServicioJunit;

import junit.framework.TestCase;

/*
 * 
 * REGLAS PRUEBAS UNITARIA
 * 
 * 1.-HEREDAR DE LA CLASE TESTCASE
 * 2.-CREAR EL METODO TEST
 * 3.-TODOS LOS METODOS DEBEN LLEVAR LA ANOTACION @Test
 * 4.-EL NOMBRE DE LOS METODOS DEBEN COMENZAR CON testNameMethod
 * 
 */
public class PruebaUnitaria extends TestCase{
	private ServicioJunit servicioJunit;
	@Test
	public void test() {
		servicioJunit=new ServicioJunit();
	}
	@Test
	public void testSalarioBono() {
		test();
		assertTrue(servicioJunit.salarioBono(20000.0, 5000.0)==25000.0);
	}
	@Test
	public void testSalarioPrestamo() {
		test();
		assertEquals(15000.0, servicioJunit.salarioPrestamo(20000.0, 5000.0));
	}
	@Test
	public void testSalarioMes() {
		test();
		assertEquals(100000.0,servicioJunit.salarioporMes(20000.0, 5));
	}
	

}
