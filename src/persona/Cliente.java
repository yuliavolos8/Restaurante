package persona;

import java.util.HashMap;
import java.util.Map;

import Menu.Plato;

public class Cliente extends Persona {
	private String preferencias;
	private Map<Plato, Integer> pedidos;

	public Cliente(String nombreCompleto, int telefono, String e_mail, String prefer) {
		super(nombreCompleto, telefono, e_mail);
		this.preferencias = prefer;
		this.pedidos = new HashMap<>(); // Inicializar el mapa
	}

	public void addPedidosMap(Plato plato, int cantidad) {
		pedidos.put(plato,cantidad);
	}

	public void modificarPedido(Plato plato, int cantidad) {
		if (cantidad <= 0) {
			this.pedidos.remove(plato);
		} else {
			this.pedidos.put(plato, cantidad);

		}
	}

	public String getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(String preferencias) {
		this.preferencias = preferencias;
	}

	public Map<Plato, Integer> getPedidos() {
		return pedidos;
	}

	@Override
	public String toString() {
		return "Cliente [preferencias=" + preferencias + ", pedidos=" + pedidos + ", getNombreCompleto()="
				+ getNombreCompleto() + "]";
	}
}
