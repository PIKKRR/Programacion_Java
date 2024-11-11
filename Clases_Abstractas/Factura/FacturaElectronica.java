package Clases_Abstractas.Factura;

public class FacturaElectronica extends Factura {
    public FacturaElectronica(int nfactura, int importe, int iva, String detalle, int totalFinal) {
        super(nfactura, importe, iva, detalle, totalFinal);
    }
}