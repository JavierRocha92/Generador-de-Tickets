package aparcamientoAeropuerto;

import java.io.Serializable;

public abstract class Vehiculo implements Valida,Serializable {
	
	private String matricula;
	private String color;
	private String marca;
	private String modelo;
	
	
	public Vehiculo(String matricula, String color, String marca, String modelo) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}


	public Vehiculo() {
		super();
		this.matricula = "";
		this.color = "";
		this.marca = "";
		this.modelo = "";
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return " matricula=" + matricula + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
				+ "]";
	}
	
public boolean validaCadena(String cadena) {
		
			if(cadena.matches("[0-9]{4}[-][A-Z]{3}$")) {
				return true;
			}
			
		
		
		
		return false;
	}
	
	
	

}
