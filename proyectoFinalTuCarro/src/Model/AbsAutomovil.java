package Model;

public abstract class AbsAutomovil extends Vehiculo {
    private int numerosPasajeros;
    private int numeroPuertas;
    private int numBolasAire;

    public AbsAutomovil(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
            int numerosPasajeros, int numeroPuertas, int numBolasAire,
            String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
            Disponibilidad disponibilidad) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision,
                esNuevo,
                disponibilidad);
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
