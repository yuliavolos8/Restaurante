import java.util.ArrayList;
import java.util.List;

import Menu.Plato;
import persona.Cliente;
import persona.Camarero;
import persona.Chef;
import persona.Empleado;
import restaurante.FechaReserva;
import restaurante.Restaurante;
import persona.Persona;

public class Main {

	public static void main(String[] args) {
		Restaurante restaurante = new Restaurante();

		Empleado e1 = new Chef("Paco", 678456698, "pacoNuños@gmail.com", "chef");
		Empleado e2 = new Camarero("Luis Delagado", 654987777, "luisSanches@gmial.com", "camarero");
		Cliente cl1 = new Cliente("Ana Lopez", 654321789, "anaLopez@gmial.com", "opcion vegana");
		Cliente cl2 = new Cliente("Ramon Blanco", 654000980, "alico@gmial.com", "cafe sin azucar");
		Persona persona = new Persona("kola", 23456789, "adgs@dsf.com");

		FechaReserva fecha = new FechaReserva(12, 12, 2023);
		restaurante.hacerReserva(cl2, fecha);
		Plato plato1 = new Plato("arrozTresDelicias", 8.90, new ArrayList<String>() {
			{
				add("arroz");
				add("guisante");
				add("langostinos");
			}
		});
		Plato plato2 = new Plato("Paella", 12.50, new ArrayList<String>() {
			{
				add("arroz");
				add("mariscos");
				add("pollo");
				add("verduras");
			}
		});

		cl2.addPedidosMap(plato1, 3);
		cl2.addPedidosMap(plato2, 2);
		System.out.println(cl2.toString());

		System.out.println(restaurante.tomarPedido(e1, cl2, cl2.getPedidos()));
		cl2.modificarPedido(plato1, 0);
		System.out.println("total a pagar para cliente :" + cl2.getNombreCompleto() + " son  "
				+ restaurante.generarFactura(cl2) + " euros");

		System.out.println(e1.toString());
		restaurante.listarReservas();
		restaurante.cancelarReservar(cl2);
		restaurante.listarReservas();
		restaurante.cancelarReservar(cl2);
		System.out.println("***********************************");
	
	}

}