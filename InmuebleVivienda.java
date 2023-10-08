public class InmuebleVivienda extends Inmueble {
    private int numeroHabitaciones;
    private int numeroBanos;

    public InmuebleVivienda(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                            int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(int numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    protected void imprimir(){
        super.imprimir();
        System.out.println("IdentificadorInmobilario ="+identificadorInmobiliario);
        System.out.println("Area en metros cuadrados ="+areaMetrosCuadrados);
        System.out.println("DIreccion ="+direccion);
       
    }
    protected void imprimirBaños(){
        System.out.println(" Numero de Habitaciones = " +numeroHabitaciones);
        System.out.println("Numero Baños = " +numeroBanos);
    }

}