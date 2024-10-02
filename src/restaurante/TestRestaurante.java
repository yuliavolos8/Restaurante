package restaurante;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import Menu.Plato;
import persona.Camarero;
import persona.Chef;
import persona.Cliente;
import persona.Empleado;

class TestRestaurante {
	Restaurante restaurante = new Restaurante();
	Cliente cliente = new Cliente("Juan Perez", 634523647, "poco@gmial.com", "sin lactoza");
	Plato plato = new Plato("Paella", 10.0, new ArrayList<String>() {
		{
			add("arroz");
			add("mariscos");
		}
	});
	Empleado camarero = new Camarero("Borja Vals", 611789632, "kikomartin@gmail.com", "camarero");
	FechaReserva fechaValida = new FechaReserva(22, 11, 2033);
	FechaReserva fechaNoValida = new FechaReserva(10, 22, 2024);
	/*
	 * @Test void testHacerReservaValida() { restaurante.hacerReserva(cliente,
	 * fechaValida); assertTrue(restaurante.getReservas().contains(cliente),
	 * "la reserva deberia haberse aniadido correctamente"); }
	 * 
	 * @Test void TestHacerReservaInValida() { restaurante.hacerReserva(cliente,
	 * fechaNoValida); assertFalse(restaurante.getReservas().contains(cliente),
	 * "la reserva deberia haberse aniadido correctamente"); }
	 */

	@Test
	void testTomarPedidoCorrecto() {
		Map<Plato, Integer> mapPlatos = new HashMap<>();
		mapPlatos.put(plato, 1);
		restaurante.tomarPedido(camarero, cliente, mapPlatos);
		String resultado = restaurante.tomarPedido(camarero, cliente, mapPlatos);
		assertEquals("el camarero Borja Vals a tomado el pedido", resultado,
				" el mensaje del pediod deberia de" + "ser correcto para el camarero");
	}
}
