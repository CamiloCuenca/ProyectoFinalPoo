package Model;

public class Deportivo extends Sedan {
    private int numCaballosFuerza;
    private double tiempokm;

    public Deportivo(int numCaballosFuerza, double tiempokm, int numPasajeros, int numPuertas, int capMaletero,
            TipoCombustible tipoCombustible,
            TipoTrasmision tipoTrasmision, EsNuevo esNuevo, TieneAireAcondicionado tieneAireAcondicionado,
            TieneCapReversa tieneCapReversa, TieneVelCrucero tieneVelCrucero, TieneABS tieneABS,
            TieneSensoresColision tieneSensoresColision, TieneSensoresCrucero tieneSensoresCrucero,
            TieneAssiPermanencia tieneAssiPermanencia, String marca, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, int numBolsasAire) {
        super(numPasajeros, numPuertas, capMaletero, tipoCombustible, tipoTrasmision, esNuevo, tieneAireAcondicionado,
                tieneCapReversa, tieneVelCrucero, tieneABS, tieneSensoresColision, tieneSensoresCrucero,
                tieneAssiPermanencia,
                marca, modelo, cambios, velocidadMaxima, cilindraje, numBolsasAire);
        this.numCaballosFuerza = numCaballosFuerza;
        this.tiempokm = tiempokm;
    }

    public int getNumCaballosFuerza() {
        return numCaballosFuerza;
    }

    public void setNumCaballosFuerza(int numCaballosFuerza) {
        this.numCaballosFuerza = numCaballosFuerza;
    }

    public double getTiempokm() {
        return tiempokm;
    }

    public void setTiempokm(double tiempokm) {
        this.tiempokm = tiempokm;
    }

}
