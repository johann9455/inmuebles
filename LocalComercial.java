public class LocalComercial extends Local {
    private double valorArea;
    private String centroComercial;
   
    public LocalComercial(double valorArea, String centroComercial) {
        this.valorArea = valorArea;
        this.centroComercial = centroComercial;
    }

    public double getValorArea() {
        return valorArea;
    }

    public void setValorArea(double valorArea) {
        this.valorArea = valorArea;
    }

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }
    
    public int calcularPrecioVenta() {
        return 3000000*valorArea; 
    }


    protected void Imprimir(){
        super.Imprimir();
        System.out.println("IdentificadorInmobilario ="+identificadorInmobiliario);
        System.out.println("Area en metros cuadrados ="+areaMetrosCuadrados);
        System.out.println("DIreccion ="+direccion);
    }
}
