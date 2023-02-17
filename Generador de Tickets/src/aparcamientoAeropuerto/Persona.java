package aparcamientoAeropuerto;

import java.io.Serializable;

public abstract class Persona implements Valida,Serializable{
	
	private String DNI;
	private String Nombre;
	private String Apellidos;
	private int Edad;
	private String Dirección;
	private String Email;
	
	//CONSTRUCTOR CON PARAMETROS
	
	public Persona(String dNI, String nombre, String apellidos, int edad, String dirección, String email) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Edad = edad;
		Dirección = dirección;
		Email = email;
	}
	
	//CONSTRUCTOR SIN PARAMETROS

	public Persona() {
		super();
		DNI = "";
		Nombre = "";
		Apellidos = "";
		Edad = 0;
		Dirección = "";
		Email = "";
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getDirección() {
		return Dirección;
	}

	public void setDirección(String dirección) {
		Dirección = dirección;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad
				+ ", Dirección=" + Dirección + ", Email=" + Email + "]";
	}
	
public boolean validaCadena (String cadena) {
		
		//DECLARAMOS UN ARRAY CON LAS LETRAS DE LOS DNI
		
		String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		
		//VALIDAMOS CON EXPRESION REGULAR EL PATRON VALIDO DE UN DNI
		
		
		
		if(cadena.matches("[0-9]{8}[A-Z]$")) {
			
			//LE QUITAMOS AL DNI LA LETRA
			String letra=cadena.substring(cadena.length()-1);
			int numero=Integer.parseInt(cadena.substring(1, cadena.length()-1));
			
			//COMPROBAMOS SI LA LETRA DEL DNI CONCIDE CON EL INIDICE DADO DEL RESTO DEL NUMERO DEL DNI ENTRE 23
			
			if(letra.equals(letras[numero%23])) {
				return true;
				
			}
			
		}
		
		return false;
	}
	
	
	
	
	

}
