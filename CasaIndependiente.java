public class CasaIndependiente extends CasaUrbana {
 private double valorArea;
    
   
    public CasaIndependiente(double valorArea) {
    this.valorArea = valorArea;

    
}

    public double getValorArea() {
        return valorArea;
    }


    public void setValorArea(double valorArea) {
        this.valorArea = valorArea;
    }
    
    public int calcularPrecioVenta() {
        return 3000000*valorArea;
    }

    protected void imprimir(){
        super.imprimir();
        System.out.println("IdentificadorInmobilario ="+identificadorInmobiliario);
        System.out.println("Area en metros cuadrados ="+areaMetrosCuadrados);
        System.out.println("DIreccion ="+direccion);
}

    protected void ImprimiCasaIndependiente(){
        System.out.println("Ingrese el valor del area"+valorArea);
    }
}
