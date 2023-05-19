package Model;

public class Sedan extends Automovil{

    public Sedan(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
            String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
            TieneABS tieneABS, Disponibilidad disponibilidad, int numerosPasajeros, int numeroPuertas, int numBolasAire,
            TieneCamaraReversa tieneCamaraReversa, TieneAireAcondicionado tieneAireAcondicionado,
            TieneVelocidadCrucero tieneVelocidadCrucero, TieneSensorColision tieneSensorColision,
            TIeneSensorCruzado tIeneSensorCruzado, TieneAsistentePerCarril tieneAsistentePerCarril) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision, esNuevo,
                tieneABS, disponibilidad, numerosPasajeros, numeroPuertas, numBolasAire, tieneCamaraReversa,
                tieneAireAcondicionado, tieneVelocidadCrucero, tieneSensorColision, tIeneSensorCruzado,
                tieneAsistentePerCarril);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
    
}
