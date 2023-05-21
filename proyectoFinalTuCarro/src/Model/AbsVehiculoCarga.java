package Model;

public abstract class AbsVehiculoCarga extends Vehiculo{
    private int numEjes;

    public AbsVehiculoCarga(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
            String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
            TieneABS tieneABS, Disponibilidad disponibilidad) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision, esNuevo,
                tieneABS, disponibilidad);

    }

    @Override
    public abstract String toString();
    
    
    
}
