import java.time.LocalDate;
import java.util.Date;

public class TarjetaCredito {
    // Clase: TarjetaCredito
    // Atributos de la clase
    private String emisor;
    private long cupo;
    private String numeroTarjeta;
    private int cvv;
    private Date fechaVencimiento;

    public TarjetaCredito() {
    }

    public TarjetaCredito(String emisor, long cupo, String numeroTarjeta, int cvv, Date fechaVencimiento) {
        this.emisor = emisor;
        this.cupo = cupo;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEmisor() {
        return emisor;
    }

    public long getCupo() {
        return cupo;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setCupo(long cupo) {
        this.cupo = cupo;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void imprimir(){
        String emisor = getEmisor();
        long cupo = getCupo();
        String numeroTarjeta = getNumeroTarjeta();
        int cvv = getCvv();
        Date fechaVencimiento = getFechaVencimiento();
        System.out.println("El emisor es: " + emisor + " su cupo es de: " + cupo + " el numero de tarjeta es: " + numeroTarjeta + " su clave es: " + cvv + " su fecha de vencimiento es: " + fechaVencimiento);
    }
}



