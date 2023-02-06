import java.util.Date;

public class Platinum extends TarjetaCredito{
    public Platinum(String emisor, long cupo, String numeroTarjeta, int cvv, Date fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
