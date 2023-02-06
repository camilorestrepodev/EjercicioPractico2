import java.util.Date;

public class Dorada extends TarjetaCredito{
    public Dorada(String emisor, long cupo, String numeroTarjeta, int cvv, Date fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
