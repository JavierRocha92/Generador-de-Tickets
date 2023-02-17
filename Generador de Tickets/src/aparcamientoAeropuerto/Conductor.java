package aparcamientoAeropuerto;

public class Conductor extends Persona {
	
	private String codigo;
	private int turno;
	
	//CONSTRUCTOR USANDO PARAMETROS
	
	public Conductor(String dNI, String nombre, String apellidos, int edad, String dirección, String email,
			String codigo, int turno) {
		super(dNI, nombre, apellidos, edad, dirección, email);
		this.codigo = codigo;
		this.turno = turno;
	}
	
	//CONDUCTOR VACIO

	public Conductor() {
		super();
		this.codigo = "";
		this.turno = 0;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "[Conductor"+ super.toString() + " [codigo=" + codigo + ", turno=" + turno ;
	}

	

	
	
	
	
	
	
	

}
