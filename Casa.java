public class Casa extends InmuebleVivienda {
    private int cantidadPisos;

    public Casa(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                int numeroHabitaciones, int numeroBanos, int cantidadPisos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numeroHabitaciones, numeroBanos);
        this.cantidadPisos = cantidadPisos;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cantidad de pisos: " + cantidadPisos);
    }

    public void imprimirCantidadPisos() {
        System.out.println("Cantidad de pisos: " + cantidadPisos);
    }
}
