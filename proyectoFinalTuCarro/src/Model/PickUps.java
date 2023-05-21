package Model;

public class PickUps extends AbsCamioneta {
    private int capacidadCajaCarga;

    public PickUps(int capacidadCajaCarga, String marca, String modelo, String numPlaca, int cambios,
            int velocidadMaxima,
            int cilindraje,
            String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
            TieneABS tieneABS, Disponibilidad disponibilidad, int numPasajeros, int numeroPuertas, int numBolasAire,
            EscuatroXCuatro escuatroXCuatro, TieneCamaraReversa tieneCamaraReversa,
            TieneAireAcondicionado tieneAireAcondicionado, TieneVelocidadCrucero tieneVelocidadCrucero,
            TieneSensorColision tieneSensorColision, TIeneSensorCruzado tIeneSensorCruzado,
            TieneAsistentePerCarril tieneAsistentePerCarril) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision,
                esNuevo,
                tieneABS, disponibilidad, numPasajeros, numeroPuertas, numBolasAire, escuatroXCuatro,
                tieneCamaraReversa,
                tieneAireAcondicionado, tieneVelocidadCrucero, tieneSensorColision, tIeneSensorCruzado,
                tieneAsistentePerCarril);
        this.capacidadCajaCarga = capacidadCajaCarga;

    }

    @Override
    public String toString() {
        String v = "Camioneta/Sav " + ", \nMarca: "
                + getMarca() + ", \nModelo: "
                + getModelo() + ", \nNumero Placa: "
                + getNumPlaca() + ", \nCambios: "
                + getCambios() + ", \nVelodidadMaxima: "
                + getVelocidadMaxima() + ", \nCilindraje: "
                + getCilindraje() + ", \nTipo Combustible: "
                + getTipoCombustible() + ", \nTipo Trasmisión: "
                + getTipoTrasmision() + "; \n Es nuevo: "
                + getEsNuevo() + ", \nTiene ABS: "
                + getTieneABS() + ", \nDisponibilidad: "
                + getDisponibilidad() + ", \nNumero de pasajeros: "
                + getNumPasajeros() + ", \nNumero de puertas: "
                + getNumeroPuertas() + ",\nNumero de bolsas de aire: "
                + getNumBolasAire() + ", \nCamara de Reversa: "
                + getTieneCamaraReversa() + ", \nAire Acondicionado: "
                + getTieneAireAcondicionado() + ", \nVelocidad Crucero: "
                + getTieneVelocidadCrucero() + ", \nSensor Colisión: "
                + getTieneSensorColision() + ", \nSensor Cruzado: "
                + gettIeneSensorCruzado() + ", \nAsistente de Permanencia: "
                + getTieneAsistentePerCarril() + ", \nCapacidad Caja de Carga: "
                + capacidadCajaCarga;

        return v;
    }

    public int getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(int capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

}
