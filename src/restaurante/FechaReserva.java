package restaurante;

public class FechaReserva {

	private int dia;
	private int mes;
	private int anio;

	public FechaReserva(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return String.format("%02d/%02d/%d", dia, mes, anio);
	}

	public boolean esBisiesto() {
		boolean bisiesto = false;
		if (this.anio % 4 == 0 && this.anio % 100 != 0 || anio % 400 == 0) {
			bisiesto = true;
		} else {

		}
		return bisiesto;
	}

	public int cantDiasEnMes() {
		switch (mes) {
		case 2:

			return esBisiesto() ? 29 : 28;
		case 4:
		case 6:
		case 8:
		case 10:
			return 30;

		default:
			return 31;
		}
	}

	public boolean fechaValida() {
		boolean fechaValida = true;
		String num = String.valueOf(this.anio);
		if (this.mes < 1 || this.mes > 12) {
			fechaValida = false;
		}
		if (this.dia < 1 || this.dia > cantDiasEnMes()) {
			fechaValida = false;
		}
		if (num.length() != 4) {
			fechaValida = false;

		}
		return fechaValida;
	}
}
