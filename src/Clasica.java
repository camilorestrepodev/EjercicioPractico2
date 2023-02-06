
import java.util.Date;

public class Clasica extends TarjetaCredito{
    public Clasica(String emisor, long cupo, String numeroTarjeta, int cvv, Date fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
