package Model;

import java.util.ArrayList;

public class Empleados  extends Persona{
	
	//Atributos
	//private ArrayList<Reportes> reportes = new  ArrayList<Reportes>();
	private enum tipoEstado{ACTIVO,BLOQUEADO};
	private tipoEstado estado;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
	

	
	
	
	//Constructor
	public Empleados(String nombre, String apellido, String cedula, String correo, String contraseña) {
		super(nombre, apellido, cedula, correo, contraseña);
		
	}
	

	//Get and Set
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}


	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}


	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	
	
	//Metodos
	public void registrarCliente( String nombre , String apellido , String cedula , String correo , String Contraseña ) {
		
		for(int i =0;i<clientes.size();i++) {
			
			clientes.add(new Cliente(nombre, apellido, cedula, correo, Contraseña));
		}	
	}
	
	public void registrarVehiculo() {
		
	}
	
	
	
}
