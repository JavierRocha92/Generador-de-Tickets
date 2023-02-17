package aparcamientoAeropuerto;

public class Coche extends Vehiculo{
	private int numeroPuertas;
	
	//ALL PARAMETERS CONTRUCTOR

	public Coche(String matricula, String color, String marca, String modelo, int numeroPuertas) {
		super(matricula, color, marca, modelo);
		this.numeroPuertas = numeroPuertas;
	}
	
	//DEFAULT CONSTRUCTOR

	public Coche() {
		super();
		this.numeroPuertas = 0;
	}

	//GETTERS AND SETTERS

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}


	@Override
	public String toString() {
		return "Coche" + super.toString() + " [numeroPuertas=" + numeroPuertas + "]";
	}

	
   
	
	
	

}
