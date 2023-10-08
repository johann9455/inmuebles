public  class Inmueble {
    private int identificadorInmobiliario;
    private int areaMetrosCuadrados;
    private String direccion;
    private double precioVenta;

    public Inmueble(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, double precioVenta) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        this.direccion = direccion;
        this.precioVenta = precioVenta;

    } 

    


    public int getIdentificadorInmobiliario() {
        return identificadorInmobiliario;
    }

    public void setIdentificadorInmobiliario(int identificadorInmobiliario) {
        this.identificadorInmobiliario = identificadorInmobiliario;
    }

    public int getAreaMetrosCuadrados() {
        return areaMetrosCuadrados;
    }

    public void setAreaMetrosCuadrados(int areaMetrosCuadrados) {
        this.areaMetrosCuadrados = areaMetrosCuadrados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecioventa(){
        return precioVenta;

    public double setprecioVenta(){
        this.precioVenta = precioVenta;

    }    }
   
    protected double calcularRural(Double valorRural){
        return valorRural = 1500000;
    }  
    protected double calcularConCerrado(Double valorConCerrado){
        return valorConCerrado = 2500000;
    }
    protected double calcularIndependiente(Double valorIndependiente){
        return valorIndependiente = 3000000;

    }
    protected double calcularApartaestudio(Double valorApartaestudio){
        return valorApartaestudio = 1500000;
    }
    protected double calcularFamiliar(Double valorFamiliar){
        return valorFamiliar = 2000000;
    }
    protected void calcularComercial(Double valorComercial){
        return valorComercial = 3000000;

    }
    protected double calcularOficina(Double valorOficina){
        return valorOficina = 3500000;
    }
protected void Imprimir();
        System.out.println("IdentificadorInmobilario ="+identificadorInmobiliario);
        System.out.println("Area en metros cuadrados ="+areaMetrosCuadrados);
        System.out.println("DIreccion ="+direccion);
    }
   

    
