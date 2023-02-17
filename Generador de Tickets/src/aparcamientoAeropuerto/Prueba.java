package aparcamientoAeropuerto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {
	
	private ArrayList<Cliente>clientesAparcamiento;
	private ArrayList<Conductor>conductoreAparcamiento;
	
	
	
	public Prueba() {
		super();
		this.clientesAparcamiento = new ArrayList<Cliente>();
		this.conductoreAparcamiento=new ArrayList<Conductor>();
	}
	
	
	

	public ArrayList<Cliente> getClientesAparcamiento() {
		return clientesAparcamiento;
	}




	public void setClientesAparcamiento(ArrayList<Cliente> clientesAparcamiento) {
		this.clientesAparcamiento = clientesAparcamiento;
	}




	public ArrayList<Conductor> getConductoreAparcamiento() {
		return conductoreAparcamiento;
	}




	public void setConductoreAparcamiento(ArrayList<Conductor> conductoreAparcamiento) {
		this.conductoreAparcamiento = conductoreAparcamiento;
	}




	public static void main(String[] args) {
		
		//CREAMOS UN OBJETO DE LA CLASE PRUEBA
		
		Prueba p=new Prueba();
		
		//QUITAR ESTA PARTE COMENTADA PARA REALIZAR UNA CARGA INICIAL EN EL AL DE CLIENTES MEDIANTE EL FIECHERO "clientesCarga.txt"
		
//		p.leerClientesCarga();
		
        //DECLARACION DE OBJETO SCANNER PARA TECLADO Y DE LA VARIABLE PARA LA OPCION DEL SWITCH
		int option=0;
		Scanner t=new Scanner(System.in);
		
		do {
			//LLAMAMOS  AM ETODO DE MENU 
			
			p.menuPrincipal();
			option=t.nextInt();
			
			//SWITCH/CASE PARA LAS DOIFERENTES OPCIONES
			
			switch(option) {
			case 1:
				//METDODO PARA LEER CONDUCTORES Y GAURDARLOS EN UN AL
                p.setConductoreAparcamiento(p.leerConductores("conductor.csv"));
				
				break;
			case 2:
				//LLAMADA A METODO PARA DAR DE ALTA A CLIENTE MANUALMENTE
				p.altaCliente();
				break;
			case 3:
				p.guardarClientes();
				break;
			case 4:
				p.leerClientes();
				break;
			case 5:
				p.generarTicket();
				break;
			case 6:
				p.imprimirTurno();
				break;
			}
			
			
		}while(option!=0);
		
	}

	//METODO PARA IMPRIMIR EL TICKTE DE LOS CONDUCTORES
	
	private void guardarClientes() {
		try {
			//GENERO UN OBJETO FILEOUTPOUTSTREAM PARA IMPRIMIR LINEAS EN FICHERO
			FileOutputStream fos= new FileOutputStream(new File("clientes.bin"));
			//CREAMOS UN OBJETO DE LA CLASE OBJESCTOUTPUSTREAM PARA PODER RELLENAR EL ARCHIVO CREADO
			ObjectOutputStream oos=new ObjectOutputStream(fos);

			//EMPEZAMOS A ESCRIBIR EN EL FICHERO
			for (Cliente cli : this.clientesAparcamiento) {
				oos.writeObject(cli);
			}
			oos.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	//MEOTODO PARA IMPRIMIR LOS TICKET DE LOS CONDUCTORES

	private void imprimirTurno() {
		for (Conductor con : this.conductoreAparcamiento) {
			switch(con.getTurno()) {
			case 1:
				try {
					PrintWriter pr=new PrintWriter(new File("TicketConductor"+con.getNombre().substring(0, 1).toUpperCase()+
							con.getNombre().substring(1).toLowerCase()+con.getApellidos().substring(0, 1).toUpperCase()
							+con.getApellidos().substring(1).toLowerCase()+".txt"));
					pr.println("Ticket de conductor para turno 1 // de 8:00 H a 15:00 H");
					for (Cliente cli : this.clientesAparcamiento) {
						if(Integer.parseInt(cli.getHoraLlegada())>=8 && Integer.parseInt(cli.getHoraLlegada())<=15){
							pr.println(cli.getNombre()+" "+cli.getApellidos());
							if(cli.getV() instanceof Coche)
							    pr.println("Tipo de vehiculo ---> Coche");
							if(cli.getV() instanceof Moto)
								pr.println("Tipo de vehiculo ---> Moto");
							if(cli.getV() instanceof Furgoneta)
								pr.println("Tipo de vehiculo ---> Furgoneta");
							pr.println("Matricula :"+cli.getV().getMatricula());
							pr.println("Marca :"+cli.getV().getMarca());
							pr.println("Modelo :"+cli.getV().getModelo());
							pr.println("Color :"+cli.getV().getColor());
						}
						
					}
					pr.flush();
					pr.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					PrintWriter pr=new PrintWriter(new File("TicketConductor"+con.getNombre().substring(0, 1).toUpperCase()+
							con.getNombre().substring(1).toLowerCase()+con.getApellidos().substring(0, 1).toUpperCase()
							+con.getApellidos().substring(1).toLowerCase()+".txt"));
					pr.println("Ticket de conductor para turno 2 // de 16:00 H a 00:00 H");
					for (Cliente cli : this.clientesAparcamiento) {
						if(Integer.parseInt(cli.getHoraLlegada())>=16 && Integer.parseInt(cli.getHoraLlegada())<=24){
							pr.println(cli.getNombre()+" "+cli.getApellidos());
							if(cli.getV() instanceof Coche)
							    pr.println("Tipo de vehiculo ---> Coche");
							if(cli.getV() instanceof Moto)
								pr.println("Tipo de vehiculo ---> Moto");
							if(cli.getV() instanceof Furgoneta)
								pr.println("Tipo de vehiculo ---> Furgoneta");
							pr.println("Matricula :"+cli.getV().getMatricula());
							pr.println("Marca :"+cli.getV().getMarca());
							pr.println("Modelo :"+cli.getV().getModelo());
							pr.println("Color :"+cli.getV().getColor());
						}
						
					}
					pr.flush();
					pr.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					PrintWriter pr=new PrintWriter(new File("TicketConductor"+con.getNombre().substring(0, 1).toUpperCase()+
							con.getNombre().substring(1).toLowerCase()+con.getApellidos().substring(0, 1).toUpperCase()
							+con.getApellidos().substring(1).toLowerCase()+".txt"));
					pr.println("Ticket de conductor para turno 3 // de 01:00 H a 08:00 H");
					for (Cliente cli : this.clientesAparcamiento) {
						if(Integer.parseInt(cli.getHoraLlegada())>=1 && Integer.parseInt(cli.getHoraLlegada())<8){
							pr.println(cli.getNombre()+" "+cli.getApellidos());
							if(cli.getV() instanceof Coche)
							    pr.println("Tipo de vehiculo ---> Coche");
							if(cli.getV() instanceof Moto)
								pr.println("Tipo de vehiculo ---> Moto");
							if(cli.getV() instanceof Furgoneta)
								pr.println("Tipo de vehiculo ---> Furgoneta");
							pr.println("Matricula :"+cli.getV().getMatricula());
							pr.println("Marca :"+cli.getV().getMarca());
							pr.println("Modelo :"+cli.getV().getModelo());
							pr.println("Color :"+cli.getV().getColor());
						}
						
					}
					pr.flush();
					pr.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			
		}
		
	}

	//METODO PARA GENERAR TICKET DE APARCAMIENTO A UN CLIENTE
	
	private void leerClientes() {
		
		//CREAMOS UN OBJETO DE LA CLASE FILEINPUTSTREAM Y LAS VARIABLES PARA GURADAR LA INFORMACION DEL FIECHERO clientes.bin
		
		try {
			this.clientesAparcamiento.clear();
			FileInputStream fis=new FileInputStream(new File("clientes.bin"));
			//CREAMOS EL OBJETO OBJECTINPUTSTREAM PARA PODER ESCRIBIR EN EL FICHERO 
			ObjectInputStream ois=new ObjectInputStream(fis);
			Cliente c=null;
			while(ois!=null) {
				try {
				c=(Cliente)ois.readObject();
				this.clientesAparcamiento.add(c);
				}catch(Exception e) {
					ois.close();
					ois=null;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (Cliente cli : this.clientesAparcamiento) {
			System.out.println(cli.getNombre()+" "+cli.getV().getMatricula());
		}
		
	}

    //METODO PARA GENER TICKET DE LOS CLIENTES

	private void generarTicket() {
		
		//CREAMOS LA VARIABLE PRECIO
		
		int precio=0;
		
		//CREAMOS UN PRINTWRITER PARA CREAR UN FICHERO PARA CADA CLIENTE CON SU TICKET
		try {
		for (Cliente c : this.clientesAparcamiento) {
			
				PrintWriter pr=new PrintWriter(new File("Ticket"+c.getNombre().substring(0, 1).toUpperCase()
						+c.getNombre().substring(1).toLowerCase()+c.getApellidos().substring(0, 1).toUpperCase()
						+c.getApellidos().substring(1).toLowerCase()+".txt"));
				pr.println("Ticket de aparcamiento**********");
				pr.println("Nombre cliente: "+c.getNombre()+" "+c.getApellidos());
				
				//FILTRAMOS EL TIPO DE VEHICULO PATA IMPRIMIRLO EN EL TICKET
				
				if(c.getV() instanceof Coche) {
					pr.println("Tipo de vehiculo: Coche");
					precio=10;
				}
				if(c.getV() instanceof Moto) {
					pr.println("Tipo de vehiculo: Moto");
					precio=5;
				}
				if(c.getV() instanceof Furgoneta) {
					pr.println("Tipo de vehiculo: Furgoneta");
					precio=15;
				}
				
				//IMPRESION DEL PRECIO TOTAL DE LA ESTANCIA
				
				pr.println("Precio por dia: "+precio+" Dias de estancia: "+c.getDiasEstancia()+" Precio total: "+(c.getDiasEstancia()*precio));
				
				pr.flush();
				pr.close();
				
				
			} 
		}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	//METODO PARA DAR DE ALTA A UN NUEVO CLIENTE

	private void altaCliente() {
		
		//CREAMOS UN NUEVO SCANNER PARA TECLADO
		
		Scanner teclado=new Scanner(System.in);
		
		//CREAMOS UN OBJETO DE LA CLASE CLIENTE
		
		Cliente cli=new Cliente();
		
		//PEDIMOS LOS DATOS DEL CLIENTE
		System.out.println("Introduce el Dni del cliente");
		String dni=teclado.next();
		while(!cli.validaCadena(dni)) {
			System.out.println("El dni no es valido");
			System.out.println("Introduce un dni nuevo");
			dni=teclado.next();
		}
		
		//MEDIANTE SETTER DAMOS VALOR NUEVO AL DNI
		
		cli.setDNI(dni);
		
		System.out.println("Introduce el nombre del cliente");
		String name=teclado.next();
		System.out.println("Introduce el apellido del cliente 'SIN ESPACIOS'");
		String subname=teclado.next();
		System.out.println("Introduce la edad del cliente");
		int age=teclado.nextInt();
		System.out.println("Introduce la direccion del cliente");
		teclado.nextLine();
		String adress=teclado.nextLine();
		System.out.println("Introduce el Email del cliente");
		String mail=teclado.next();
		System.out.println("Introduce la hora de llegada del cliente");
		String hour=teclado.next();
		System.out.println("Introduce el tiempo de estancia del cliente");
		int time=teclado.nextInt();
		System.out.println("¿Que tipo de vehiculo tiene? 'coche' , 'moto', 'furgoneta'");
		String vehicle=teclado.next();
		
		//NOS VAMOS POR EL CAMINO DEPENDIENDO DEL TIPO DE VEHICULO DEL CLIENTE
		
		System.out.println("Introduce la matricula del coche");
		String matricula=teclado.next();
		System.out.println("Introduce el color del coche");
		String colour=teclado.next();
		System.out.println("Introduce la marca del coche");
		String brand=teclado.next();
		System.out.println("Introduce el modelo del coche");
		String model=teclado.next();
		
		switch(vehicle) {
		
		//PARA COCHE
		
		case "coche":
			System.out.println("Introduce el numero de puertas del coche");
			int gates=teclado.nextInt();
			
			//CREAMOS UN COCHE 
			
			Coche c=new Coche(matricula, colour, brand, model, gates);
			
			//LLAMAMOS A METODO PARA VALIDAR LA MATRICULA DEL COCHE 
			
			while(!c.validaCadena(c.getMatricula())) {
				System.out.println("La matricula introducida no es valida");
				System.out.println("Introduce una nueva matricula");
				matricula=teclado.next();
				c.setMatricula(matricula);
			}
			
			//LLAMAMOS A SETTER PARA ISNTRODUCIR MATRICULA VERIFICADA
			
			c.setMatricula(matricula);
			
			//CREAMOS UN NUEVO CLIENTE 
			
			this.clientesAparcamiento.add(new Cliente(dni, name, subname, age, adress, mail, hour, time, c));
			
			break;
			
		//PARA MOTO
			
		case "moto":
			System.out.println("Introduce el tipo de la moto");
			String type=teclado.next();
			System.out.println("Introduce la cilindrada de la moto");
			double cilindrada=teclado.nextDouble();
			System.out.println("Introduce el carnet de la moto");
			String carnet=teclado.next();
			
			//CREAMOS UNA NUEVA MOTO
			
			Moto m=new Moto(matricula, colour, brand, model, type, cilindrada, carnet);
			
            //LLAMAMOS A METODO PARA VALIDAR LA MATRICULA DEL COCHE 
			
			while(!m.validaCadena(m.getMatricula())) {
				System.out.println("La matricula introducida no es valida");
				System.out.println("Introduce una nueva matricula");
				matricula=teclado.next();
			}
			
			//LLAMAMOS A SETTER PARA ISNTRODUCIR MATRICULA VERIFICADA
			
			m.setMatricula(matricula);
			
			//CREAMOS UN NUEVO CLIENTE 
			
			this.clientesAparcamiento.add(new Cliente(dni, name, subname, age, adress, mail, hour, time, m));
			
			break;
		
		//PARA FURGONETA
			
		case "furgoneta":
			System.out.println("Introduce la capacidad de la furgoneta");
			int capacity=teclado.nextInt();
			
            //CREAMOS UNA NUEVA MOTO
			
			Furgoneta f=new Furgoneta(matricula, colour, brand, model, capacity);
			
            //LLAMAMOS A METODO PARA VALIDAR LA MATRICULA DEL COCHE 
			
			while(!f.validaCadena(f.getMatricula())) {
				System.out.println("La matricula introducida no es valida");
				System.out.println("Introduce una nueva matricula");
				matricula=teclado.next();
			}
			
			//LLAMAMOS A SETTER PARA ISNTRODUCIR MATRICULA VERIFICADA
			
			f.setMatricula(matricula);
			
			//CREAMOS UN NUEVO CLIENTE 
			
			this.clientesAparcamiento.add(new Cliente(dni, name, subname, age, adress, mail, hour, time, f));
			
			break;
			
		}
		
		
		
		
		
	}

	//METODO PARA LEER LOS CONDUCTORES DEL FICHERO DE "conductores.txt"
	
	private ArrayList<Conductor> leerConductores(String filename) {
		//CREAMOS EL ARRAYLIST PARA ALMACENAR LOS CONDUCTORES Y CREAMOS UN SCANNER PARA LEER EL FICHERO
		ArrayList<Conductor>conductores=new ArrayList<>();
	
		try {
			Scanner entrada=new Scanner(new File(filename));
			
			//CREAMOS LAS VARIABLES LINEA Y EL ARRAY DE STRING CAMPOS PARA GUARDAR LOS REGSITROS DEL FICHERO
			String linea="";
			String[] campos;
			
			//FORZAMOS LA PRIMERA LINEA DEL FICHERO PORQUE NO MTIENE INFORMAZION RELEVANTE
			entrada.nextLine();
			
			//CREAMOS UN BUCLE PARA LEER EL FICHERO LINEA POR LINEA
			
			while(entrada.hasNext()) {
				//GUARDAMOS CADA LINEA DEL FICHERO EN LA VARIABLE LINEA Y CADA CAMPO DE LA LINA EN EL ARRAY CAMPOS
				linea=entrada.nextLine();
				campos=linea.split(";");
				
				//GUARDAMOS CADA CONDUCTOR NUEVO EN EL AARAYLIST PREVISAMNETE CREADO
				conductores.add(new Conductor(campos[2], campos[3], campos[4], Integer.parseInt(campos[5]), campos[6], campos[7], campos[0], Integer.parseInt(campos[1])));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conductores;
	}

	//METODO PARA GENERAR EL MENU DE LA INTERFAZ
	
	private void menuPrincipal() {
		System.out.println("****************");
		System.out.println("1. Leer conductores");
		System.out.println("2. Dar de alta cliente");
		System.out.println("3. Guardar clientes");
		System.out.println("4. Leer clientes");
		System.out.println("5. Generar tickets");
		System.out.println("6. Imprimir turno de entrega");
		System.out.println("****************");
		System.out.println("Elige una opcion");
		
		
	}

	//METODO DE PRUEBA PARA CARGA INICIAL EN EL AL 'DESCOMENTAR PARA QUE FUNCIONE'
	
//   private void leerClientesCarga() {
//		
//		//CREAMOS UN OBJETO DE LA CLASE SCANNER Y LAS VARIABLES PARA GURADAR LA INFORMACION DEL FIECHERO clientes.txt
//		
//		try {
//			Scanner input=new Scanner(new File("clientesCarga.txt"));
//			String line="";
//			String fields[];
//			
//			//WASTING FIRST LINE FROM FILE CAUSE THIS IS USELESS
//			input.nextLine();
//			
//			while(input.hasNext()) {
//				line=input.nextLine();
//				fields=line.split(";");
//				
//				switch(fields[8]) {
//				case "Coche":
//					//CREATE NEW CLIENT WHIT CAR´S OPTIONS
//					Coche c=new Coche(fields[9], fields[10], fields[11], fields[12], Integer.parseInt(fields[13]));
//					this.clientesAparcamiento.add(new Cliente(fields[0], fields[1], fields[2], Integer.parseInt(fields[3]),
//							fields[4], fields[5], fields[6], Integer.parseInt(fields[7]), c));
//					break;
//				case "Moto":
//					Moto m=new Moto(fields[9], fields[10], fields[11], fields[12], fields[13],Double.parseDouble(fields[14]),fields[15]);
//					this.clientesAparcamiento.add(new Cliente(fields[0], fields[1], fields[2], Integer.parseInt(fields[3]),
//							fields[4], fields[5], fields[6], Integer.parseInt(fields[7]), m));
//					break;
//				case "Furgoneta":
//					Furgoneta f=new Furgoneta(fields[9], fields[10], fields[11], fields[12],Integer.parseInt(fields[13]));
//					this.clientesAparcamiento.add(new Cliente(fields[0], fields[1], fields[2], Integer.parseInt(fields[3]),
//							fields[4], fields[5], fields[6], Integer.parseInt(fields[7]), f));
//					break;
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
}


