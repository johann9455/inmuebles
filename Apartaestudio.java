public class Apartaestudio extends Apartamento {
    private double valorArea;

    public Apartaestudio(int numeroHabitaciones, int numeroBanos, double valorArea) {
        super(numeroHabitaciones, numeroBanos);
        this.valorArea = valorArea;
    }

    public double getValorArea() {
        return valorArea;
    }

    public void setValorArea(double valorArea) {
        this.valorArea = valorArea;
    }

    public int calcularPrecioVenta() {
        return (int) (1500000 * valorArea);  // Convertido a int para coincidir con el tipo de retorno
    }

    protected void imprimirBaños() {
        super.imprimirBaños();  
        System.out.println("Numero de Habitaciones = " + this.numeroHabitaciones); 
        System.out.println("Numero Baños = " + this.numeroBanos); 
    }
}
