package Model;

public abstract class AbsAutomovil extends Vehiculo {
    private int numerosPasajeros;
    private int numeroPuertas;
    private int numBolasAire;

    public AbsAutomovil(int numerosPasajeros, int numeroPuertas, int numBolasAire, String marca, String modelo,
            String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
            String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
            TieneABS tieneABS, Disponibilidad disponibilidad) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision,
                esNuevo,
                tieneABS, disponibilidad);
        this.numerosPasajeros = numerosPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numBolasAire = numBolasAire;
    }

    @Override
    public abstract String toString();

    public int getNumerosPasajeros() {
        return numerosPasajeros;
    }

    public void setNumerosPasajeros(int numerosPasajeros) {
        this.numerosPasajeros = numerosPasajeros;
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

    

}
