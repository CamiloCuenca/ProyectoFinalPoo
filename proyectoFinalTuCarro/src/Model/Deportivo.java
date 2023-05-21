package Model;

public class Deportivo extends AbsAutomovil {
    private int caballosDeFuerza;
    private double tiempo100kl;

    public Deportivo(int caballosDeFuerza, double tiempo100kl, int numerosPasajeros, int numeroPuertas,
            int numBolasAire, String marca, String modelo,
            String numPlaca, int cambios, int velocidadMaxima, int cilindraje, String[] fotos,
            TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo, TieneABS tieneABS,
            Disponibilidad disponibilidad) {
        super(numerosPasajeros, numeroPuertas, numBolasAire, marca, modelo, numPlaca, cambios, velocidadMaxima,
                cilindraje,
                fotos, tipoCombustible, tipoTrasmision, esNuevo, tieneABS, disponibilidad);
       this.caballosDeFuerza = caballosDeFuerza;
       this.tiempo100kl = tiempo100kl;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public double getTiempo100kl() {
        return tiempo100kl;
    }

    public void setTiempo100kl(double tiempo100kl) {
        this.tiempo100kl = tiempo100kl;
    }

    

}
