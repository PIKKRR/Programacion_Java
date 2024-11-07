package Clases_Abstractas.Factura;

public abstract class Factura {

    // Atributos
    private int nfactura;
    private int importe;
    private int iva;
    private String detalle;
    private int totalFinal;

    // Constructor
    public Factura(int nfactura, int importe, int iva, String detalle, int totalFinal) {
        this.nfactura = nfactura;
        this.importe = importe;
        this.iva = iva;
        this.detalle = detalle;
        this.totalFinal = totalFinal;
    }

    //Getters y Setters

    public int getNfactura() {
        return nfactura;
    }

    public void setNfactura(int nfactura) {
        this.nfactura=nfactura;
    } 

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getTotalFinal() {
        return totalFinal;
    }


    //Métodos

    public void getMostrarDatos(){
        System.out.println("El número de factura es " + nfactura + 
        "\n El importe es: " + importe + " euros" + 
        "\n El IVA del producto es: " + iva + " euros" + 
        "\n El detalle es: " + detalle + 
        "\n El total final sería: " + totalFinal + " euros");
    }
    public void getCalcularIva(){
       iva = (int) (importe * 0.21);
    }
    public void getTotalFinalconIva(){
        getCalcularIva();
        totalFinal = importe + iva;
    }
}