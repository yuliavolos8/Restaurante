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

	public ArrayList<Cliente> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Cliente> reservas) {
		this.reservas = reservas;
	}

	// metodo para ver las reservas
	public void listarReservas() {
		if (reservas.isEmpty()) {
			System.out.println("No hay reservas");
		} else {
			for (Cliente cliente : reservas) {
				System.out.println("reserva esta echa para : " + cliente.getNombreCompleto());

			}
		}
	}

//metodo para eleminar reserva
	public void cancelarReservar(Cliente cl) {

		if (this.reservas.remove(cl)) {
			System.out.println("reserva cancelada para " + cl.getNombreCompleto());

		} else

		{
			System.out.println("resrva para " + cl.getNombreCompleto() + " no encontrada");
		}
	}

//metodo para eliminar el cliente por su nombre
	public void eliminarReserva(String nombre) {
		boolean encontrado = false;
		for (Cliente cl : reservas) {
			if (cl.getNombreCompleto().equalsIgnoreCase(nombre)) {
				encontrado = true;
				this.reservas.remove(cl);
				System.out.println("se haya cancelado la reserva para :" + nombre);
				break;
			}
		}
		if (!encontrado) {
			System.out.println("reserva para cliente " + nombre + " no encontrada");
		}
	}

//metodo para reservar ( cliente, fecha)
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
