package Model;

public class CamionetaSuv extends Automovil {
    public enum Escuatroxcuatro {
        SI, NO
    };

    Escuatroxcuatro escuatroxcuatro;

    public CamionetaSuv(Escuatroxcuatro escuatroxcuatro,int numPasajeros, int numPuertas, int capMaletero, String marca, String modelo, int cambios,
            int velocidadMaxima, int cilindraje, int numBolsasAire, TipoCombustible tipoCombustible,
            TipoTrasmision tipoTrasmision, EsNuevo esNuevo, TieneAireAcondicionado tieneAireAcondicionado,
            TieneCapReversa tieneCapReversa, TieneVelCrucero tieneVelCrucero, TieneABS tieneABS,
            TieneSensoresColision tieneSensoresColision, TieneSensoresCrucero tieneSensoresCrucero,
            TieneAssiPermanencia tieneAssiPermanencia) {
        super(numPasajeros, numPuertas, capMaletero, marca, modelo, cambios, velocidadMaxima, cilindraje, numBolsasAire,
                tipoCombustible, tipoTrasmision, esNuevo, tieneAireAcondicionado, tieneCapReversa, tieneVelCrucero,
                tieneABS,
                tieneSensoresColision, tieneSensoresCrucero, tieneAssiPermanencia);
                this.escuatroxcuatro = escuatroxcuatro;

    }

    @Override
    public String toString() {
        return "a";
    }

}
