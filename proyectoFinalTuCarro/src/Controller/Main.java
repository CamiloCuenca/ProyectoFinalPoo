package Controller;

import java.util.ArrayList;

import Model.Cliente;
import Model.Empleados;
import Model.Moto;
import Model.Persona;
import Model.Vehiculo.Disponibilidad;
import Model.Vehiculo.EsNuevo;
import Model.Vehiculo.TipoCombustible;
import Model.Vehiculo.TipoTrasmision;
import View.Login;
import View.registrar;

public class Main {

	public static void main(String[] args) {
		Moto moto = new Moto("YAMAHA", "2010", "112A", 6, 150, 1500, args, TipoCombustible.DISEL,
				TipoTrasmision.AUTOMATICO, EsNuevo.SI, Disponibilidad.DISPONIBLE);

		System.out.println(moto.toString());

	}

}
