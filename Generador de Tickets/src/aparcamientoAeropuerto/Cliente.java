package aparcamientoAeropuerto;

import java.io.Serializable;

public class Cliente extends Persona{

	private String horaLlegada;
	private int diasEstancia;
	private Vehiculo v;
	
	//CONSTRUCTOR CON PARAMETROS
	
	public Cliente(String dNI, String nombre, String apellidos, int edad, String dirección, String email,
			String horaLlegada, int diasEstancia, Vehiculo v) {
		super(dNI, nombre, apellidos, edad, dirección, email);
		this.horaLlegada = horaLlegada;
		this.diasEstancia = diasEstancia;
		this.v = v;
	}
	
	//CONSTRUCTOR SIN VEHICULO
	
	public Cliente() {
		super();
		this.horaLlegada = "";
		this.diasEstancia = 0;
		this.v = null;
	}

	

	public String getHoraLlegada() {
		return horaLlegada;
	}

	
	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public int getDiasEstancia() {
		return diasEstancia;
	}

	public void setDiasEstancia(int diasEstancia) {
		this.diasEstancia = diasEstancia;
	}

	public Vehiculo getV() {
		return v;
	}

	public void setV(Vehiculo v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "[Cliente"+ super.toString() + "[horaLlegada=" + horaLlegada + ", diasEstancia=" + diasEstancia + ", v=" + v ;
	}

	

	
	

	
	
	

}
