package Model;

public abstract class Automovil extends Vehiculo {
    private int numPasajerso;
    private int numPuertas;
    private int capMaletero;

    public Automovil(int numPasajeros, int numPuertas, int capMaletero, String marca, String modelo, int cambios,
            int velocidadMaxima, int cilindraje, int numBolsasAire,
            TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
            TieneAireAcondicionado tieneAireAcondicionado, TieneCapReversa tieneCapReversa,
            TieneVelCrucero tieneVelCrucero, TieneABS tieneABS, TieneSensoresColision tieneSensoresColision,
            TieneSensoresCrucero tieneSensoresCrucero, TieneAssiPermanencia tieneAssiPermanencia) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, numBolsasAire, tipoCombustible, tipoTrasmision,
                esNuevo,
                tieneAireAcondicionado, tieneCapReversa, tieneVelCrucero, tieneABS, tieneSensoresColision,
                tieneSensoresCrucero,
                tieneAssiPermanencia);
        this.numPasajerso = numPasajeros;
        this.numPuertas = numPuertas;
        this.capMaletero = capMaletero;

    }

    @Override
    public abstract String toString();

    public int getNumPasajerso() {
        return numPasajerso;
    }

    public void setNumPasajerso(int numPasajerso) {
        this.numPasajerso = numPasajerso;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCapMaletero() {
        return capMaletero;
    }

    public void setCapMaletero(int capMaletero) {
        this.capMaletero = capMaletero;
    }

}
