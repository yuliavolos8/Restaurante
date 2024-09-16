package persona;

public class Persona {
	private String nombreCompleto;
	private int telefono;
	private String e_mail;

	public Persona(String nombreCompleto, int telefono, String e_mail) {

		this.nombreCompleto = nombreCompleto;
		this.telefono = telefono;
		this.e_mail = e_mail;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	@Override
	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto + ", telefono=" + telefono + ", e_mail=" + e_mail + "]";
	}

}
