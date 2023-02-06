import java.util.Date;

public class Black extends TarjetaCredito{
    public Black(String emisor, long cupo, String numeroTarjeta, int cvv, Date fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }
}
