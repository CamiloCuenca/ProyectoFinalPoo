package Model;

public abstract class AbsVehiculoCarga extends Vehiculo{
    private int numEjes;
    private int numBolasAire;
    public enum TieneAireAcondicionado {
        SI, NO
    };

    TieneAireAcondicionado tieneAireAcondicionado;

    public enum TieneABS {
        SI, NO
    };

    TieneABS tieneABS;


    public AbsVehiculoCarga(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje, int numEjes, int numBolasAire,
            String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
            Disponibilidad disponibilidad,TieneAireAcondicionado tieneAireAcondicionado, TieneABS tieneABS) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision, esNuevo,
                disponibilidad);
                this.numEjes = numEjes;
                this.numBolasAire = numBolasAire;
                this.tieneAireAcondicionado = tieneAireAcondicionado;
                this.tieneABS = tieneABS;
    }

    @Override
    public abstract String toString();

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public int getNumBolasAire() {
        return numBolasAire;
    }

    public void setNumBolasAire(int numBolasAire) {
        this.numBolasAire = numBolasAire;
    }

    public TieneAireAcondicionado getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(TieneAireAcondicionado tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public TieneABS getTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(TieneABS tieneABS) {
        this.tieneABS = tieneABS;
    }


    
    
}
