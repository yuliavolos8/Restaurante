package persona;

public class Camarero extends Empleado {

	public Camarero(String nombreCompleto, int telefono, String e_mail, String puesto) {
		super(nombreCompleto, telefono, e_mail, puesto);

	}

	@Override
	public String toString() {
		return "Camarero []";
	}

}
