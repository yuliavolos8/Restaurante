package persona;

public class Empleado extends Persona {
	private String puesto;

	public Empleado(String nombreCompleto, int telefono, String e_mail, String puesto) {
		super(nombreCompleto, telefono, e_mail);
		this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [puesto=" + puesto + ", getNombreCompleto()=" + getNombreCompleto() + ", getTelefono()="
				+ getTelefono() + ", getE_mail()=" + getE_mail() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
