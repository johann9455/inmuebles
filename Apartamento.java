public class Apartamento extends InmuebleVivienda {

    public Apartamento(int numeroHabitaciones, int numeroBanos) {
        super(numeroHabitaciones, numeroBanos);
    }

    protected void imprimirBaños() {
        super.imprimirBaños(); 
        System.out.println("Numero de Habitaciones = " + this.numeroHabitaciones);
        System.out.println("Numero Baños = " + this.numeroBanos);
    }
}
