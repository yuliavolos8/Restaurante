package restaurante;

import java.util.Map;

import Menu.Plato;
import persona.Cliente;
import persona.Empleado;

public interface RestauranteOperaciones {
    public void hacerReserva(Cliente cliente ,FechaReserva fecha);
    public String tomarPedido(Empleado empleado, Cliente cliente, Map<Plato, Integer> mapPlatos);
    public double generarFactura(Cliente cliente);
}
