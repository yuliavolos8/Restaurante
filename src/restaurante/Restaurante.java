package restaurante;

import java.util.ArrayList;
import java.util.Map;

import Menu.Plato;
import persona.Camarero;
import persona.Chef;
import persona.Cliente;
import persona.Empleado;

public class Restaurante implements RestauranteOperaciones {
	private ArrayList<Cliente> reservas;

	public Restaurante() {
		this.reservas = new ArrayList<>(); 
	}
//metodo para reservar (fecha, cliente)
	@Override
	public void hacerReserva(Cliente cliente, FechaReserva fecha) {
		if (fecha.fechaValida()) {
			reservas.add(cliente);
			System.out.println(
					"Reserva hecha para el cliente: " + cliente.getNombreCompleto() + " para el " + fecha.toString());
		} else {
			System.out.println(" la fecha no es valida");
		}

	}
// polimorfismo
	@Override
	public String tomarPedido(Empleado empleado, Cliente cliente, Map<Plato, Integer> mapPlatos) {
		String resultado = "";
		if (empleado instanceof Camarero) {
			resultado = "El camarero " + empleado.getNombreCompleto() + " ha tomado el pedido.";
		}
		if (empleado instanceof Chef) {
			resultado = "El chef " + empleado.getNombreCompleto() + " está preparando el pedido.";
		}

		return resultado;
	}
// calculamos suma total por el consumo de un cliente
	public double generarFactura(Cliente cliente) {
		double total = 0;
		for (Map.Entry<Plato, Integer> entry : cliente.getPedidos().entrySet()) {
			total += entry.getKey().getPrecio() * entry.getValue();
		}
		return total;
	}

}
