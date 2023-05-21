package Model;

public class Bus extends AbsVehiculoCarga{

    public Bus(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
            String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
            TieneABS tieneABS, Disponibilidad disponibilidad) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision, esNuevo,
                tieneABS, disponibilidad);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
    
}
