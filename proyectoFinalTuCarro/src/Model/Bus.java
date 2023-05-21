package Model;

public class Bus extends AbsVehiculoCarga {
    private int numPasajeros;
    private int numeroPuertas;
    private int capMaletero;
    private int numBolasAire;
    private int numSalidasEmergencias;

    private enum TieneAireAcondicionado {
        SI, NO
    };

    TieneAireAcondicionado tieneAireAcondicionado;

    private enum TieneCamaraReversa {
        SI, NO
    };

    TieneCamaraReversa tieneCamaraReversa;

    public Bus(int numPasajeros, int numeroPuertas, int capMaletero, int numBolasAire, int numSalidasEmergencias,
            TieneAireAcondicionado tieneAireAcondicionado, TieneCamaraReversa tieneCamaraReversa, int numEjes,
            String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima,
            int cilindraje, String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision,
            EsNuevo esNuevo, TieneABS tieneABS, Disponibilidad disponibilidad) {
        super(numEjes, marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible,
                tipoTrasmision,
                esNuevo, tieneABS, disponibilidad);
        this.numPasajeros = numPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capMaletero = capMaletero;
        this.numBolasAire = numBolasAire;
        this.numSalidasEmergencias = numSalidasEmergencias;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;

    }

    @Override
    public String toString() {
        String v = "Bus \nnumPasajeros=" + numPasajeros + ", \nnumeroPuertas=" + numeroPuertas + ", \ncapMaletero=" + capMaletero
                + ", \nnumBolasAire=" + numBolasAire + ", \nnumSalidasEmergencias=" + numSalidasEmergencias
                + ", \ntieneAireAcondicionado=" + tieneAireAcondicionado + ", \ntieneCamaraReversa=" + tieneCamaraReversa;

        return v;
    }

    

   

}
