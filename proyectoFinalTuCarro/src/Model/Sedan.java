package Model;

public abstract class Sedan extends Vehiculo {
    private int numPasajeros;
    private int numPuertas;
    private int capMaletero;

    public Sedan(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
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

}
