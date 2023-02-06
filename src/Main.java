import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date miFechaVencimiento = new Date(116,5,3);
        Date miFechaVencimiento1 = new Date(117,6,4);
        Date miFechaVencimiento2 = new Date(118,7,5);
        Date miFechaVencimiento3 = new Date(119,8,6);
        TarjetaCredito miClasica = new TarjetaCredito("Visa", 2337895L, "15426",234,miFechaVencimiento);
        TarjetaCredito miDorada = new TarjetaCredito("MasterCard", 4567894L,"45678",123,miFechaVencimiento1);
        TarjetaCredito miPlatinum = new TarjetaCredito("American Express", 4567894L,"12345",456,miFechaVencimiento2);
        TarjetaCredito miBlack = new TarjetaCredito("Visa", 456789L, "78945", 789,miFechaVencimiento3);
        miClasica.imprimir();
        miDorada.imprimir();
        miPlatinum.imprimir();
        miBlack.imprimir();
    }
}