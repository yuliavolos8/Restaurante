package persona;

public class Chef extends Empleado {

	public Chef(String nombreCompleto, int telefono, String e_mail, String puesto) {
		super(nombreCompleto, telefono, e_mail, puesto);

	}

	@Override
	public String toString() {
		return "Chef []";
	}

}
