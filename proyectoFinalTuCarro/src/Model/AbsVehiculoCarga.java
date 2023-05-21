package Model;

public abstract class AbsVehiculoCarga extends Vehiculo {
    private int numEjes;

    public AbsVehiculoCarga(int numEjes, String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima,
            int cilindraje,
            String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
            TieneABS tieneABS, Disponibilidad disponibilidad) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision,
                esNuevo,
                tieneABS, disponibilidad);
        this.numEjes = numEjes;

    }

    @Override
    public abstract String toString();

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

}
