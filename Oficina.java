public class Oficina extends Local {
    private double ValorArea;

    public Oficina(double valorArea) {
        ValorArea = valorArea;
    }

    public double getValorArea() {
        return ValorArea;
    }

    public void setValorArea(double valorArea) {
        ValorArea = valorArea;
    }

    public int calcularPrecioVenta() {
        return 3500000*ValorArea;
    }

    protected void Imprimir(){
        super.Imprimir();
        System.out.println("IdentificadorInmobilario ="+identificadorInmobiliario);
        System.out.println("Area en metros cuadrados ="+areaMetrosCuadrados);
        System.out.println("DIreccion ="+direccion);
    }

}
