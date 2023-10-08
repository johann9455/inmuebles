public class CasaRural extends Casa {
    private int distanciaCabeceraMunicipal;
    private int altitudSobreNivelMar;
    private double valorArea;

    public CasaRural(int cantidadPisos,double distanciaCabeceraMunicipal, double altitudSobreNivelMar) {
        super(cantidadPisos);
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        this.altitudSobreNivelMar = altitudSobreNivelMar;
    }

    public int getDistanciaCabeceraMunicipal() {
        return distanciaCabeceraMunicipal;
    }

    public void setDistanciaCabeceraMunicipal(int distanciaCabeceraMunicipal) {
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
    }

    public int getAltitudSobreNivelMar() {
        return altitudSobreNivelMar;
    }

    public void setAltitudSobreNivelMar(int altitudSobreNivelMar) {
        this.altitudSobreNivelMar = altitudSobreNivelMar;
    }

    public double getValorArea() {
        return valorArea;
    }

    public void setValorArea(double valorArea) {
        this.valorArea = valorArea;
    }

    public int calcularPrecioVenta() {
        return 1500000*valorArea;
    }

    protected void imprimir(){
        super.imprimir();
        System.out.println("IdentificadorInmobilario ="+identificadorInmobiliario);
        System.out.println("Area en metros cuadrados ="+areaMetrosCuadrados);
        System.out.println("DIreccion ="+direccion);
    
    }

    protected void imprimirRural(){
        System.out.println("Cual es la distancia a la cabecera municipal "+distanciaCabeceraMunicipal);
        System.out.println("Metros sobre el nivel del mar"+altitudSobreNivelMar);
        System.out.println("ingrese el valor del area"+valorArea);

    } 
    }