package Model;

public abstract class Vehiculo {
    private enum TipoCombustible {
        GASOLINA, DISEL, ELECTRICO, HIBRIDO
    };

    TipoCombustible tipoCombustible;

    private enum TipoTrasmision {
        MANUAL, AUTOMATICO
    };

    TipoTrasmision tipoTrasmision;

    private enum EsNuevo {
        SI, NO
    };

    EsNuevo esNuevo;

    private String marca;
    private String modelo;
    private int cambios;
    private int velocidadMaxima;
    private int cilindraje;

}
