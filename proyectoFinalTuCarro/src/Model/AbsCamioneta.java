package Model;

public abstract class AbsCamioneta extends Vehiculo {
    private int numPasajeros;
    private int numeroPuertas;
    private int numBolasAire;

    public enum EscuatroXCuatro {
        SI, NO
    };

    EscuatroXCuatro escuatroXCuatro;

    public enum TieneCamaraReversa {
        SI, NO
    };

    TieneCamaraReversa tieneCamaraReversa;

    public enum TieneAireAcondicionado {
        SI, NO
    };

    TieneAireAcondicionado tieneAireAcondicionado;

    public enum TieneVelocidadCrucero {
        SI, NO
    };

    TieneVelocidadCrucero tieneVelocidadCrucero;

    public enum TieneSensorColision {
        SI, NO
    };

    TieneSensorColision tieneSensorColision;

    public enum TIeneSensorCruzado {
        SI, NO
    };

    TIeneSensorCruzado tIeneSensorCruzado;

    public enum TieneAsistentePerCarril {
        SI, NO
    };

    TieneAsistentePerCarril tieneAsistentePerCarril;

    public AbsCamioneta(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
            String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
            TieneABS tieneABS, Disponibilidad disponibilidad, int numPasajeros, int numeroPuertas, int numBolasAire,
            EscuatroXCuatro escuatroXCuatro, TieneCamaraReversa tieneCamaraReversa,
            TieneAireAcondicionado tieneAireAcondicionado, TieneVelocidadCrucero tieneVelocidadCrucero,
            TieneSensorColision tieneSensorColision, TIeneSensorCruzado tIeneSensorCruzado,
            TieneAsistentePerCarril tieneAsistentePerCarril) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision,
                esNuevo, tieneABS, disponibilidad);
        this.numPasajeros = numPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numBolasAire = numBolasAire;
        this.escuatroXCuatro = escuatroXCuatro;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.tieneSensorColision = tieneSensorColision;
        this.tIeneSensorCruzado = tIeneSensorCruzado;
        this.tieneAsistentePerCarril = tieneAsistentePerCarril;
    }

    @Override
    public abstract String toString();

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumBolasAire() {
        return numBolasAire;
    }

    public void setNumBolasAire(int numBolasAire) {
        this.numBolasAire = numBolasAire;
    }

    public EscuatroXCuatro getEscuatroXCuatro() {
        return escuatroXCuatro;
    }

    public void setEscuatroXCuatro(EscuatroXCuatro escuatroXCuatro) {
        this.escuatroXCuatro = escuatroXCuatro;
    }

    public TieneCamaraReversa getTieneCamaraReversa() {
        return tieneCamaraReversa;
    }

    public void setTieneCamaraReversa(TieneCamaraReversa tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }

    public TieneAireAcondicionado getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(TieneAireAcondicionado tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public TieneVelocidadCrucero getTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }

    public void setTieneVelocidadCrucero(TieneVelocidadCrucero tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
    }

    public TieneSensorColision getTieneSensorColision() {
        return tieneSensorColision;
    }

    public void setTieneSensorColision(TieneSensorColision tieneSensorColision) {
        this.tieneSensorColision = tieneSensorColision;
    }

    public TIeneSensorCruzado gettIeneSensorCruzado() {
        return tIeneSensorCruzado;
    }

    public void settIeneSensorCruzado(TIeneSensorCruzado tIeneSensorCruzado) {
        this.tIeneSensorCruzado = tIeneSensorCruzado;
    }

    public TieneAsistentePerCarril getTieneAsistentePerCarril() {
        return tieneAsistentePerCarril;
    }

    public void setTieneAsistentePerCarril(TieneAsistentePerCarril tieneAsistentePerCarril) {
        this.tieneAsistentePerCarril = tieneAsistentePerCarril;
    }

    

}
