package aparcamientoAeropuerto;

public class Moto extends Vehiculo{
	
	private String tipo;
	private double cilindrada;
	private String carnet;
	
	//CONSTRUCTOR CON TODOS LOS PARAMETROS
	
	public Moto(String matricula, String color, String marca, String modelo, String tipo, double cilindrada,
			String carnet) {
		super(matricula, color, marca, modelo);
		this.tipo = tipo;
		this.cilindrada = cilindrada;
     	this.carnet = carnet;
	}
	//DEFAULT CONSTRUCTOR

	public Moto() {
		super();
		this.tipo = "";
		this.cilindrada = 0.0;
		this.carnet = "";
	}

	//GETTERS AND SETTERS

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	@Override
	public String toString() {
		return "Moto"+ super.toString() + " [tipo=" + tipo + ", cilindrada=" + cilindrada + ", carnet=" + carnet + "]";
	}

	
    
	
	
	
	

}
