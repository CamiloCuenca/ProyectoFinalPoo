package Model;

public class Sedan extends Automovil {

    public Sedan(int numPasajeros, int numPuertas, int capMaletero, String marca, String modelo, int cambios,
            int velocidadMaxima, int cilindraje, int numBolsasAire, TipoCombustible tipoCombustible,
            TipoTrasmision tipoTrasmision, EsNuevo esNuevo, TieneAireAcondicionado tieneAireAcondicionado,
            TieneCapReversa tieneCapReversa, TieneVelCrucero tieneVelCrucero, TieneABS tieneABS,
            TieneSensoresColision tieneSensoresColision, TieneSensoresCrucero tieneSensoresCrucero,
            TieneAssiPermanencia tieneAssiPermanencia) {
        super(numPasajeros, numPuertas, capMaletero, marca, modelo, cambios, velocidadMaxima, cilindraje, numBolsasAire,
                tipoCombustible, tipoTrasmision, esNuevo, tieneAireAcondicionado, tieneCapReversa, tieneVelCrucero,
                tieneABS,
                tieneSensoresColision, tieneSensoresCrucero, tieneAssiPermanencia);
    }

    @Override
    public String toString() {
        String v = "Sedan" + ", '\nmarca:" + getMarca() + ", \nmodelo: "
                + getModelo()
                + ", \ncambios: " + getCambios() + ", \nvelocidadMaxima: " + getVelocidadMaxima() + ", \ncilindraje: "
                + getCilindraje()
                + ", \nnumBolsasAire: " + getNumBolsasAire() + ", \nnumPasajeros: " + getNumPasajerso()
                + ", \nnumPuertas: "
                + getNumPuertas() + ", \ncapMaletero" + getCapMaletero() + ", \ntipoCombustible: " + tipoCombustible
                + ", \ntipoTrasmision: " + tipoTrasmision + ", \nesNuevo: " + esNuevo + ", \ntieneAireAcondicionado: "
                + tieneAireAcondicionado + ", \ntieneCapReversa=" + tieneCapReversa + ", \ntieneVelCrucero: "
                + tieneVelCrucero + ", \ntieneABS: " + tieneABS + ", \ntieneSensoresColision: " + tieneSensoresColision
                + ", \ntieneSensoresCrucero: " + tieneSensoresCrucero + ", \ntieneAssiPermanencia: "
                + tieneAssiPermanencia;
        return v;

    }

}
