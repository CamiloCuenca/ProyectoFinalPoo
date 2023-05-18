package Model;

public abstract class Sedan extends Vehiculo {
    private int numPasajeros;
    private int numPuertas;
    private int capMaletero;

    public Sedan(int numPasajeros, int numPuertas, int capMaletero ,TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
            TieneAireAcondicionado tieneAireAcondicionado, TieneCapReversa tieneCapReversa,
            TieneVelCrucero tieneVelCrucero, TieneABS tieneABS, TieneSensoresColision tieneSensoresColision,
            TieneSensoresCrucero tieneSensoresCrucero, TieneAssiPermanencia tieneAssiPermanencia, String marca,
            String modelo, int cambios, int velocidadMaxima, int cilindraje, int numBolsasAire) {
        super(tipoCombustible, tipoTrasmision, esNuevo, tieneAireAcondicionado, tieneCapReversa, tieneVelCrucero,
                tieneABS,
                tieneSensoresColision, tieneSensoresCrucero, tieneAssiPermanencia, marca, modelo, cambios,
                velocidadMaxima,
                cilindraje, numBolsasAire);
                this.numPasajeros = numPasajeros;
                this.numPuertas = numPuertas;
                this.capMaletero = capMaletero;

    

    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
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
