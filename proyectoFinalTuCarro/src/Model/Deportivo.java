package Model;

public class Deportivo extends Automovil {
    private int numCaballosFuerza;
    private double timepo100kl;

    public enum TieneMaletero {
        SI, NO
    };

    TieneMaletero tieneMaletero;

    public Deportivo(int numCaballosFuerza, double timepo100kl, TieneMaletero tieneMaletero, int numPasajeros,
            int numPuertas, int capMaletero,
            String marca, String modelo, int cambios,
            int velocidadMaxima, int cilindraje, int numBolsasAire, TipoCombustible tipoCombustible,
            TipoTrasmision tipoTrasmision, EsNuevo esNuevo, TieneAireAcondicionado tieneAireAcondicionado,
            TieneCapReversa tieneCapReversa, TieneVelCrucero tieneVelCrucero, TieneABS tieneABS,
            TieneSensoresColision tieneSensoresColision, TieneSensoresCrucero tieneSensoresCrucero,
            TieneAssiPermanencia tieneAssiPermanencia) {
        super(numPasajeros, numPuertas, capMaletero, marca, modelo, cambios, velocidadMaxima, cilindraje, numBolsasAire,
                tipoCombustible, tipoTrasmision, esNuevo, tieneAireAcondicionado, tieneCapReversa, tieneVelCrucero,
                tieneABS,
                tieneSensoresColision, tieneSensoresCrucero, tieneAssiPermanencia);
        this.numCaballosFuerza = numCaballosFuerza;
        this.timepo100kl = timepo100kl;
        this.tieneMaletero = tieneMaletero;
    }

    @Override
    public String toString() {
        String v = "Deportivo" + ", '\nmarca:" + getMarca() + ", \nmodelo: "
                + getModelo()
                + ", \ncambios: " + getCambios() + ", \nvelocidadMaxima: " + getVelocidadMaxima() + ", \ncilindraje: "
                + getCilindraje()
                + ", \nnumBolsasAire: " + getNumBolsasAire() + ", \nnumPasajeros: " + getNumPasajerso()
                + ", \nnumPuertas: "
                + getNumPuertas() + ", \ncapMaletero" + getCapMaletero() + ", \nNumcaballosFuerza: " + numCaballosFuerza
                + ", \nTiempo100kl: " + timepo100kl + ", \ntipoCombustible=" + tipoCombustible + ", \nTieneMaletero: "
                + tieneMaletero
                + ", \ntipoTrasmision: " + tipoTrasmision + ", \nesNuevo: " + esNuevo + ", \ntieneAireAcondicionado: "
                + tieneAireAcondicionado + ", \ntieneCapReversa=" + tieneCapReversa + ", \ntieneVelCrucero: "
                + tieneVelCrucero + ", \ntieneABS: " + tieneABS + ", \ntieneSensoresColision: " + tieneSensoresColision
                + ", \ntieneSensoresCrucero: " + tieneSensoresCrucero + ", \ntieneAssiPermanencia: "
                + tieneAssiPermanencia;
        return v;

    }

    public int getNumCaballosFuerza() {
        return numCaballosFuerza;
    }

    public void setNumCaballosFuerza(int numCaballosFuerza) {
        this.numCaballosFuerza = numCaballosFuerza;
    }

    public double getTimepo100kl() {
        return timepo100kl;
    }

    public void setTimepo100kl(double timepo100kl) {
        this.timepo100kl = timepo100kl;
    }

    public TieneMaletero getTieneMaletero() {
        return tieneMaletero;
    }

    public void setTieneMaletero(TieneMaletero tieneMaletero) {
        this.tieneMaletero = tieneMaletero;
    }

}
