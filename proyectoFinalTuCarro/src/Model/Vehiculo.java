package Model;

public abstract class Vehiculo {
    public enum TipoCombustible {
        GASOLINA, DISEL, ELECTRICO, HIBRIDO
    };

    TipoCombustible tipoCombustible;

    public enum TipoTrasmision {
        MANUAL, AUTOMATICO
    };

    TipoTrasmision tipoTrasmision;

    public enum EsNuevo {
        SI, NO
    };

    EsNuevo esNuevo;

    public enum TieneAireAcondicionado {
        SI, NO
    }

    TieneAireAcondicionado tieneAireAcondicionado;

    public enum TieneCapReversa {
        SI, NO
    }

    TieneCapReversa tieneCapReversa;

    public enum TieneVelCrucero {
        SI, NO
    };

    TieneVelCrucero tieneVelCrucero;

    public enum TieneABS {
        SI, NO
    };

    TieneABS tieneABS;

    public enum TieneSensoresColision {
        SI, NO
    };

    TieneSensoresColision tieneSensoresColision;

    public enum TieneSensoresCrucero {
        SI, NO
    };

    TieneSensoresCrucero tieneSensoresCrucero;

    public enum TieneAssiPermanencia {
        SI, NO
    };

    TieneAssiPermanencia tieneAssiPermanencia;

    private String marca;
    private String modelo;
    private int cambios;
    private int velocidadMaxima;
    private int cilindraje;
    private int numBolsasAire;

    public Vehiculo(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
            TieneAireAcondicionado tieneAireAcondicionado, TieneCapReversa tieneCapReversa,
            TieneVelCrucero tieneVelCrucero, TieneABS tieneABS, TieneSensoresColision tieneSensoresColision,
            TieneSensoresCrucero tieneSensoresCrucero, TieneAssiPermanencia tieneAssiPermanencia, String marca,
            String modelo, int cambios, int velocidadMaxima, int cilindraje, int numBolsasAire) {
        this.tipoCombustible = tipoCombustible;
        this.tipoTrasmision = tipoTrasmision;
        this.esNuevo = esNuevo;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCapReversa = tieneCapReversa;
        this.tieneVelCrucero = tieneVelCrucero;
        this.tieneABS = tieneABS;
        this.tieneSensoresColision = tieneSensoresColision;
        this.tieneSensoresCrucero = tieneSensoresCrucero;
        this.tieneAssiPermanencia = tieneAssiPermanencia;
        this.marca = marca;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.numBolsasAire = numBolsasAire;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoTrasmision getTipoTrasmision() {
        return tipoTrasmision;
    }

    public void setTipoTrasmision(TipoTrasmision tipoTrasmision) {
        this.tipoTrasmision = tipoTrasmision;
    }

    public EsNuevo getEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(EsNuevo esNuevo) {
        this.esNuevo = esNuevo;
    }

    public TieneAireAcondicionado getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(TieneAireAcondicionado tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public TieneCapReversa getTieneCapReversa() {
        return tieneCapReversa;
    }

    public void setTieneCapReversa(TieneCapReversa tieneCapReversa) {
        this.tieneCapReversa = tieneCapReversa;
    }

    public TieneVelCrucero getTieneVelCrucero() {
        return tieneVelCrucero;
    }

    public void setTieneVelCrucero(TieneVelCrucero tieneVelCrucero) {
        this.tieneVelCrucero = tieneVelCrucero;
    }

    public TieneABS getTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(TieneABS tieneABS) {
        this.tieneABS = tieneABS;
    }

    public TieneSensoresColision getTieneSensoresColision() {
        return tieneSensoresColision;
    }

    public void setTieneSensoresColision(TieneSensoresColision tieneSensoresColision) {
        this.tieneSensoresColision = tieneSensoresColision;
    }

    public TieneSensoresCrucero getTieneSensoresCrucero() {
        return tieneSensoresCrucero;
    }

    public void setTieneSensoresCrucero(TieneSensoresCrucero tieneSensoresCrucero) {
        this.tieneSensoresCrucero = tieneSensoresCrucero;
    }

    public TieneAssiPermanencia getTieneAssiPermanencia() {
        return tieneAssiPermanencia;
    }

    public void setTieneAssiPermanencia(TieneAssiPermanencia tieneAssiPermanencia) {
        this.tieneAssiPermanencia = tieneAssiPermanencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

}
